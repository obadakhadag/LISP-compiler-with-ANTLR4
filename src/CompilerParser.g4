parser grammar CompilerParser;

options { tokenVocab=Compiler; }

program
  : expr* EOF
  ;

expr
  : atom
  | list
  ;

list
  : OPEN_PAREN listContent CLOSE_PAREN
  ;

listContent
  : functionDefinition
  | ifExpression
  | condExpression
  | lambdaExpression
  | letExpression
  | doExpression
  | arithmeticExpression
  | logicalExpression
  | functionCall
  | expr*        // fallback for lists of arbitrary expressions
  ;

functionDefinition
  : DEFINE_FUNCTION IDENTIFIER formalParams body+
  ;

formalParams
  : OPEN_PAREN IDENTIFIER* CLOSE_PAREN
  ;

ifExpression
  : IF expr expr expr?     // if condition then [else]
  ;

condExpression
  : CONDITIONAL clause+
  ;

clause
  : OPEN_PAREN expr+ CLOSE_PAREN
  ;

lambdaExpression
  : LAMBDA formalParams body+
  ;

letExpression
  : LET OPEN_PAREN binding+ CLOSE_PAREN body+
  ;

binding
  : OPEN_PAREN IDENTIFIER expr CLOSE_PAREN
  ;

doExpression
  : DO expr+
  ;

arithmeticExpression
  : (PLUS | MINUS | MULTIPLY | DIVIDE
    | GREATER_THAN | LESS_THAN
    | GREATER_EQUAL | LESS_EQUAL
    | EQUAL_OP | NOT_EQUAL) expr+
  ;

logicalExpression
  : (AND | OR | NOT) expr+
  ;

functionCall
  : IDENTIFIER expr*
  ;

atom
  : IDENTIFIER
  | NUMBER
  | STRING
  ;

body
  : expr
  ;
