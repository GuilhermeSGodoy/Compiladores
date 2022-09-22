// Declaração da gramática da linguagem.
grammar gramatica;

/* Elementos básicos da linguagem */

// Identificador refere-se à declaração de variáveis dentro da linguagem,
// que no caso são os personagens e capítulos.
IDENTIFICADOR : ('a'..'z'|'A'..'Z') ('_'|'a'..'z'|'A'..'Z'|'0'..'9')*;

// Cadeias de caracteres referentes aos nomes dos conteúdos declarados.
// Note que cadeias devem ser declaradas entre aspas duplas.
CADEIA : '"' ( ESC_SEQ | ~('"'|'\\'|'\n') )* '"';
fragment
ESC_SEQ	: '\\"' | '\\n';

// Comentários utilizados como anotações dentro dos programas.
// Comentários são escritos entre chaves.
COMENTARIO : '{' ~('}')* '}'
    -> skip;

// Espaços e símbolos que devem ser ignorados pelo compilador.
WS : ( ' ' | '\t' | '\r' | '\n' ) {skip();};

/* Elementos característicos da linguagem */

// Um programa é caracterizado por uma declaração de estrutura e da história.
programa : estrutura historia EOF;

// Delimitador utilizado em declarações.
delim : ':';

// A estrutura é declarada a partir de um identificador e é composta por um
// nome, um conjunto de arquétipos e um conjunto de elementos.
estrutura : 'estrutura' IDENTIFICADOR delim nome arquetipos elementos;
// Um nome é um cadeia de caracteres.
nome : 'nome' delim CADEIA;
// A declaração de arquétipos é feita a partir de uma ou mais cadeias de caracteres
// que contêm os arquétipos dos personagens que serão descritas.
arquetipos : 'arquetipos' delim CADEIA (',' CADEIA)*;
// A declaração de elementos é feita a partir de uma ou mais cadeias de caracteres
// que contêm os elementos da história que será descrita.
elementos : 'elementos' delim CADEIA (',' CADEIA)*;

// A história é declarada a partir de um identificador e é composta por um nome, o nome do
// autor (pode haver mais de um autor), uma sinopse e dois parâmetros opcionais: a versão
// do rascunho e a data da última modificação. Por fim, é composta pela declaração dos
// personagens e dos capítulos da história.
historia : 'historia' delim nome nomeAutor (',' nomeAutor)* sinopse versaoRascunho? data? declaracaoGlobal* capitulo*;
// O nome do autor é uma cadeia de caracteres, podendo ser agregado de outros nomes
// separados por vírgulas.
nomeAutor : 'autor' delim CADEIA (',' CADEIA)*;
// A sinopse é uma cadeia de caracteres.
sinopse : 'sinopse' delim CADEIA;
// A versão do rascunho é uma cadeia de caracteres, mas espera-se que seja obedecido o formato
// numérico (1.0, 2.1.3 etc).
versaoRascunho : 'versao' delim CADEIA;
// A data é uma cadeia de caracteres, mas espera-se que seja obedecido o formato de uma data
// separada por barras (01/01/2000) ou por extenso (01 de janeiro de 2000).
data : 'data' delim CADEIA;

// As declarações globais da linguagem resumem-se à declaração dos personagens.
declaracaoGlobal : personagem;

// Um personagem é declarado a partir de um identificador e contém um nome e seu
// respectivo arquétipo.
personagem : 'personagem' IDENTIFICADOR delim nome arquetipo;
// Note que apenas um arquétipo pode ser declarado para um personagem.
arquetipo : 'arquetipo' delim CADEIA;

// Um capítulo é declarado a partir de um identificador e contém um nome, uma sinopse,
// um conjunto de elementos e um conjunto de personagens.
capitulo : 'capitulo' IDENTIFICADOR delim nome sinopse elemento personagens;
// Dentro da declaração de capítulos, podem ser adicionados diversos elementos, desde
// que não haja repetições.
elemento : 'elemento' delim CADEIA (',' CADEIA)*;
// Dentro da declaração de capítulos, podem ser adicionados um ou mais personagens,
// referidos por seus identificadores.
personagens : 'personagens' delim personagemDec (',' personagemDec)*;

// Token auxiliar utilizado para obter o identificador do personagem dentro da declaração
// de capítulos.
personagemDec : IDENTIFICADOR;
