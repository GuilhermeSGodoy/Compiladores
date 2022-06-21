lexer grammar t1Lex;

@lexer::members {
void erroLexico(String mensagem) {
    throw new RuntimeException(mensagem);
}
}

PALAVRA_CHAVE : 'declare' | 'algoritmo' | 'literal' | 'inteiro' | 'real' | 'logico' | 'leia' | 'escreva' | 'se' 
        | 'entao' | 'senao' | 'fim_se' | 'caso' | 'seja' | 'fim_caso' | 'para'| 'ate' | 'faca' | 'fim_para'
        | 'enquanto' | 'fim_enquanto' | 'registro' | 'fim_registro' | 'procedimento' | 'fim_procedimento'
        | 'tipo' | 'var' | 'funcao' | 'retorne' | 'fim_funcao' | 'constante' | 'fim_algoritmo';
 
NUM_INT	: ('0'..'9')+;

NUM_REAL : ('0'..'9')+ ('.' ('0'..'9')+)?;

OP_ARIT	: '+' | '-' | '*' | '/' | '%';

OP_REL : '>' | '>=' | '<' | '<=' | '<>' | '=';

OP_LOG : 'e' | 'ou' | 'nao' | 'verdadeiro' | 'falso';

IDENT : ('a'..'z'|'A'..'Z') ('_'|'a'..'z'|'A'..'Z'|'0'..'9')*;

CADEIA : '"' ( ESC_SEQ | ~('"'|'\\'|'\n') )* '"';
fragment
ESC_SEQ	: '\\"';

COMENTARIO : '{' ~('\n'|'}')* '}'
    -> skip;

WS : ( ' ' | '\t' | '\r' | '\n' ) {skip();};

CARACTERE_ESP : ',' | '<-' | '..' | '^' | '&' |'.' | '[' | ']' | '(' | ')' | ':';

CADEIA_ERRADA : '"' ( ESC_SEQ | ~('"'|'\\'|'\n'))* '\n'
        {erroLexico("Linha " + (getLine() - 1) + ": cadeia literal nao fechada");};

COMENTARIO_ERRADO : '{' ~('\n'|'}')* '\n'
        {erroLexico("Linha " + (getLine() - 1) + ": comentario nao fechado");};

ERRO: . {erroLexico("Linha " + getLine() + ": " + getText() + " - simbolo nao identificado");};