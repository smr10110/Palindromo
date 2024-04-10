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


