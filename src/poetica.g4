grammar poetica;

// Parser
prog : imports? (function | vardeclaration | error)+ ;
error : ID #errorId;
imports : 'include ' STRING #importSection;
vardeclaration : type ID ('=' expr)? (',' ID ('=' expr)?)* ';' #variableDeclaration;
type : T_INT | T_FLOAT | T_VOID;
function : type ID '(' formalargs? ')' funblock;
formalargs : arg (',' arg)* #arguments;
arg : type ID #argument;
expr : ID '(' exprList? ')' #funCall
        | expr ('*'|'/') expr #MulSub
        | expr ('+'|'-') expr #AddSub
        | expr '%' expr #Mod
        | ID('++'|'--') #shorthand
        | expr ('&&'|'||') expr #AndOr
        | '!'expr #Not
        | '(' expr ')' '?' expr ':' expr #Ternery
        | expr ('=='|'!='|'>'|'<'|'>='|'<=') expr #Relative
        | '(' expr ')' #parantheses
        | ID #variable
        | STRING #string
        | INT #int
        | FLOAT #float;
exprList : expr (',' expr)*;
funblock : '{' stat* '}';
block : '{' stat* '}' | stat;
stat : vardeclaration #variableDeclarationStat
        | expr ';' #expressionStat
        | ID ':' #label
        | 'if' '(' expr ')' block ( 'else' block)? #if
        | 'for' '(' vardeclaration  expr ';' expr ')' block #for
        | 'while' '(' expr ')' block #while
        | 'do' '{' block '}' 'while' '(' expr ')' ';' #dowhile
        | expr ('=' expr)+ ';' #assignment
        | 'break' ';' #break
        | 'continue' ';' #continue
        | 'goto' ID ';' #goto
        | 'return' expr? ';' #return;

// Lexer
T_INT : 'int';
T_FLOAT : 'float';
T_VOID : 'void';
ID : ('_'|LETTER) (LETTER|DIGIT|'_')*;
INT : '0'|[1-9]DIGIT*;
FLOAT: INT'.'INT;
STRING : '"' .*? '"';
WS : [ \t\n\r]+ -> skip;
SLC : '//' .*? '\n' -> skip;
MLC : '/*' .*? '*/' -> skip;
fragment LETTER : [a-zA-Z];
DIGIT : [0-9];
