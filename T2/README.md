# T2: Analisador Sintático

Neste repositório encontra-se o segundo trabalho da disciplina Construção de Compiladores, referente ao desenvolvimento de um analisador sintático. Abaixo estão documentadas as instruções de execução do programa e as regras estabelecidas para a gramática.

## Instruções de uso

O trabalho foi desenvolvido com a IDE NetBeans. Deste modo, para preservar sua estrutura original e facilitar seu posterior uso por outros usuários, espera-se que ele seja executado com o próprio NetBeans. Durante o desenvolvimento, foi utilizada a versão 13 do NetBeans e a versão 18.0.1.1 do Java. Espera-se que seja possível executá-lo em versões mais recentes de ambos. O programa foi desenvolvido no Windows 10 e suas instruções de uso também serão apresentadas neste SO. Além disso, também foi utilizado o Apache Maven, para gerenciamento do projeto (informações sobre sua instalação podem ser encontradas [aqui](https://www.devmedia.com.br/introducao-ao-maven/25128#2)), e, de forma integrada, a versão mais recente do ANTLR, para a geração da análise de acordo com as especificações do trabalho (maiores detalhes podem ser encontrados [aqui](https://www.antlr.org/)).

Para a execução e melhor compreensão do trabalho, são necessários:
- [O arquivo .rar do projeto](https://drive.google.com/file/d/1exUIyPPau7Rxk6d6u_1eR6GaYAAyBSQp/view?usp=sharing);
- [Os casos de teste disponibilizados pelo professor](https://drive.google.com/file/d/1Q2J-eIzQ199C4dzpZikBTZvXfYw5YIXv/view?usp=sharing), com suas respectivas saídas esperadas para posterior comparação;
- [Definição da gramática utilizada](https://drive.google.com/file/d/1Cv9m52E5r72jb3sLI04Jyqc29Cykn5RQ/view?usp=sharing). Esta gramática foi adaptada dentro das definições do ANTLR e pode ser visualizada no arquivo [t2Sint.g4](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T2/src/main/antlr4/br/ufscar/dc/compiladores/t2/t2Sint.g4).

Após ser baixado e descompactado, o programa pode ser aberto no NetBeans para melhor visualização e manutenção.

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T1/doc-images/1.png)

Caso novas alterações sejam feitas, o programa deve ser construído novamente para que as mudanças sejam efetivadas.

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T1/doc-images/2.png)

Isto não é necessário para sua execução, entretanto. Para executá-lo, basta localizar o arquivo **t2-1.0-SNAPSHOT-jar-with-dependencies.jar** na pasta _target_. Por questões de conveniência, talvez seja necessário copiar este arquivo para um diretório de melhor acesso, considerando que será necessária a utilização de linhas de comando nos passos a seguir.

Com o arquivo em um diretório de fácil acesso, abra uma janela do _prompt de comandos_ do Windows e utilize o seguinte comando:

**java -jar (diretório do arquivo .jar) (diretório do caso de teste) (diretório do arquivo de saída)**

Onde:
- O diretório do arquivo .jar é a localização do arquivo **t2-1.0-SNAPSHOT-jar-with-dependencies.jar**;
- O diretório do caso de teste é a localização de um arquivo.txt que contém um algoritmo que será analisado pelo programa;
- O diretório do arquivo de saída é a localização do arquivo.txt onde será apresentado o resultado da análise. Caso o arquivo não exista ainda, ele será criado.

Um exemplo do comando acima utilizado para a execução do programa:

**java -jar C:\Compiladores\t2-1.0-SNAPSHOT-jar-with-dependencies.jar C:\Compiladores\teste.txt C:\Compiladores\saida.txt**

**Obs: é de extrema importância que sejam utilizados os arquivos apresentados acima como os casos de teste, pois eles estão adequados para a gramática estabelecida no programa. Caso necessário, pode ser criado um novo arquivo para testes, desde que obedeça a gramática da linguagem. Caso deseje testar novos casos em uma gramática diferente, todo o arquivo t2Sint.g4 e definições nas classes Java deverão ser ajustadas.**

![alt text](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T2/doc-images/1.png)

## Sobre a gramática

A gramática utilizada no desenvolvimento deste trabalho foi a especificada no arquivo disponibilizado acima. Para conferir a gramática do programa em mais detalhes, recomenda-se a visualização do arquivo [t2Sint.g4](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T2/src/main/antlr4/br/ufscar/dc/compiladores/t2/t2Sint.g4). Abaixo, serão apresentadas algumas noções importantes para sua compreensão. A princípio, algumas definições utilizadas no trabalho anterior foram preservadas:

- NUM_INT e NUM_REAL: nestes padrões são especificados os formatos de valores inteiros e reais;
- IDENT: este padrão é responsável por definir o que pode ser considerado um identificador (ou variável) dentro dos algoritmos. Identificadores são cadeias iniciadas por letras e seguidar por letras ou números, além do símbolo de _;
- CADEIA: este padrão identifica uma cadeia de caracteres (ou string) dentro dos algoritmos. As cadeias são definidas por sequências de quaisquer símbolos que estão entre aspas duplas;
- COMENTARIO: os comentários são ignorados pelo analisador léxico, de modo que não geram tokens. São identificados por caracteres que estão entre chaves;
- WS: define espaços em branco, quebras de linha e tabulações, que também são ignorados pelo analisar léxico;
- CADEIA_ERRADA: semelhante ao que foi apresentado em CADEIA, porém, desta vez, identifica uma cadeia que não foi fechada adequadamente e exibe uma mensagem de erro com o auxílio da função _erroLexico()_, além de interromper a execução do programa.
- COMENTARIO_ERRADO: semelhante ao que foi apresentado em CADEIA_ERRADA, com a diferença de que, desta vez, identifica comentários que não foram devidamente fechados;
- ERRO: semelhante ao que foi apresentado nos dois padrões anteriores, mas, desta vez, identifica caracteres que não foram definidos na gramática (como o símbolo de $).

Após isso, foi definido o restante da gramática para este trabalho:

- programa: conjunto de declarações seguido pelo corpo do programa, que é delimitado pelas palavras-chave 'algoritmo' e 'fim_algoritmo'.
- declaracoes: conjunto de zero ou mais declarações locais OU globais.
- decl_local_global: conjunto de declarações locais OU globais.
- declaracao_local: palavra-chave 'declare' seguida por uma variável; a palavra-chave 'constante' seguida por um identificador, um tipo básico e um valor; ou uma definição de um identificador de algum tipo.
- variavel: conjunto de um ou mais identificadores (separador por vírgula) de um determinado tipo.
- identificador: conjunto de zero ou mais identificadores (IDENT foi definido no tópico anterior) com uma determinada dimensão (usada na declaração de arranjos).
- dimensao: conjunto de zerou ou mais expressões aritméticas entre colchetes.
- tipo: um tipo pode ser um registro ou um tipo estendido.
- tipo_basico: literal, inteiro, real e lógico, tipos básicos para o funcionamentos dos algoritmos.
- tipo_basico_ident: um dos tipos básicos ou um novo identificador.
- valor_constante: uma constante pode ser uma cadeira, um número inteiro ou real, ou um valor lógico.
- registro: conjunto de zero ou mais variáveis delimitadas pelas palavras-chave 'registro' e 'fim_registro'.
- declaracao_global: definição de um procedimento OU uma função, que são conjuntos de parâmetros (opcionais), um conjunto de zero ou mais declarações locais e um conjuntoo de zero ou mais locais, delimitados por suas respectivas palavras-chave.
- parametro: palavra-chave 'var' (opcional), seguida por um conjunto de um ou mais identificadores com um determinado tipo.
- parametros: conjunto de um ou mais parâmetros separados por vírgula.
- corpo: corpo do programa, definido como um conjunto de zero ou mais declarações locais e um conjunto de zero ou mais comandos.
- cmd: identifica os comandos da linguagem, que serão especificados a seguir.
- cmdLeia: palavra-chave 'leia' seguida por um conjunto de um ou mais identificadores separados por vírgula.
- cmdEscreva: palavra-chave 'escreva' seguida por um conjunto de um ou mais expressões separadas por vírgula.
- cmdSe: palavra-chave 'se' seguida por uma expressão, que é seguida pela palavra-chave 'entao', delimitando um conjunto de zero ou mais comandos, além da palavra-chave 'senao' e seus comandos, finalizado pela palavra-chave 'fim_se'.
- cmdCaso: palavra-chave 'caso' seguida por uma expressão aritmética, de modo que a palavra-chave 'seja' delimite uma seleção de argumentos, além de um valor padrão opcional.
- cmdPara: palavra-chave 'para' seguida por um identificador que recebe uma expressão aritmética, delimitando um intervalo com a palavra-chave 'ate', responsável por repetir um conjunto de zero ou mais comandos tantas vezes quanto forem necessárias para a finalização do loop.
- cmdEnquanto: palavra-chave 'enquanto' seguida por uma expressão e um conjunto de zero ou mais comandos delimitados pelas palavras-chave 'faca' e 'fim_enquanto'.
- cmdFaca: palavra-chave 'faca' seguida por um conunto de zero ou mais comandos, repetindo uma determinada expressão com o auxílio da palavra-chave 'ate'.
- cmdAtribuicao: identificador recebendo uma determinada expressão com o auxílio do símbolo de atribuição '<-'.
- cmdChamada: identificador que recebe um conjunto de uma ou mais expressões separados por vírgulas entre parênteses.
- cmdRetorne: palavra-chave 'retorne' seguida por uma expressão.
- selecao: conjunto de zero ou mais itens.
- item_selecao: constantes seguidas por um conjunto de zero ou mais comandos.
- constantes: conjunto de um ou mais números separados por vírgula. 
- numero_intervalo: número inteiro formando, opcionalmente, um intervalo através do símbolo '..' (os números podem ser valores negativos).
- op_unario: operador de subtração, para a representação de um valor negativo.
- exp_aritmetica: termo seguido por zero ou mais operadores e termos.
- termo: fator seguido por zero ou mais operadores e fatores
- fator: parcela seguida por zero ou mais operadores e novas parcelas. É importante notar que "exp_aritmetica", "termo", "fator" e os operadores definidos a seguir são os responsáveis pela precedência de operações matemáticas no programa.
- op1: operações de adição e subtração.
- op2: operações de multiplicação e divisão.
- op3: operação de módulo.
- parcela: parcela unária (que pode ser negativa ou não) ou uma parcela não unária.
- parcela_unario: um identificador; um identificador com um conjunto de uma ou mais expressões entre parênteses; um número inteiro; um número real; ou uma expressão.
- parcela_nao_unario: símbolo '&' seguido por um identificador ou uma cadeia (definida no tópico anterior) de caracteres.
- exp_relacional: expressão aritmética seguida, opcionalmente, por um operador relacional e uma outra expressão aritmética.
- op_relacional: operadores relacionadis de igualdade, diferença e maior ou menor (ou igual) que.
- expressao: conjunto de um ou mais termos lógicos seguidos por operadores lógicos.
- termo_logico: conjunto de um ou mais fatores lógicos seguidos por operadores lógicos.
- fator_logico: uma parcela lógica que pode ser negada com o uso da palavra-chave 'nao' (opcional).
- parcela_logica: valores verdadeiro ou falso ou uma expressão relacional.
- op_logico_1: operador OU.
- op_logico_2: operador E. De forma semelhante à expressão aritmética, estas últimas regras definiram uma precedência entre as operações lógicas.
