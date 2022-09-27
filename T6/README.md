# T6: Descritura - Declaração de Estruturas Literárias

Neste repositório encontra-se o sexto e último trabalho da disciplina Construção de Compiladores, referente ao desenvolvimento de um compilador completo para uma linguagem de declaração de estruturas literárias que gera um arquivo .html com as informações apresentadas. Abaixo estão documentadas as instruções de execução do programa.

### Índice
  <ol>
    <li><a href="#intro">Introdução</a></li>
    <li><a href="#proj">Projeto da Linguagem</a></li>
    <li><a href="#inst">Dependências e Instalações</a></li>
    <li><a href="#casos">Casos de Teste e Estrutura de Programas da Linguagem</a></li>
    <li><a href="#uso">Uso do Compilador</a></li>
    <li><a href="#saida">Saídas e Resultados</a></li>
    <li><a href="#video">Vídeo Demonstrativo</a></li>
    <li><a href="#futuro">Futuro do Projeto</a></li>
  </ol>

## Introdução
<a name="intro"/>

Descritura é uma linguagem que pode ser utilizada para a declaração de estruturas de textos literários, a partir dos elementos que comporão a história e seus personagens, que são apresentados em capítulos. Após a utilização do compilador, é gerado um arquivo .html que exibe as informações de forma detalhada, em listas e tabelas, além da geração de um arquivo descrevendo erros no programa de entrada, caso existam, que também são destacadas na página html gerada.

## Projeto da Linguagem
<a name="proj"/>

A gramática da linguagem foi desenvolvida para suportar programas divididos em três seções:
- Declaração de estrutura: onde são estabelecidos os elementos que serão apresentados nos capítulos e os arquétipos utilizados nos personagens;
- Declaração de personagens: onde são declarados os personagens da história, a partir de um identificador interno ao programa que armazena o nome do personagem e seu arquétipo;
- Declaração de capítulo: onde são declarados os capítulos da história, a partir de um identificador interno ao programa que armazena o nome do capítulo, uma breve sinopse, a lista de elementos e a lista de personagens.

Com estas informações, espera-se que sejam construídos programas que obedeçam as informações declaradas na estrutura e sejam coerentes com a estrutura e personagens previamente declarados. Para informações mais detalhadas sobre a linguagem, recomenda-se conferir o arquivo [com a definição da gramática](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/Descritura/src/main/antlr4/br/ufscar/dc/compiladores/descritura/gramatica.g4).

## Dependências e Instalações
<a name="inst"/>

O projeto foi desenvolvido com a IDE NetBeans. Deste modo, para preservar sua estrutura original e facilitar seu posterior uso por outros usuários, espera-se que ele seja executado com o próprio NetBeans, apesar de também ser acessível através de outras IDEs ou editores. Durante o desenvolvimento, foi utilizada a versão 13 do NetBeans e a versão 18.0.1.1 do Java. Espera-se que seja possível executá-lo em versões mais recentes de ambos. O programa foi desenvolvido no Windows 10 e suas instruções de uso também serão apresentadas neste SO *(serão adicionadas instruções para uso em distribuições Linux no futuro)*. 

Também foi utilizado o Apache Maven, para gerenciamento do projeto (informações sobre sua instalação podem ser encontradas [aqui](https://www.devmedia.com.br/introducao-ao-maven/25128#2)), e, de forma integrada, a versão mais recente do ANTLR, para a geração de parsers para as análises léxicas, sintática e semântica, de acordo com as especificações apresentadas ao longo da disciplina (maiores detalhes podem ser encontrados [aqui](https://www.antlr.org/)).

## Casos de Teste e Estrutura de Programas da Linguagem
<a name="casos"/>

Para exemplificação do uso da linguagem e do compilador, foram disponibilizados dois conjuntos de casos de testes: um [genérico](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/tree/main/T6/CasosTeste/generico) e um baseado na obra [O Senhor dos Anéis](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/tree/main/T6/CasosTeste/senhor-dos-aneis), que serão utilizados nas explicações a seguir.

Um programa aceito pela linguagem Descritura tem o seguinte formato:

- Estrutura

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/Imagens/estrutura.png)

A seção de estrutura, delimitada pela palavra-chave "estrutura", deve ter um identificador associado e é composta por uma lista dos elementos da história e uma lista de arquétipos utilizados nos personagens. Ambas são listas de cadeias de caracteres, de modo que não aceitam a definição de identificadores.

- História

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/Imagens/historia.png)

A seção de história, delimitada pela palavra-chave "historia", deve ter o nome da história, nome do autor (pode ser uma lista de autores) e uma sinopse. Também pode ser complementada por atributos opcionais de versão e data da última atualização.

- Personagem

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/Imagens/personagem.png)

Em seguida, ainda na seção de história, são declarados os personagens, delimitados pela palavra-chave "personagem" e um identificador, devendo ser compostos pelo nome do personagem e um dos arquétipos estabelecidos anteriormente.

- Capítulo

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/Imagens/capitulo.png)

Por fim, completando a seção de história, os capítulos devem ser declarados a partir da palavra-chave "capitulo" e um identificador, e devem ser compostos pelo nome do capítulo, uma breve sinopse, um ou mais elementos, desde que não sejam repetidos e respeitem a ordem da declaração anterior, e a lista dos personagens presentes no capítulo, que devem ser representados por seus identificadores.

Um exemplo completo e correto da programa aceito pela linguagem pode ser conferido [aqui](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/CasosTeste/senhor-dos-aneis/senhor-dos-aneis-certo/senhor-dos-aneis-certo.txt).

## Uso do Compilador
<a name="uso"/>

Para sua utilização, o projeto não precisa ser construído novamente, basta efetuar o [download do arquivo executável](https://drive.google.com/file/d/1KASymbOi7kN4in-A6-7SHSE1YurhagQl/view?usp=sharing).

Recomenda-se que o arquivo executável seja colocado em um diretório de fácil acesso para a utilização de linhas de comandos. Em seguida, abra uma janela do _prompt de comandos_ do Windows e utilize o seguinte comando:

**java -jar (diretório do arquivo .jar) (diretório do caso de teste) (diretório do arquivo de saída 1) (diretório do arquivo de saída 1)**

Onde:
- O diretório do arquivo .jar é a localização do arquivo **descritura.jar**, baixado anteriormente;
- O diretório do caso de teste é a localização de um arquivo .txt que contém um programa que será analisado pelo compilador;
- O diretório do arquivo de saída 1 é a localização do arquivo .txt onde será apresentado o resultado da análise semântica do compilador;
- O diretório do arquivo de saída 2 é a localização do arquivo .html gerado após a análise.

Um exemplo do comando acima utilizado para a execução do programa:

**java -jar C:\Compiladores\descritura.jar C:\Compiladores\entrada.txt C:\Compiladores\log.txt C:\Compiladores\index.html**

## Saídas e Resultados
<a name="saida"/>

Após a utilização do compilador para análise de um determinado programa de entrada, são gerados dois arquivos:

- log.txt

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/Imagens/log-certo.png)

O arquivo log.txt apresenta o resultado da análise semântica efetuada pelo compilador. Para o caso de teste apresentado anteriormente, a saída consta que não foram identificados erros. A seguir, é apresentado um log com alguns dos erros que podem ser identificados pelo compilador, refere a [este](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/CasosTeste/senhor-dos-aneis/senhor-dos-aneis-erro-capitulos/senhor-dos-aneis-erro-capitulos.txt) caso de teste:

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T6/Imagens/log-erro.png)

## Vídeo Demonstrativo
<a name="video"/>

...

## Futuro do Projeto
<a name="futuro"/>

...
