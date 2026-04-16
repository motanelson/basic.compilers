grammar basic;

// ==========================
// Parser
// ==========================

program
    : (statement NEWLINE)* EOF
    ;

// ==========================
// Statements
// ==========================

statement
    : variableDeclaration
    | assignment
    | functionDefinition
    | subroutineDefinition
    | ifStatement
    | forLoop
    | whileLoop
    | printStatement
    ;

// ==========================
// Variáveis
// ==========================

variableDeclaration
    : DIM Identifier (AS typeSpecifier)? ('=' expression)?
    ;

typeSpecifier
    : INTEGER
    | SINGLE
    | DOUBLE
    | STRING
    ;

// ==========================
// Atribuição
// ==========================

assignment
    : Identifier '=' expression
    ;

// ==========================
// Funções / Subs
// ==========================

functionDefinition
    : FUNCTION Identifier '(' parameterList? ')' AS typeSpecifier NEWLINE
      (statement NEWLINE)*
      END FUNCTION
    ;

subroutineDefinition
    : SUB Identifier '(' parameterList? ')' NEWLINE
      (statement NEWLINE)*
      END SUB
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : Identifier AS typeSpecifier
    ;

// ==========================
// Controlo
// ==========================

ifStatement
    : IF expression THEN NEWLINE
      (statement NEWLINE)*
      (ELSEIF expression THEN NEWLINE (statement NEWLINE)*)*
      (ELSE NEWLINE (statement NEWLINE)*)?
      END IF
    ;

forLoop
    : FOR Identifier '=' expression TO expression (STEP expression)? NEWLINE
      (statement NEWLINE)*
      NEXT Identifier?
    ;

whileLoop
    : WHILE expression NEWLINE
      (statement NEWLINE)*
      WEND
    ;

// ==========================
// PRINT
// ==========================

printStatement
    : PRINT expression (',' expression)*
    ;

// ==========================
// EXPRESSÕES
// ==========================

expression
    : logicalOrExpression
    ;

logicalOrExpression
    : logicalAndExpression (OR logicalAndExpression)*
    ;

logicalAndExpression
    : equalityExpression (AND equalityExpression)*
    ;

equalityExpression
    : relationalExpression (('=' | '<>' | '<' | '>' | '<=' | '>=') relationalExpression)*
    ;

relationalExpression
    : additiveExpression
    ;

additiveExpression
    : multiplicativeExpression (('+' | '-') multiplicativeExpression)*
    ;

multiplicativeExpression
    : unaryExpression (('*' | '/') unaryExpression)*
    ;

unaryExpression
    : ('+' | '-')? primaryExpression
    ;

primaryExpression
    : Identifier '(' argumentList? ')'   // chamada de função
    | Identifier
    | IntegerLiteral
    | FloatingLiteral
    | StringLiteral
    | '(' expression ')'
    ;

argumentList
    : expression (',' expression)*
    ;

// ==========================
// LEXER (KEYWORDS)
// ==========================

DIM: 'DIM';
AS: 'AS';

INTEGER: 'INTEGER';
SINGLE: 'SINGLE';
DOUBLE: 'DOUBLE';
STRING: 'STRING';

FUNCTION: 'FUNCTION';
SUB: 'SUB';
END: 'END';

IF: 'IF';
THEN: 'THEN';
ELSEIF: 'ELSEIF';
ELSE: 'ELSE';

FOR: 'FOR';
TO: 'TO';
STEP: 'STEP';
NEXT: 'NEXT';

WHILE: 'WHILE';
WEND: 'WEND';

PRINT: 'PRINT';

OR: 'OR';
AND: 'AND';

// ==========================
// TOKENS
// ==========================

Identifier
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

IntegerLiteral
    : [0-9]+
    ;

FloatingLiteral
    : [0-9]+ '.' [0-9]*
    ;

StringLiteral
    : '"' (~["\r\n])* '"'
    ;

NEWLINE
    : '\r'? '\n'
    ;

Whitespace
    : [ \t]+ -> skip
    ;

Comment
    : '\'' ~[\r\n]* -> skip
    ;