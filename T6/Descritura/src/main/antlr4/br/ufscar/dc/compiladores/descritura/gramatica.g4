// comentar
grammar gramatica;

IDENTIFICADOR : ('a'..'z'|'A'..'Z') ('_'|'a'..'z'|'A'..'Z'|'0'..'9')*;

CADEIA : '"' ( ESC_SEQ | ~('"'|'\\'|'\n') )* '"';
fragment
ESC_SEQ	: '\\"' | '\\n';

// comentário vai ser { ... }
COMENTARIO : '{' ~('}')* '}'
    -> skip;

WS : ( ' ' | '\t' | '\r' | '\n' ) {skip();};

programa : estrutura historia EOF;

delim : ':';

estrutura : 'estrutura' IDENTIFICADOR delim nome arquetipos elementos;
arquetipos : 'arquetipos' delim CADEIA (',' CADEIA)*;
elementos : 'elementos' delim CADEIA (',' CADEIA)*;

historia : 'historia' delim nome nomeAutor (',' nomeAutor)* sinopse versaoRascunho? data? declaracaoGlobal* capitulo*;
nome : 'nome' delim CADEIA;
nomeAutor : 'autor' delim CADEIA (',' CADEIA)*;
sinopse : 'sinopse' delim CADEIA;
versaoRascunho : 'versao' delim CADEIA;
data : 'data' delim CADEIA;

declaracaoGlobal : personagem;

personagem : 'personagem' IDENTIFICADOR delim nome arquetipo;
arquetipo : 'arquetipo' delim CADEIA;

capitulo : 'capitulo' IDENTIFICADOR delim nome sinopse elemento personagens;
elemento : 'elemento' delim CADEIA (',' CADEIA)*;
personagens : 'personagens' delim personagemDec (',' personagemDec)*;

personagemDec : IDENTIFICADOR;
