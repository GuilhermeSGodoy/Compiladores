package br.ufscar.dc.compiladores.descritura;

import static br.ufscar.dc.compiladores.descritura.DescrituraUtils.converteTitulo;
import static br.ufscar.dc.compiladores.descritura.DescrituraUtils.removeAspas;
import br.ufscar.dc.compiladores.descritura.TabelaDeSimbolos.TipoDescritura;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.TerminalNode;

public class GeradorHTML extends gramaticaBaseVisitor<Void> {
    // String utilizada ao longo da execução para gerar o código de saída.
    StringBuilder saida;
    
    // Inicialização da tabela de símbolos utilizada para verificações ao longo da geração.
    TabelaDeSimbolos tabela;
    
    // Estrutura auxiliar utilizada para armazenar uma lista com os
    // personagens presentes em cada capítulo.
    Map<String, List<String>> persPorCap = new HashMap<>();
    // Estrutura auxiliar utilizada para armazenar uma lista com os
    // elementos presentes em cada capítulo.
    Map<String, List<String>> elePorCap = new HashMap<>();
    // Estrutura auxiliar utilizada para armazenar os identificadores
    // dos personagens e seus respectivos nomes.
    Map<String, String> nomesPers = new HashMap<>();
    
    // Contador utilizado para verificar a quantidade de capítulos, utilizado
    // no arquivo html de saída.
    int qtdeCap = 0;
    // Contador utilizado para verificar a quantidade de personagens, utilizado
    // no arquivo html de saída.
    int qtdePers = 0;
    
    // Inicialização da string do código.
    public GeradorHTML() {
        saida = new StringBuilder();
        this.tabela = new TabelaDeSimbolos();
    }
        
    @Override
    public Void visitPrograma(gramaticaParser.ProgramaContext ctx) {
        // Tags básicas do html.
        saida.append("<!DOCTYPE html>\n");
        saida.append("<html>\n");
        saida.append("<head>\n");
        
        // Título da história que será exibido na aba do navegador.
        saida.append("<title>");
        saida.append(converteTitulo(removeAspas(ctx.historia().nome().CADEIA().getText())));
        saida.append("</title>\n");
        saida.append("<meta charset=\"UTF-8\">\n");
        saida.append("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
        saida.append("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js\"></script>\n");
        saida.append("</head>\n");
        
        // Atributos básicos pré-definidos de css para o html.
        saida.append("<style>\n");
        saida.append("table, th, td {\n");
        saida.append("border: 1px solid black;\n");
        saida.append("border-collapse: collapse;\n");
        saida.append("}\n");
        
        saida.append("th, td {\n");
        saida.append("padding-left: 5px;\n");
        saida.append("padding-right: 5px;\n");
        saida.append("padding-top: 5px;\n");
        saida.append("padding-bottom: 5px;\n");
        saida.append("}\n");
        
        saida.append("h1, h2, h3, h4, h5, h6, .h1, .h2, .h3, .h4, .h5, .h6 {\n");
        saida.append("font-family: \"Noto Serif\", sans-serif;\n");
        saida.append("font-weight: bold\n");
        saida.append("}\n");
        
        saida.append("p, li, th, td {\n");
        saida.append("font-family: \"Noto Serif\", sans-serif;\n");
        saida.append("}\n");
        
        saida.append("</style>\n");
        saida.append("<body>\n");
        
        // Exibição das informações básicas da história.
        saida.append("<div class=\"container-fluid p-5 bg-success text-white text-center\">\n");
        
        // Exibição do nome da história como título principal.
        saida.append("<h1 class=\"h1\">");
        saida.append(converteTitulo(removeAspas(ctx.historia().nome().CADEIA().getText())));
        saida.append("</h1>\n");
        saida.append("<h4 class=\"h4\">");

        // Exibição dos nomes dos autores.
        int qtdeAutores = ctx.historia().nomeAutor().get(0).CADEIA().size();
        
        // Caso haja mais do que um autor, ocorre um loop para exibir os nomes formatados
        // adequadamente.
        if (qtdeAutores > 1) {
            for (int i = 0; i < qtdeAutores; i++) {
                saida.append(converteTitulo(removeAspas(ctx.historia().nomeAutor().get(0).CADEIA().get(i).getText())));
                
                // Verificação necessária para adicionar vírgulas entre os nomes dos autores.
                if (i + 1 != qtdeAutores) {
                    saida.append(", ");
                }
            }
        } else {
            saida.append(converteTitulo(removeAspas(ctx.historia().nomeAutor().get(0).CADEIA().get(0).getText())));
        }
        
        saida.append("</h4>\n");
        
        // Verificação da existência dos atributos opcionais.
        if (ctx.historia().versaoRascunho() != null) {
            saida.append("<br><p> Versão do Rascunho: ");
            saida.append(removeAspas(ctx.historia().versaoRascunho().CADEIA().getText()));
            saida.append("</p>\n");
        }
        
        if (ctx.historia().data() != null) {
            saida.append("<p>Data da última atualização: ");
            saida.append(removeAspas(ctx.historia().data().CADEIA().getText()));
            saida.append("</p>\n");
        }
        
        saida.append("</div>\n");
        
        // Inclusão de uma barra de navegação para as seções da página gerada.
        saida.append("<nav class=\"navbar navbar-expand-sm bg-dark navbar-dark\">\n");
        saida.append("<div class=\"container-fluid\">\n");
        saida.append("<ul class=\"navbar-nav\">\n");
        saida.append("<li class=\"nav-item\">\n");
        saida.append("<a class=\"nav-link active\" href=\"#Estrutura\">Estrutura</a>\n");
        saida.append("</li>\n");
        saida.append("<li class=\"nav-item\">\n");
        saida.append("<a class=\"nav-link\" href=\"#Sinopse\">Sinopse</a>\n");
        saida.append("</li>\n");
        saida.append("<li class=\"nav-item\">\n");
        saida.append("<a class=\"nav-link\" href=\"#Personagens\">Personagens</a>\n");
        saida.append("</li>\n");
        saida.append("<li class=\"nav-item\">\n");
        saida.append("<a class=\"nav-link\" href=\"#Capitulos\">Capítulos</a>\n");
        saida.append("</li>\n");
        saida.append("<li class=\"nav-item\">\n");
        saida.append("<a class=\"nav-link\" href=\"#InfoGerais\">Informações Gerais</a>\n");
        saida.append("</li>\n");
        saida.append("</ul>\n");
        saida.append("</div>\n");
        saida.append("</nav>\n");
        
        // Geração do código referente às partes principais do programa.
        visitEstrutura(ctx.estrutura());
        
        visitHistoria(ctx.historia());
        
        // Geração do código referente às informações adicionais que serão exibidas.
        visitInfoGeral(ctx);
        
        // Verificação necessária para informar ao usuário a existência de erros no programa de entrada,
        // instruindo-o a olhar o arquivo gerado para maiores informações.
        if (!DescrituraUtils.errosSemanticos.isEmpty()) {
            // Caso tenham sido identificados erros de apenas um tipo (Estrutura, Personagem ou Capítulo),
            // é exibida apenas a mensagem adequada.
            saida.append("<div class=\"container-fluid p-5 bg-danger text-white text-center\">\n");
            saida.append("<div class=\"container mt-5\">\n");
            if (DescrituraSemantico.errosEncontrados.size() == 1) {
                if (DescrituraSemantico.errosEncontrados.get(0) == TipoDescritura.ESTRUTURA) {
                    saida.append("<h3 class=\"h3\">Atenção! Foi encontrado um erro na declaração da estrutura. Por favor, verifique o arquivo log.txt.</h3>\n");
                } else if (DescrituraSemantico.errosEncontrados.get(0) == TipoDescritura.PERSONAGEM) {
                    saida.append("<h3 class=\"h3\">Atenção! Foi encontrado um erro na declaração dos personagens. Por favor, verifique o arquivo log.txt.</h3>\n");
                } else if (DescrituraSemantico.errosEncontrados.get(0) == TipoDescritura.CAPITULO) {
                    saida.append("<h3 class=\"h3\">Atenção! Foi encontrado um erro na declaração dos capítulos. Por favor, verifique o arquivo log.txt.</h3>\n");
                }
            } else {
                // Caso tenham sido identificados erros de mais de um tipo, é exibida uma mensagem personalizada
                // em forma de lista.
                saida.append("<h3 class=\"h3\">Atenção! Foram encontrados erros nos seguintes trechos do código de entrada:</h3>");
                
                saida.append("<p>");
                if (DescrituraSemantico.errosEncontrados.contains(TipoDescritura.ESTRUTURA)) {
                    saida.append("Declaração de estrutura<br>");
                }
                
                if (DescrituraSemantico.errosEncontrados.contains(TipoDescritura.PERSONAGEM)) {
                    saida.append("Declaração de personagens<br>");
                }
                
                if (DescrituraSemantico.errosEncontrados.contains(TipoDescritura.CAPITULO)) {
                    saida.append("Declaração de capítulos");
                }
                saida.append("</p>\n");
                
                saida.append("<h6 class=\"h6\">Por favor, verifique o arquivo log.txt.</h6>");
            }
            saida.append("</div>\n");
            saida.append("</div>\n");
        // Caso não tenham sido identificados erros, esta informação também é passada ao usuário.   
        } else {
            saida.append("<div class=\"container-fluid p-5 bg-primary text-white text-center\">\n");
            saida.append("<div class=\"container mt-5\">\n");
            saida.append("<h3 class=\"h3\">Não foram identificados erros no programa de entrada.</h3>\n");
            saida.append("</div>\n");
            saida.append("</div>\n");
        }
                
        saida.append("</body>\n");
        
        return null;
    }
    
    @Override
    public Void visitEstrutura(gramaticaParser.EstruturaContext ctx) {
        // Exibição das informações referentes à estrutura.
        saida.append("<div class=\"container mt-5\">\n");
        saida.append("<h3 id=\"Estrutura\" class=\"h3\">Estrutura</h3><br>\n");
        saida.append("<h4 class=\"text-center\">");
        saida.append(converteTitulo(removeAspas(ctx.nome().CADEIA().getText())));
        saida.append("</h4><br>\n");
        
        // Exibição dos arquétipos.
        saida.append("<div class=\"d-flex aligns-items-center justify-content-center\">\n");
        saida.append("<div class=\"col-sm-4\">\n");
        saida.append("<h4 class=\"h4\">Arquétipos</h4>\n");
        saida.append("<ul>\n");
        
        int qtdeArq = ctx.arquetipos().CADEIA().size();
        
        // Loop para adicionar os arquétipos à lista que é exibida no html.
        for (int i = 0; i < qtdeArq; i++) {
            String nomeArqAux = converteTitulo(removeAspas(ctx.arquetipos().CADEIA().get(i).getText()));
            saida.append("<li>");
            saida.append(nomeArqAux);
            saida.append("</li>\n");
            
            // Adiciona o arquétipo na tabela para efetuar verificações no caso de estar gerando um html
            // que contenha erros que ainda não foram corrigidos pelo usuário.
            tabela.adicionar(nomeArqAux, TabelaDeSimbolos.TipoDescritura.ARQUETIPO);
        }

        saida.append("</ul>\n");
        saida.append("</div>\n");
        
        // Exibição dos elementos.
        saida.append("<div class=\"col-sm-4\">\n");
        saida.append("<h4 class=\"h4\">Elementos</h4>\n");
        saida.append("<ul>\n");
                
        int qtdeEle = ctx.elementos().CADEIA().size();

        // Loop para adicionar os elementos à lista que é exibida no html.
        for (int i = 0; i < qtdeEle; i++) {
            String nomeEleAux = converteTitulo(removeAspas(ctx.elementos().CADEIA().get(i).getText()));
            saida.append("<li>");
            saida.append(nomeEleAux);
            saida.append("</li>\n");
            
            // Adiciona o elemento na tabela para efetuar verificações no caso de estar gerando um html
            // que contenha erros que ainda não foram corrigidos pelo usuário.
            tabela.adicionar(nomeEleAux, TabelaDeSimbolos.TipoDescritura.ELEMENTO);
        }
        
        saida.append("</ul>\n");
        saida.append("</div>\n");
        saida.append("</div>\n");
        saida.append("</div>\n");
        saida.append("<hr style=\"width:90%;text-align:left;margin-left:5%;\">\n");
        
        return null;
    }

    @Override
    public Void visitHistoria(gramaticaParser.HistoriaContext ctx) {
        // Exibição das informações referentes à história.
        saida.append("<div class=\"container mt-5\">\n");
        saida.append("<h3 id=\"Sinopse\" class=\"h3\">Sinopse</h3><br>\n");
        saida.append("<p>");
        // Para o texto da sinopse, converte a primeira letra para maiúscula.
        saida.append(removeAspas(ctx.sinopse().CADEIA().getText()).substring(0,1).toUpperCase());
        saida.append(removeAspas(ctx.sinopse().CADEIA().getText()).substring(1));
        saida.append("</p>\n");
        saida.append("</div><br>\n");
        saida.append("<hr style=\"width:90%;text-align:left;margin-left:5%;\">\n");
        
        // Exibição de uma lista com o nome dos personagens e seus arquétipos.
        saida.append("<div class=\"container mt-5\">\n");
        saida.append("<div>\n");
        saida.append("<h3 id=\"Personagens\" class=\"h3\">Personagens</h3><br>\n");
        saida.append("<ul>\n");
        
        // Loop utilizado para percorrer os personagens que foram declarados.
        for (gramaticaParser.DeclaracaoGlobalContext dec : ctx.declaracaoGlobal()) {
            visitDeclaracaoGlobal(dec);
        }
        
        saida.append("</ul>\n");
        saida.append("</div>\n");
        saida.append("</div><br>\n");
        saida.append("<hr style=\"width:90%;text-align:left;margin-left:5%;\">\n");
        
        // Exibição de uma tabela com as informações dos capítulos.
        saida.append("<div class=\"container mt-5\">\n");
        saida.append("<div>\n");
        saida.append("<h3 id=\"Capitulos\" class=\"h3\">Capítulos</h3><br>\n");
        saida.append("<table style=\"width:100%\">\n");
        
        // Declaração do cabeçalho da tabela.
        saida.append("<tr>\n");
        saida.append("<th class=\"text-center\">Nº do Capítulo</th>\n");
        saida.append("<th class=\"text-center\">Nome do Capítulo</th>\n");
        saida.append("<th class=\"text-center\">Elementos</th>\n");
        saida.append("<th class=\"text-center\">Personagens</th>\n");
        saida.append("<th class=\"text-center\">Resumo</th>\n");
        saida.append("</tr>\n");
        
        // Variável auxiliar utilizada para a contagem dos capítulos que são
        // exibidos na tabela.
        int qtdeCapTabela = 1;
        
        // Loop utilizado para percorrer os capítulos que foram declarados, gerando
        // uma nova linha da tabela.
        for (gramaticaParser.CapituloContext cap : ctx.capitulo()) {
            saida.append("<tr>\n");
            saida.append("<td class=\"text-center\">");
            saida.append(qtdeCapTabela);
            saida.append("</td>\n");
            
            visitCapitulo(cap);
            
            saida.append("</tr>\n");
            
            qtdeCapTabela++;
        }
        
        saida.append("</table>\n");
        saida.append("</div>\n");
        saida.append("</div><br>\n");
        saida.append("<hr style=\"width:90%;text-align:left;margin-left:5%;\">\n");
        
        return null;
    }
    
    @Override
    public Void visitDeclaracaoGlobal(gramaticaParser.DeclaracaoGlobalContext ctx) {
        // Incrementa a variável que armazena a quantidade de personagens declarados.
        qtdePers++;
        
        // Adiciona o nome do personagem e seu arquétipo em um item da lista.
        saida.append("<li>");
        saida.append(converteTitulo(removeAspas(ctx.personagem().nome().CADEIA().getText())));
        saida.append(": ");
        
        // String auxiliar que armazena o arquétipo do personagem atual.
        String arqAtual = converteTitulo(removeAspas(ctx.personagem().arquetipo().CADEIA().getText()));
                
        // A princípio, verifica se o arquétipo foi declarado.
        if (tabela.existe(arqAtual)) {
            // Efetua uma verificação que identifica se o arquétipo do personagem é um arquétipo, de fato.
            // Caso não seja, o valor é exibido em destaque.
            if (tabela.verificar(arqAtual) != TipoDescritura.ARQUETIPO) {
                saida.append("<i>");
                saida.append(arqAtual);
                saida.append("</i>");
            // Caso realmente seja um arquétipo, o valor é exibido normalmente.
            } else {
                saida.append(arqAtual);
            }
        // Caso o arquétipo não tenha sido declarado, também é exibido em destaque.
        } else {
            saida.append("<i>");
            saida.append(arqAtual);
            saida.append("</i>"); 
        }
        
        
        saida.append("</li>\n");
        
        // Adiciona o identificador do personagem e seu respectivo nome na lista auxiliar.
        nomesPers.put(ctx.personagem().IDENTIFICADOR().getText(), removeAspas(ctx.personagem().nome().CADEIA().getText()));
        
        return null;
    }
    
    @Override
    public Void visitCapitulo(gramaticaParser.CapituloContext ctx) {
        // Incrementa a variável que armazena a quantidade de capítulos declarados.
        qtdeCap++;
        
        // String auxiliar que armazena o nome do capítulo.
        String nomeCap = removeAspas(ctx.nome().CADEIA().getText());
        
        // Adiciona o nome do capítulo como uma célula da tabela.
        saida.append("<td>");
        saida.append(converteTitulo(nomeCap));
        saida.append("</td>\n");
        
        // Adiciona a lista de elementos à tabela.
        saida.append("<td>");
        
        // Lista auxiliar que armazena os elementos presentes no capítulo.
        List<String> elems = new ArrayList<>();
        
        // Variável auxiliar que armazena a quantidade de elementos.
        int qtdeElem = ctx.elemento().CADEIA().size();
        
        // String auxiliar que armazena o nome do elemento.
        String elemAtual;
        
        // Caso haja mais do que um elemento, são feitas verificações para mostrá-los formatados
        // adequadamente.
        if (qtdeElem > 1) {
            for (int i = 0; i < qtdeElem; i++) {
                // Adiciona o elemento na lista de elementos do capítulo atual.
                elemAtual = removeAspas(ctx.elemento().CADEIA().get(i).getText());
                elems.add(elemAtual);

                // Converte o elemento para um título para as verificações seguintes.
                elemAtual = converteTitulo(elemAtual);

                // A princípio, verifica se o elemento foi declarado.
                if (tabela.existe(elemAtual)) {
                    // Efetua uma verificação que identifica se o elemento atual é um elemento, de fato.
                    // Caso não seja, o valor é exibido em destaque.
                    if (tabela.verificar(elemAtual) != TipoDescritura.ELEMENTO) {
                        saida.append("<i>");
                        saida.append(elemAtual);
                        saida.append("</i>");
                    // Caso realmente seja um elemento, o valor é exibido normalmente.
                    } else {
                        saida.append(elemAtual);
                    }
                // Caso o elemento não tenha sido declarado, também é exibido em destaque.
                } else {
                    saida.append("<i>");
                    saida.append(elemAtual);
                    saida.append("</i>");
                }
                

                // Verifica a necessidade de vírgula entre os elementos.
                if (i + 1 < qtdeElem) {
                    saida.append(", ");
                }
            }
            
            // Ao final do loop, adiciona a lista de elementos identificados junto de seu
            // respectivo capítulo.
            elePorCap.put(nomeCap, elems);
        // Caso haja apenas um elemento, ele é exibido normalmente.    
        } else {
            elemAtual = removeAspas(ctx.elemento().CADEIA().get(0).getText());
            
            // Caso tenha apenas um elemento no capítulo, ele também é adiciona como uma lista
            // para manter a coerência de tipos.
            elems.add(elemAtual);            
            elePorCap.put(nomeCap, elems);

            // Converte o elemento para um título para as verificações seguintes.
            elemAtual = converteTitulo(elemAtual);
            
            // Verifica se o elemento foi declarado.
            if (tabela.existe(elemAtual)) {
                // Efetua uma verificação que identifica se o elemento atual é um elemento, de fato.
                // Caso não seja, o valor é exibido em destaque.
                if (tabela.verificar(elemAtual) != TipoDescritura.ELEMENTO) {
                    saida.append("<i>");
                    saida.append(elemAtual);
                    saida.append("</i>");
                // Caso realmente seja um elemento, o valor é exibido normalmente.
                } else {
                    saida.append(elemAtual);
                }
            // Caso o elemento não tenha sido declarado, também é exibido em destaque.
            } else {
                saida.append("<i>");
                saida.append(elemAtual);
                saida.append("</i>");
            }
        }
        
        saida.append("</td>\n");
        
        // Adiciona a lista de personagens à tabela.
        saida.append("<td>");

        // Lista auxiliar que armazena os personagens presentes no capítulo.
        List<String> capPers = new ArrayList<>();
        
        // Variável auxiliar que armazena a quantidade de personagens no capítulo.
        int qtdePersCap = ctx.personagens().personagemDec().size();
        
        // String auxiliar que armazena o nome do personagem.
        String nomePersAux;
        
        // String auxiliar que armazena o identificador do personagem.
        String idPers;
        
        // Caso o capítulo tenha mais do que um personagem, são feitas verificações para
        // separar seus nomes por vírgulas.
        if (qtdePersCap > 1) {
            // Loop que percorre a lista de personagens.
            for (int i = 0; i < qtdePersCap; i++) {    
                // Com a lista auxiliar, são obtidos os nomes dos personagens a partir de
                // seus identificadores.
                idPers = ctx.personagens().personagemDec().get(i).getText();
                nomePersAux = nomesPers.get(idPers);
                
                // Caso o identificador atual tenha um nome relacionado, ou seja, foi declarado
                // de fato, seu nome é adicionado à lista de personagens do capítulo atual e
                // exibido na saída.
                if (nomePersAux != null) {
                    capPers.add(nomePersAux);
                    saida.append(converteTitulo(nomePersAux));
                // Caso o identificador não tenha um nome, ou seja, o personagem não foi declarado,
                // o próprio identificador é adicionado à lista e exibido em itálico na saída.
                } else {
                    capPers.add(idPers);
                    saida.append("<i>");
                    saida.append(idPers);
                    saida.append("</i>");
                }

                // Verificação necessária para a inclusão de vírgulas entre os nomes dos personagens.
                if (i + 1 < qtdePersCap) {
                    saida.append(", ");
                } 
            }
            
            // Adiciona a lista de personagens ao capítulo associado.
            persPorCap.put(nomeCap, capPers);
            
        // Caso o capítulo tenha apenas um personagem, são feitas as verificações da existência de um nome associado
        // e exibição adequada.
        } else {
            idPers = ctx.personagens().personagemDec().get(0).getText();
            nomePersAux = nomesPers.get(idPers);
            
            // Caso o identificador tenha um nome, adiciona o nome, caso contrário, adiciona o próprio
            // identificador.
            if (nomePersAux != null) {
                capPers.add(nomePersAux);
                saida.append(converteTitulo(nomePersAux));
            } else {
                capPers.add(idPers);
                saida.append("<i>");
                saida.append(idPers);
                saida.append("</i>");
            }

            // Adiciona o personagem ao capítulo associado.
            persPorCap.put(nomeCap, capPers);
        }
        
        saida.append("</td>\n");
        
        // Exibe a sinopse do capítulo.
        saida.append("<td>");
        
        // Caso necessário, converte a primeira letra maiúscula para manter a formatação esperada.
        saida.append(removeAspas(ctx.sinopse().CADEIA().getText()).substring(0,1).toUpperCase());
        saida.append(removeAspas(ctx.sinopse().CADEIA().getText()).substring(1));
        saida.append("</td>\n");
        
        return null;
    }
    
    // Método criado no formato dos visitantes anteriores para exibir algumas informações adicionais
    // pertinentes.
    public Void visitInfoGeral(gramaticaParser.ProgramaContext ctx) {
        saida.append("<div class=\"container mt-5\">\n");
        saida.append("<h3 id=\"InfoGerais\" class=\"h3\">Informações Gerais</h3><br>\n");
        
        // A princípio, são exibidas informações sobre os capítulos e personagens em uma lista.
        saida.append("<p>A história tem ");
        saida.append(qtdeCap);
        saida.append(" capítulos.</p>\n");
        
        saida.append("<p>Foram declarados ");
        saida.append(qtdePers);
        saida.append(" personagens, e eles estão distribuídos na história da seguinte forma:</p>\n");
        
        // A lista é constituída pelos nomes dos personagens seguidos pelos capítulos em que estão
        // presentes.
        saida.append("<ul>\n");
        
        // String auxiliar utilizada para armazenar o nome do capítulo atual.
        String nomeCapAux;
        
        // String auxiliar utilizada para armazenar o nome do personagem atual.
        String nomePersAux;
        
        // Para cada personagem declarado, são verificados os capítulos nos quais estão presentes.
        for (gramaticaParser.DeclaracaoGlobalContext pers : ctx.historia().declaracaoGlobal()) {
            // Lista auxiliar utilizada para obter os nomes dos capítulos nos quais o personagem
            // aparece.
            List<String> apareceCaps = new ArrayList<>();
            
            saida.append("<li>");
            
            // Para cada capítulo da história, é feita uma verificação da presença do personagem atual.
            for (gramaticaParser.CapituloContext cap : ctx.historia().capitulo()) {
                nomeCapAux = removeAspas(cap.nome().CADEIA().getText());
                nomePersAux = removeAspas(pers.personagem().nome().CADEIA().getText());
                
                // A partir da lista de capítulos com seus respectivos personagens declarada anteriormente,
                // são feitas verificações que identificam a presença do personagem no capítulo.
                if (persPorCap.get(nomeCapAux).contains(nomePersAux)) {
                    // Caso o personagem esteja presente no capítulo, o nome do capítulo é adicionado
                    // à nova lista auxiliar.
                    apareceCaps.add(nomeCapAux);
                }                
            }
            
            // Variável auxiliar utilizada para armazenar a quantidade de capítulos em que o
            // personagem aparece.
            int qtdeCaps = apareceCaps.size();
            
            // String auxiliar utilizada para armazenar o nome do personagem atual capitalizado, para
            // exibição na saída.
            String nomeSaida = converteTitulo(removeAspas(pers.personagem().nome().CADEIA().getText()));
            saida.append(nomeSaida);
            
            // Caso o personagem apareça em apenas um capítulo, é exibida uma mensagem no singular com
            // o nome do capítulo.
            if (qtdeCaps == 1) {
                nomeCapAux = converteTitulo(apareceCaps.get(0));
                saida.append(" aparece no capítulo \"");
                saida.append(nomeCapAux);
                saida.append("\"."); 
            // Caso o personagem apareça em mais de um capítulo, é exibida uma mensagem com os nomes dos
            // capítulos formatados adequadamente.
            } else if (qtdeCaps > 1) {
                saida.append(" aparece nos capítulos ");
                
                // Loop utilizado para percorrer a lista de capítulos nos quais o personagem aparece.
                for (int i = 0; i < qtdeCaps; i++) {
                    nomeCapAux = converteTitulo(apareceCaps.get(i));
                    
                    // Caso seja o último personagem a ser exibido, adiciona "e" à mensagem de saída.
                    if (i + 1 == qtdeCaps) {
                        saida.append(" e \"");
                        saida.append(nomeCapAux);
                        saida.append("\".");
                    // Caso seja o penúltimo personagem a ser exibido, não coloca uma vírgula após o nome.
                    } else if (i + 2 == qtdeCaps) {
                        saida.append("\"");
                        saida.append(nomeCapAux);
                        saida.append("\" ");
                    // Caso contrário, exibe os nomes dos capítulos separados por vírgulas.
                    } else {
                        saida.append("\"");
                        saida.append(nomeCapAux);
                        saida.append("\", ");
                    }
                }
            // Também é exibida uma mensagem personalizada para o caso de o personagem não aparecer
            // em nenhum capítulo.
            } else {
                saida.append(" não aparece em nenhum capítulo.");
            }

            saida.append("</li>\n");
        }
        
        saida.append("</ul>\n");
        
        
        // Em seguida, são exibidas informações sobre a estrutura declarada e como ela foi apresentada
        // ao longo dos capítulos.
        saida.append("<p>A estrutura \"");
        saida.append(converteTitulo(removeAspas(ctx.estrutura().nome().CADEIA().getText())));
        saida.append("\"  foi apresentada na história da seguinte maneira:</p>\n");
        saida.append("<ul>\n");
        
        // Lista auxiliar criada para armazenar os elementos da maneira que foram declarados
        // no programa de entrada.
        List<String> elementos = new ArrayList<>();

        for (TerminalNode ele : ctx.estrutura().elementos().CADEIA()) {
            elementos.add(removeAspas(ele.getText()));
        }
        
        // String auxiliar utilizada para armazenar o nome do elemento atual.
        String eleAux;
        
        // Usando uma lógica similar à verificação dos personagens e seus respectivos capítulos,
        // estes loops aninhados são utilizados para verificar os elementos pertencentes a cada
        // capítulo.
        for (int i = 0; i < elementos.size(); i++) {
            // Lista auxiliar utilizada para obter os nomes dos capítulos nos quais o elemento
            // aparece.
            List<String> apareceCaps = new ArrayList<>();
            
            saida.append("<li>");
            
            // Para cada capítulo da história, é feita uma verificação da presença do elemento atual.
            for (gramaticaParser.CapituloContext cap : ctx.historia().capitulo()) {
                nomeCapAux = removeAspas(cap.nome().CADEIA().getText());
                
                // A partir da lista de capítulos com seus respectivos elementos declarada anteriormente,
                // são feitas verificações que identificam a presença do elemento no capítulo.
                if (elePorCap.get(nomeCapAux).contains(elementos.get(i))) {
                    // Caso o elemento esteja presente no capítulo, o nome do capítulo é adicionado
                    // à nova lista auxiliar.
                    apareceCaps.add(nomeCapAux);
                }
            }
            
            // Variável auxiliar utilizada para armazenar a quantidade de capítulos em que o
            // elemento aparece.
            int qtdeCaps = apareceCaps.size();
            
            // String auxiliar utilizada para armazenar o nome do elemento atual capitalizado, para
            // exibição na saída.
            String nomeSaida = converteTitulo(elementos.get(i));
            saida.append(nomeSaida);
            
            // Caso o elemento apareça em apenas um capítulo, é exibida uma mensagem no singular com
            // o nome do capítulo.
            if (qtdeCaps == 1) {
                nomeCapAux = converteTitulo(apareceCaps.get(0));
                saida.append(" é parte do capítulo \"");
                saida.append(nomeCapAux);
                saida.append("\".");
            // Caso o elemento apareça em mais de um capítulo, é exibida uma mensagem com os nomes dos
            // capítulos formatados adequadamente.    
            } else if (qtdeCaps > 1) {                
                saida.append(" é parte dos capítulos ");
                
                // Loop utilizado para percorrer a lista de capítulos nos quais o elemento aparece.
                for (int j = 0; j < qtdeCaps; j++) {
                    nomeCapAux = converteTitulo(apareceCaps.get(j));
                    
                    // Caso seja o último elemento a ser exibido, adiciona "e" à mensagem de saída.
                    if (j + 1 == qtdeCaps) {
                        saida.append(" e \"");
                        saida.append(nomeCapAux);
                        saida.append("\".");
                    // Caso seja o penúltimo elemento a ser exibido, não coloca uma vírgula após o nome.
                    } else if (j + 2 == qtdeCaps) {
                        saida.append("\"");
                        saida.append(nomeCapAux);
                        saida.append("\" ");
                    // Caso contrário, exibe os nomes dos capítulos separados por vírgulas.
                    } else {
                        saida.append("\"");
                        saida.append(nomeCapAux);
                        saida.append("\", ");
                    }
                }
            // Também é exibida uma mensagem personalizada para o caso de o elemento não aparecer
            // em nenhum capítulo.    
            } else {
                saida.append(" não aparece em nenhum capítulo.");
            }
            
            saida.append("</li>\n");
        }
        
        saida.append("</ul>\n");
        saida.append("</div><br>\n");
        
        return null;
    }
}
