lexer grammar Compiler;

// Keywords
DEFINE_FUNCTION: 'defun';
IF: 'if';
CONDITIONAL: 'cond';
LET: 'let';
LET_STAR: 'let*';
LET_REC: 'letrec';
DO: 'do';
PROGN: 'progn';
QUOTE: 'quote';
QUASIQUOTE: 'quasiquote';
UNQUOTE: 'unquote';
UNQUOTE_SPLICING: 'unquote-splicing';
LAMBDA: 'lambda';
BEGIN: 'begin';
RETURN: 'return';
CAR: 'car';
CDR: 'cdr';
CONS: 'cons';
ATOM: 'atom';
EQ: 'eq';
EQUAL: 'equal';
NOT: 'not';
AND: 'and';
OR: 'or';
NULL: 'null';

// Operators
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
GREATER_THAN: '>';
LESS_THAN: '<';
GREATER_EQUAL: '>=';
LESS_EQUAL: '<=';
EQUAL_OP: '=';
NOT_EQUAL: '/=';

// Parentheses
OPEN_PAREN: '(';
CLOSE_PAREN: ')';

// Literals
NUMBER
    :   DIGIT+ ('.' DIGIT+)?
    ;

STRING
    :   '"' ( ~["\\] | '\\' . )* '"'
    ;

// Identifiers
IDENTIFIER
    :   [a-zA-Z_+\-*/<>!=?][a-zA-Z0-9_+\-*/<>!=?]*
    ;

// Comments
COMMENT
    :   ';' ~[\r\n]* -> skip
    ;

// Whitespace
WS
    :   [ \t\r\n]+ -> skip
    ;

// Fragment Rules
fragment DIGIT : [0-9];
