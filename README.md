Paso 1:

1.1)

¿Qué hace el método? R: El metodo verifica si la cadena original es igual a su versión invertida. Es decir, verifica que la palabra sea un palindromo

¿Cómo lo hace? R: El metodo esPalindromo convierte la cadena en un arreglo de caracteres, lo invierte, lo vuelve a unir en una cadena y compara el resultado con la cadena original para determinar si es un palindromo

¿Cómo lo uso? R: Se llama al metodo pasando una cadena como argumento Ej: esPalindromo("ana"), el metodo retornara true porque "ana" se lee igual al derecho y al reves

Paso 2:

2.1)

El metodo realiza los siguientes pasos para comprobar si una palabra es un palindromo:

Se le entrega una cadena de caracteres como argumento al metodo esPalindromo.
Divide la cadena en un arreglo de caracteres con split('').
Invierte el arreglo con reverse().
Une los caracteres del arreglo invertido para formar una cadena con join('').
Compara la cadena original con la invertida para verificar si son iguales; si son iguales, el metodo retorna true y si no son iguales retorna false.

Paso 3:

3.1) El objetivo de las pruebas es asegurar que el metodo Palindromo identifica correctamente si una cadena de texto dada es un palindromo
3.2)

Prueba 1: Palindromo Simple 
- Entrada: "anana"
- Resultado esperado: true

Prueba 2: No Palindromo
- Entrada: "hola"
- Resultado esperado: false

Prueba 3: Palabra con Mayuscula
- Entrada: "Ana"
- Resultado esperado: false

Prueba 4: Palabras separadas con espacios
- Entrada: "hola mundo"
- Resultado esperado: false

Prueba 5: cadena de texto vacio
- Entrada: " "
- Resultado esperado: true

3.4)

- Entrada: "aca"
- Resultado: true

- Entrada: "acas"
- Resultado: false

- Entrada: "h"
- Resultado: false


Paso 4:

4.1)

- Caso de prueba 1:

Input: 200 (número entero)

Resultdado esperado: false

- Caso de prueba 2:

Input: “” (cadena vacía)

Resultdado esperado: true

- Caso de prueba 3:

Input: “aaabccbaaa”

Resultdado esperado: true

- Caso de prueba 4:

Input: “ahabccbaaa”

Resultdado esperado: false

- Caso de prueba 5:

Input: “La tele letal”

Resultdado esperado: false

4.2)

¿Qué consideraciones tomaron en cuenta?
R: Basandonos en todas las pruebas que nos solicitaron se implemento manejo de entradas nulas y cadenas de texto vacias para evitar excepciones inesperadas, se normalizo la entrada convirtiéndola a minusculas y eliminando caracteres no alfanuméricos para facilitar la comparacion.

¿Qué mejoro en su metodo?
R: implementar chequeos para entradas nulas y cadenas vacías. La normalizacións de texto, convirtiendo todo a minúsculas y eliminando caracteres no alfanumericos, hace que el metodo sea eficaz al comparar correctamente ambos extremos de la cadena.

¿Qué rol jugaron las pruebas en mejorar su código?
R: Las pruebas resultaron fundamentales para la identificación de errores y excepciones, permitiendo así la optimizacion de la lógica del programa. Gracias a este proceso, se logro adaptar y perfeccionar el código para manejar adecuadamente una variedad de entradas excepcionales.