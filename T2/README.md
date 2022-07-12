# T2: Analisador Sintático

Neste repositório encontra-se o segundo trabalho da disciplina Construção de Compiladores, referente ao desenvolvimento de um analisador sintático. Abaixo estão documentadas as instruções de execução do programa e as regras estabelecidas para a gramática.

## Instruções de uso

O trabalho foi desenvolvido com a IDE NetBeans. Deste modo, para preservar sua estrutura original e facilitar seu posterior uso por outros usuários, espera-se que ele seja executado com o próprio NetBeans. Durante o desenvolvimento, foi utilizada a versão 13 do NetBeans e a versão 18.0.1.1 do Java. Espera-se que seja possível executá-lo em versões mais recentes de ambos. O programa foi desenvolvido no Windows 10 e suas instruções de uso também serão apresentadas neste SO. Além disso, também foi utilizado o Apache Maven, para gerenciamento do projeto (informações sobre sua instalação podem ser encontradas [aqui](https://www.devmedia.com.br/introducao-ao-maven/25128#2)), e, de forma integrada, a versão mais recente do ANTLR, para a geração da análise de acordo com as especificações do trabalho (maiores detalhes podem ser encontrados [aqui](https://www.antlr.org/)).

O arquivo .rar do projeto pode ser encontrado [aqui](https://drive.google.com/file/d/1exUIyPPau7Rxk6d6u_1eR6GaYAAyBSQp/view?usp=sharing).

Durante o desenvolvimento deste trabalho, foram utilizados os casos de teste disponibilizados pelo professor, que podem ser encontrados [aqui](https://drive.google.com/file/d/1Q2J-eIzQ199C4dzpZikBTZvXfYw5YIXv/view?usp=sharing), com suas respectivas saídas esperadas para posterior comparação.

Além disso, também foi utilizado um arquivo com a definição da gramática utilizado, que pode ser encontrado [aqui](https://drive.google.com/file/d/1Cv9m52E5r72jb3sLI04Jyqc29Cykn5RQ/view?usp=sharing). Esta gramática foi adaptada dentro das definições do ANTLR e pode ser visualizada [aqui](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T2/src/main/antlr4/br/ufscar/dc/compiladores/t2/t2Sint.g4).

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

A gramática utilizada no desenvolvimento deste trabalho foi a especificada no arquivo de gramática disponibilizado acima. Para conferir a gramática do programa em mais detalhes, recomenda-se a visualização do arquivo [t2Sint.g4](https://github.com/GuilhermeSGodoy/Construcao-Compiladores/blob/main/T2/src/main/antlr4/br/ufscar/dc/compiladores/t2/t2Sint.g4). Abaixo, serão apresentadas algumas noções importantes para sua compreensão. A princípio, algumas definições utilizadas no trabalho anterior foram preservadas:

- NUM_INT e NUM_REAL: nestes padrões são especificados os formatos de valores inteiros e reais;
- IDENT: este padrão é responsável por definir o que pode ser considerado um identificador (ou variável) dentro dos algoritmos. Identificadores são cadeias iniciadas por letras e seguidar por letras ou números, além do símbolo de _;
- CADEIA: este padrão identifica uma cadeia de caracteres (ou string) dentro dos algoritmos. As cadeias são definidas por sequências de quaisquer símbolos que estão entre aspas duplas;
- COMENTARIO: os comentários são ignorados pelo analisador léxico, de modo que não geram tokens. São identificados por caracteres que estão entre chaves;
- WS: define espaços em branco, quebras de linha e tabulações, que também são ignorados pelo analisar léxico;
- CADEIA_ERRADA: semelhante ao que foi apresentado em CADEIA, porém, desta vez, identifica uma cadeia que não foi fechada adequadamente e exibe uma mensagem de erro com o auxílio da função _erroLexico()_, além de interromper a execução do programa.
- COMENTARIO_ERRADO: semelhante ao que foi apresentado em CADEIA_ERRADA, com a diferença de que, desta vez, identifica comentários que não foram devidamente fechados;
- ERRO: semelhante ao que foi apresentado nos dois padrões anteriores, mas, desta vez, identifica caracteres que não foram definidos na gramática (como o símbolo de $).

Após isso, foi definido o restante da gramática para este trabalho:

- programa: 
- declaracoes: 
- decl_local_global: 
- declaracao_local: 
- variavel: 
- identificador: 
- dimensao: 
- tipo: 
- tipo_basico: 
- tipo_basico_ident: 
- tipo_estendido: 
- valor_constante: 
- registro: 
- declaracao_global: 
- parametro: 
- parametros: 
- corpo: 
- cmd: 
- cmdLeia: 
- cmdEscreva: 
- cmdSe: 
- cmdCaso: 
- cmdPara: 
- cmdEnquanto: 
- cmdFaca: 
- cmdAtribuicao: 
- cmdChamada: 
- cmdRetorne: 
- selecao: 
- item_selecao: 
- constantes: 
- numero_intervalo: 
- op_unario: 
- exp_aritmetica: 
- termo: 
- fator: 
- op1: 
- op2: 
- op3: 
- parcela: 
- parcela_unario: 
- parcela_nao_unario: 
- exp_relacional: 
- op_relacional: 
- expressao: 
- termo_logico: 
- fator_logico: 
- parcela_logica: 
- op_logico_1: 
- op_logico_2: 
