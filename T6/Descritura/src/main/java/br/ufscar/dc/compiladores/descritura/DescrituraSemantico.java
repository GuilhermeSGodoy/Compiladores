package br.ufscar.dc.compiladores.descritura;

import static br.ufscar.dc.compiladores.descritura.TabelaDeSimbolos.TipoDescritura;
import static br.ufscar.dc.compiladores.descritura.DescrituraUtils.converteTitulo;
import static br.ufscar.dc.compiladores.descritura.DescrituraUtils.adicionaErroSemLinha;
import static br.ufscar.dc.compiladores.descritura.DescrituraUtils.adicionaErroSemantico;
import static br.ufscar.dc.compiladores.descritura.DescrituraUtils.ordemElementos;
import static br.ufscar.dc.compiladores.descritura.DescrituraUtils.removeAspas;
import java.util.ArrayList;
import java.util.List;

public class DescrituraSemantico extends gramaticaBaseVisitor<Void> {
    // Inicialização da tabela de símbolos e dos escopos utilizados para tratar as "variáveis" declaradas.
    TabelaDeSimbolos tabela;
    Escopos escoposAninhados = new Escopos();
    
    // Estrutura auxiliar que armazenará os elementos declarados no arquivo de entrada, na ordem em que
    // foram apresentados.
    List<String> listaElementos = new ArrayList<>();
    // Estrutura auxiliar que armazenará os elementos na ordem em que aparecem nos capítulos, para
    // verificar possíveis inconsistências.
    List<String> listaElementosCapitulo = new ArrayList<>();
    
    // Estrutura auxiliar que armazenará os elementos que foram de fato utilizados no arquivo de entrada.
    List<String> utilizados = new ArrayList<>();
    // Estrutura auxiliar que armazenará os elementos que foram declarados, mas não utilizados no arquivo de
    // entrada, para exibição de uma mensagem de erro.
    List<String> naoUtilizados = new ArrayList<>();
    
    // Lista auxiliar utilizada para identificar os trechos do código de entrada que contêm erros, para que
    // possa ser informado na saída em html.
    // Para esta lista, foi adotada uma estratégia de identificar erros nos principais trechos do código de
    // entrada, que são as declarações de Estrutura, Personagens e Capítulos, e incluir o tipo referente a área
    // cujo erro foi encontrado apenas uma vez, para que possa ser exibido no html sem repetições.
    public static List<TipoDescritura> errosEncontrados = new ArrayList<>();
    
    @Override
    public Void visitPrograma(gramaticaParser.ProgramaContext ctx) {
        // Criação da tabela de símbolos e inicialização do programa.
        tabela = new TabelaDeSimbolos();
        return super.visitPrograma(ctx);
    }
    
    @Override
    public Void visitEstrutura(gramaticaParser.EstruturaContext ctx) {
        // Criação de um novo escopo no momento em que é iniciada a verificação do programa.
        escoposAninhados.criarNovoEscopo();
        tabela = escoposAninhados.obterEscopoAtual();

        // Adição do identificador da estrutura na tabela.
        String nomeEstrutura = ctx.IDENTIFICADOR().getText();
        tabela.adicionar(nomeEstrutura, TipoDescritura.ESTRUTURA);
        
        // String auxiliar que armazenará o nome do arquétipo que será adicionado à tabela.
        String arqAux;
        
        // Loop para percorrer os arquétipos que foram declarados.
        for (int i = 0; i < ctx.arquetipos().CADEIA().size(); i++) {
            // Obtenção do nome do arquétipo no formato no qual será adicionado na tabela.
            arqAux = converteTitulo(removeAspas(ctx.arquetipos().CADEIA().get(i).getText()));
            
            // Caso o arquétipo já exista na tabela, adiciona a mensagem de erro informando
            // a declaração repetida.
            if (tabela.existe(arqAux)) {
                adicionaErroSemantico(ctx.arquetipos().getStart(), "O arquetipo \"" + arqAux + "\" ja foi definido anteriomente.");
                
                // Adiciona um erro do tipo adequado e sem repetições.
                if (!errosEncontrados.contains(TipoDescritura.ESTRUTURA)) {
                    errosEncontrados.add(TipoDescritura.ESTRUTURA);
                }
            } else { // Caso contrário, adiciona o arquétipo na tabela.
                tabela.adicionar(arqAux, TipoDescritura.ARQUETIPO);
            }            
        }
        
        // String auxiliar que armazenará o nome do elemento que será adicionado à tabela.
        String eleAux;

        // Loop para percorrer a lista de elementos declarados.
        for (int i = 0; i < ctx.elementos().CADEIA().size(); i++) {
            // Obtenção do nome do elemento no formato no qual será adicionado na tabela.
            eleAux = converteTitulo(removeAspas(ctx.elementos().CADEIA().get(i).getText()));
            
            // Adiciona o elemento à lista, ignorando possíveis valores repetidos que possam
            // ter sido declarados por engano.
            if (!listaElementos.contains(eleAux)) {
                listaElementos.add(eleAux);
            }

            // Caso o elemento já exista na tabela, adiciona a mensagem de erro informando
            // a declaração repetida.
            if (tabela.existe(eleAux)) {
                adicionaErroSemantico(ctx.elementos().getStart(), "O elemento \"" + eleAux + "\" já foi definido anteriomente.");
                
                // Adiciona um erro do tipo adequado e sem repetições.
                if (!errosEncontrados.contains(TipoDescritura.ESTRUTURA)) {
                    errosEncontrados.add(TipoDescritura.ESTRUTURA);
                }
            } else { // Caso contrário, adiciona o elemento na tabela.
                tabela.adicionar(eleAux, TipoDescritura.ELEMENTO);
            }
        }
        
        return super.visitEstrutura(ctx);
    }
    
    
    @Override
    public Void visitHistoria(gramaticaParser.HistoriaContext ctx) {
        // Visitação da declaração de personagens.     
        for (gramaticaParser.DeclaracaoGlobalContext dec : ctx.declaracaoGlobal()) {
            visitDeclaracaoGlobal(dec);
        }
        
        // Visitação da declaração de capítulos.
        for (gramaticaParser.CapituloContext cap : ctx.capitulo()) {
            visitCapitulo(cap);
        }

        // Caso as listas tenham tamanhos diferentes, é informado que há uma discrepância entre elas.
        if (listaElementos.size() != listaElementosCapitulo.size()) {
            adicionaErroSemLinha("\nHá uma discrepancia entre os elementos declarados e os que foram apresentados nos capítulos.");
            
            // Adiciona um erro do tipo adequado e sem repetições.
            if (!errosEncontrados.contains(TipoDescritura.ESTRUTURA)) {
                errosEncontrados.add(TipoDescritura.ESTRUTURA);
            }
            
        // Caso as listas tenham o mesmo tamanho, é verificada a consistência entre elas.
        } else if (!ordemElementos(listaElementos, listaElementosCapitulo)) {
            adicionaErroSemLinha("\nOs elementos apresentados nos capítulos não estão na ordem na qual foram declarados.");
            
            // Adiciona um erro do tipo adequado e sem repetições.
            if (!errosEncontrados.contains(TipoDescritura.ESTRUTURA)) {
                errosEncontrados.add(TipoDescritura.ESTRUTURA);
            }
        }
        
        // Ao final da verificação do programa, há a identificação dos elementos que não foram utilizados.
        for (int i = 0; i < tabela.tamanho(); i++) {
            // Capítulos e estruturas não são utilizados nesta verificação, pois são estruturas declarativas que
            // compõem o programa, de forma que não faz sentido verificar se não estão sendo utilizados.
            if (tabela.verificar(tabela.elemento(i))!= TipoDescritura.CAPITULO && tabela.verificar(tabela.elemento(i))!= TipoDescritura.ESTRUTURA) {
                // Caso o elemento da tabela não esteja presente na lista de valores utilizados, ele é adicionado
                // na lista de valores não utilizados.
                if (!utilizados.contains(tabela.elemento(i))) {
                    naoUtilizados.add(tabela.elemento(i));
                }
            }
        }
        
        // String auxiliar que armanzena o nome do valor não utilizado.  
        String nUtil;
                
        // Caso existam valores que não foram utilizados ao longo do programa, são exibidas
        // mensagens personalizadas que informam seus tipos e quais são estes valores.
        if (!naoUtilizados.isEmpty()) {
            // Caso apenas um único valor não tenha sido utilizado, é exibida uma mensagem no singular
            // referente ao tipo do valor em questão.
            if (naoUtilizados.size() == 1) {
                nUtil = converteTitulo(naoUtilizados.get(0));
                
                // Verificação de cada tipo e exibição da mensagem adequada.
                if (tabela.verificar(nUtil) == TipoDescritura.ARQUETIPO) {
                    adicionaErroSemLinha("\nAtenção! O arquétipo \"" + nUtil + "\" não foi utilizado em nenhum momento.");
                } else if (tabela.verificar(nUtil) == TipoDescritura.ELEMENTO) {
                    adicionaErroSemLinha("\nAtenção! O elemento \"" + nUtil + "\" não foi utilizado em nenhum momento.");
                } else if (tabela.verificar(nUtil) == TipoDescritura.PERSONAGEM) {
                    adicionaErroSemLinha("\nAtenção! O personagem \"" + nUtil + "\" não foi utilizado em nenhum momento.");
                }
            // Caso haja mais de um valor na lista, são verificados as quantidades referentes a cada um dos tipos
            // para a exibição de mensagens adequadas.
            } else {
                // Inicialização de variáveis utilizadas para contar a quantidade de valores de cada tipo.
                int contArq, contEle, contPer;
                contArq = contEle = contPer = 0;
                
                // Inicialização das strings utilizadas para a manipulação das mensagens de erro.
                String mensagemErro = "\nAtencao! Os seguintes dados foram declarados e nao utilizados:\n";
                String msgArq, msgEle, msgPer;
                msgArq = msgEle = msgPer = null;
                
                // É feita uma varredura dentre os valores que não foram utilizados.
                for (int i = 0; i < naoUtilizados.size(); i++) {
                    nUtil = converteTitulo(naoUtilizados.get(i));
                    
                    // São verificados os tipos de cada valor não utilizado, de modo que seja possível
                    // adicionar seus respectivos nomes à mensagem de erro, além de verificações referentes
                    // à formatação da mensagem, a partir da verificação do valor no contador para identificar
                    // a necessidade de utilização de vírgulas para separá-los.
                    if (tabela.verificar(nUtil) == TipoDescritura.ARQUETIPO) {
                        // Caso seja o primeiro valor deste tipo, o contador é incrementado e a mensagem
                        // de erro recebe seu nome.
                        if (contArq == 0) {
                            msgArq = nUtil;
                            contArq++;
                        // Caso hajam mais valores de um mesmo tipo, eles são adicionados à mensagem de
                        // erro de maneira que fiquem separados por vírgula.
                        } else {
                            msgArq = msgArq + ", " + nUtil;
                        }
                    } else if (tabela.verificar(nUtil) == TipoDescritura.ELEMENTO) {
                        if (contEle == 0) {
                            msgEle = nUtil;
                            contEle++;
                        } else {
                            msgEle = msgEle + ", " + nUtil;
                        }
                    } else if (tabela.verificar(nUtil) == TipoDescritura.PERSONAGEM) {
                        if (contPer == 0) {
                            msgPer = nUtil;
                            contPer++;
                        } else {
                            msgPer = msgPer + ", " + nUtil;
                        }
                    } 
                }
                
                // Caso hajam valores não utilizados de um determinado tipo, são formadas
                // as mensagens adequadas.
                if (contArq > 0) {
                    mensagemErro = mensagemErro + "Arquetipos: " + msgArq + "\n";
                }
                
                if (contEle > 0) {
                    mensagemErro = mensagemErro + "Elementos: " + msgEle + "\n";
                }
                
                if (contPer > 0) {
                    mensagemErro = mensagemErro + "Personagens: " + msgPer + "\n";
                }
                
                adicionaErroSemLinha(mensagemErro);
            }
        }
         
        return null;
    }
    
    @Override
    public Void visitDeclaracaoGlobal(gramaticaParser.DeclaracaoGlobalContext ctx) {
        // String auxiliar que armanzena o identificador do personagem atual.  
        String idPers = ctx.personagem().IDENTIFICADOR().getText();

        // Caso um personagem já tenha sido adicionado à tabela, é adicionado o erro
        // referente à sua declaração repetida.
        if (tabela.existe(idPers)) {
            adicionaErroSemantico(ctx.getStart(), "O personagem " + idPers + " já foi declarado anteriomente.");
            
            // Adiciona um erro do tipo adequado e sem repetições.
            if (!errosEncontrados.contains(TipoDescritura.PERSONAGEM)) {
                errosEncontrados.add(TipoDescritura.PERSONAGEM);
            }
        } else { // Caso contrário, o adiciona na tabela.
            tabela.adicionar(idPers, TipoDescritura.PERSONAGEM);
        }

        // String auxiliar que armaneza o arquétipo do personagem atual.
        String arqAux = converteTitulo(removeAspas(ctx.personagem().arquetipo().CADEIA().getText()));

        // Caso o arquétipo não exista na tabela, é informado que ele não foi declarado.
        if (!tabela.existe(arqAux)) {
            adicionaErroSemantico(ctx.personagem().arquetipo().getStart(), "O arquétipo \"" + arqAux + "\" não foi declarado anteriomente.");
        } else {
            // Caso o valor exista na tabela, é verificado se ele é um arquétipo de fato.
            if (tabela.verificar(arqAux) != TipoDescritura.ARQUETIPO) {
                adicionaErroSemantico(ctx.personagem().arquetipo().getStart(), "\"" + arqAux + "\" não é um arquetipo.");
                
                // Adiciona um erro do tipo adequado e sem repetições.
                if (!errosEncontrados.contains(TipoDescritura.PERSONAGEM)) {
                    errosEncontrados.add(TipoDescritura.PERSONAGEM);
                }
            } else {
                // Adiciona o valor na lista de utilizados.
                if (!utilizados.contains(arqAux)) {
                    utilizados.add(arqAux);
                }
            }
        }

        return null;
    }
    
    @Override
    public Void visitCapitulo(gramaticaParser.CapituloContext ctx) {
        // String auxiliar que armazena o identificador do capítulo atual.
        String idCap = ctx.IDENTIFICADOR().getText();
        
        // String auxiliar que armazena o nome do capítulo atual.
        String nomeCap = removeAspas(ctx.nome().CADEIA().getText());
        
        // Caso o capítulo já exista na tabela, é exibido o erro de declaração repetida.
        if (tabela.existe(idCap)) {
            adicionaErroSemantico(ctx.getStart(), "O capitulo " + idCap + " ja foi declarado anteriomente.");   
            
            // Adiciona um erro do tipo adequado e sem repetições.
            if (!errosEncontrados.contains(TipoDescritura.CAPITULO)) {
                errosEncontrados.add(TipoDescritura.CAPITULO);
            }
        } else { // Caso contrário, o capítulo é adicionado à tabela.
            tabela.adicionar(idCap, TipoDescritura.CAPITULO);
        } 
        
        // String auxiliar que armazena o identificador do personagem atual.
        String idPers;
        
        // Percorre a lista de personagens para identificar possíveis erros.
        for (int i = 0; i < ctx.personagens().personagemDec().size(); i++) {
            idPers = ctx.personagens().personagemDec().get(i).getText();
            
            // Caso o identificador não exista na tabela, é informado que o personagem não foi declarado.
            if (!tabela.existe(idPers)) {
                adicionaErroSemantico(ctx.personagens().getStart(), "O personagem " + idPers + " não foi declarado anteriomente.");
                
                // Adiciona um erro do tipo adequado e sem repetições.
                if (!errosEncontrados.contains(TipoDescritura.CAPITULO)) {
                    errosEncontrados.add(TipoDescritura.CAPITULO);
                }
            }
        }
        
        // String auxiliar que armazena o nome dos elementos do capítulo atual.
        String nomeElem;
        
        // Percorre a lista de elementos para identificar possíveis erros.
        for (int i = 0; i < ctx.elemento().CADEIA().size(); i++) {
            nomeElem = converteTitulo(removeAspas(ctx.elemento().CADEIA().get(i).getText()));
            
            // Caso o elemento não exista na tabela, é informado que o elemento não foi declarado.
            if (!tabela.existe(nomeElem)) {
                adicionaErroSemantico(ctx.elemento().getStart(), "O elemento \"" + nomeElem + "\" não foi declarado anteriomente.");
            } else {
                // Caso o valor exista na tabela, é verificado se ele é um elemento de fato.
                if (tabela.verificar(nomeElem) != TipoDescritura.ELEMENTO) {
                    adicionaErroSemantico(ctx.elemento().getStart(), "\"" + nomeElem + "\" nao é um elemento.");
                    
                    // Adiciona um erro do tipo adequado e sem repetições.
                    if (!errosEncontrados.contains(TipoDescritura.CAPITULO)) {
                        errosEncontrados.add(TipoDescritura.CAPITULO);
                    }
                } else {
                    // Adiciona o valor na lista de elementos declarados no capítulo, de forma
                    // que mantém a ordem de apresentação.
                    listaElementosCapitulo.add(nomeElem);
                    
                    // Adiciona o valor na lista de utilizados.
                    if (!utilizados.contains(nomeElem)) {
                        utilizados.add(nomeElem);
                    }
                } 
            }
        }
        
        // Considerando que um mesmo elemento pode ser parte de mais de um capítulo de forma contínua, ou seja,
        // o capítulo encerra com este elemento e é iniciado com o próximo elemento, é feita uma verificação
        // que busca estes valores repetidos consecutivamente para que possam ser removidos, possibilitando a 
        // verificação correta com os elementos que foram declarados na inicialização da estrutura.
        for (int i = 1; i < listaElementosCapitulo.size(); i++) {
            if (listaElementosCapitulo.get(i - 1).contentEquals(listaElementosCapitulo.get(i))) {
                listaElementosCapitulo.remove(i);
            }
        }
        
        // A partir daqui, é inicializado um novo escopo utilizado para as verificações internas do
        // capítulo.
        escoposAninhados.criarNovoEscopo();
        tabela = escoposAninhados.obterEscopoAtual();
        
        // Loop para percorrer a lista de personagens para identificar possíveis erros nas declarações
        // internas.
        for (int i = 0; i < ctx.personagens().personagemDec().size(); i++) {
            idPers = ctx.personagens().personagemDec().get(i).getText();
                
            // Caso o personagem ainda não exista no escopo do capítulo atual, ele é adicionado à tabela.
            if (!tabela.existe(idPers)) {
                tabela.adicionar(idPers, TipoDescritura.PERSONAGEM);
                
                // Adiciona o personagem à lista de utilizados.
                if (!utilizados.contains(idPers)) {
                    utilizados.add(idPers);
                }
            // Caso o personagem já exista na tabela, é informado que o personagem foi declarado mais de uma vez
            // no capítulo atual.
            } else {
                adicionaErroSemantico(ctx.personagens().getStart(), "O personagem " + idPers + " já foi declarado no capítulo " + idCap + " (" + nomeCap + ").");
                
                // Adiciona um erro do tipo adequado e sem repetições.
                if (!errosEncontrados.contains(TipoDescritura.CAPITULO)) {
                    errosEncontrados.add(TipoDescritura.CAPITULO);
                }
            }
        }
        
        // Loop para percorrer a lista de elementos para identificar possíveis erros nas declarações
        // internas.
        for (int i = 0; i < ctx.elemento().CADEIA().size(); i++) {
            nomeElem = converteTitulo(removeAspas(ctx.elemento().CADEIA().get(i).getText()));

            // Caso o elemento ainda não exista no escopo do capítulo atual, ele é adicionado à tabela.
            if (!tabela.existe(nomeElem)) {
                tabela.adicionar(nomeElem, TipoDescritura.ELEMENTO);
            } else {
            // Caso o elemento já exista na tabela, é informado que o elemento foi declarado mais de uma vez
            // no capítulo atual.
                adicionaErroSemantico(ctx.elemento().getStart(), "O elemento \"" + nomeElem + "\" já foi declarado no capítulo " + idCap + " (" + nomeCap + ").");
               
                // Adiciona um erro do tipo adequado e sem repetições.
                if (!errosEncontrados.contains(TipoDescritura.CAPITULO)) {
                    errosEncontrados.add(TipoDescritura.CAPITULO);
                }
            }
        }
        
        // Abandona o escopo criado para as verificações internas do capítulo e retorna ao
        // escopo original.
        escoposAninhados.abandonarEscopo();
        tabela = escoposAninhados.obterEscopoAtual();
                
        return null;
    }
}
