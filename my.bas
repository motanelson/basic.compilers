DIM x AS INTEGER = 10
DIM y AS INTEGER

FUNCTION soma(a AS INTEGER, b AS INTEGER) AS INTEGER
    soma = a + b
END FUNCTION

y = soma(5, 3)

IF y > 5 THEN
    PRINT "Maior que 5", y
ELSE
    PRINT "Menor ou igual"
END IF

FOR i = 1 TO 10 STEP 2
    PRINT i
NEXT i

WHILE y < 20
    y = y + 1
WEND
