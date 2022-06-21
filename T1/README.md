# T1: Analisador Léxico

Neste repositório encontra-se o primeiro trabalho da disciplina Construção de Compiladores, referente ao desenvolvimento de um analisador léxico. Abaixo estão documentadas as instruções de execução do programa e as regras estabelecidas para a gramática.

## Instruções de uso

O trabalho foi desenvolvido utilizando a IDE NetBeans. Deste modo, para preservar sua estrutura original e facilitar seu posterior uso por outros usuários, espera-se que ele seja executado com o próprio NetBeans. Durante o desenvolvimento, foi utilizada a versão 13 do NetBeans e a versão 18.0.1.1 do Java. Espera-se que seja possível executá-lo em versões mais recentes de ambos. O programa foi desenvolvido no Windows 10 e suas instruções de uso também serão apresentadas neste SO.

O arquivo .rar do projeto pode ser encontrado [aqui](https://drive.google.com/file/d/1VO09wbgifq8pvIm9gHNnliy7Et5VfLOA/view?usp=sharing).

Após ser baixado e descompactado, ele pode ser aberto no NetBeans para melhor visualização.

![alt text](https://github.com/GuilhermeSGodoy/images/blob/main/compiladores-t1/1.png)

Caso novas alterações sejam feitas, o programa deve ser construído novamente para que as mudanças sejam efetivadas.

![alt text](https://github.com/GuilhermeSGodoy/images/blob/main/compiladores-t1/2.png)

Isto não é necessário para sua execução, entretanto. Para executá-lo, basta localizar o arquivo **t1-1.0-SNAPSHOT-jar-with-dependencies.jar** na pasta _target_. Por questões de conveniência, talvez seja necessário copiar este arquivo para um diretório de melhor acesso, considerando que será necessária a utilização de linhas de comando nos passos a seguir.

Com o arquivo em um diretório de fácil acesso, abra uma janela do _prompt de comandos_ do Windows e utilize o seguinte comando:

**java -jar (diretório do arquivo .jar) (diretório do caso de teste) (diretório do arquivo de saída)**

Onde:
- O diretório do arquivo .jar é a localização do arquivo **t1-1.0-SNAPSHOT-jar-with-dependencies.jar**;
- O diretório do caso de teste é a localização de um arquivo.txt que contém um algoritmo que será analisado pelo programa;
- O diretório do arquivo de saída é a localização do arquivo.txt onde será apresentado o resultado da análise. Caso o arquivo não exista ainda, ele será criado.

Um exemplo do comando acima utilizado para a execução do programa:

**java -jar C:\Compiladores\t1-1.0-SNAPSHOT-jar-with-dependencies.jar C:\Compiladores\teste.txt C:\Compiladores\saida.txt**

Durante o desenvolvimento deste trabalho, foram utilizados os casos de teste disponibilizados pelo professor, que podem ser encontrados [aqui](https://drive.google.com/file/d/1YYJNgtYr85LETqUpB30SBil2p0GIQhVp/view).

Nele, podem ser baixados os casos de teste que serão utilizados nas verificações do programa (como o segundo argumento do comando especificado acima). Também podem ser encontrados os arquivos com as saídas esperadas para cada caso para conferências manuais dos resultados.

**Obs: é de extrema importância que sejam utilizados os arquivos apresentados acimas como os casos de teste, pois eles estão adequados para a gramática estabelecida no programa. Caso necessário, pode ser criado um novo arquivo para testes, desde que obedeça a gramática da linguagem. Caso deseje testar novos casos em uma gramática diferente, todo o arquivo t1Lex.g4 deverá ser ajustado.**

![alt text](https://github.com/GuilhermeSGodoy/images/blob/main/compiladores-t1/3.png)

## Sobre a gramática

A gramática utilizada no desenvolvimento deste trabalho foi a especificada nos casos de teste apresentados acima. Para conferir a gramática em mais detalhes, recomenda-se a visualização do arquivo [t1Lex.g4](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T1/src/main/antlr4/br/ufscar/dc/compiladores/t1/t1Lex.g4). Abaixo, serão apresentadas algumas noções importantes para sua compreensão:
- A princípio, a função _erroLexico()_ é apresentada como uma auxiliar à identificação/exibição de mensagens de erro, recebendo como único parâmetro a mensagem personalizada para cada tipo de erro esperado. Ela será utilizada posteriormente para este fim;
- PALAVRA_CHAVE: aqui, são encontradas todas as palavras-chave utilizadas nos algoritmos de teste;
- NUM_INT e NUM_REAL: nestes padrões são especificados os formatos de valores inteiros e reais;
- OP_ARIT, OP_REL, OP_LOG: nestes padrões são especificados os operadores aritméticos, relacionais e lógicos que são utilizados nos algoritmos de teste;
- IDENT: este padrão é responsável por definir o que pode ser considerado um identificador (ou variável) dentro dos algoritmos. Identificadores são cadeias iniciadas por letras e seguidar por letras ou números, além do símbolo de _;
- CADEIA: este padrão identifica uma cadeia de caracteres (ou string) dentro dos algoritmos. As cadeias são definidas por sequências de quaisquer símbolos que estão entre aspas duplas;
- COMENTARIO: os comentários são ignorados pelo analisador léxico, de modo que não geram tokens. São identificados por caracteres que estão entre chaves;
- WS: define espaços em branco, quebras de linha e tabulações, que também são ignorados pelo analisar léxico;
- CARACTERE_ESP: são caracteres especiais utilizados ao longo dos algoritmos e sem uma semântica específica por trás deles (como vírgulas e símbolos de atribuição);
- CADEIA_ERRADA: semelhante ao que foi apresentado em CADEIA, porém, desta vez, identifica uma cadeia que não foi fechada adequadamente e exibe uma mensagem de erro com o auxílio da função _erroLexico()_, além de interromper a execução do programa.
- COMENTARIO_ERRADO: semelhante ao que foi apresentado em CADEIA_ERRADA, com a diferença de que, desta vez, identifica comentários que não foram devidamente fechados;
- ERRO: semelhante ao que foi apresentado nos dois padrões anteriores, mas, desta vez, identifica caracteres que não foram definidos na gramática (como o símbolo de $).
