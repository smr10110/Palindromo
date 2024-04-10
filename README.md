Paso 1:

1.1)

**¿Qué hace el método?**
R: El metodo verifica si la cadena original es igual a su versión invertida. Es decir, verifica que la palabra sea un palindromo

**¿Cómo lo hace?**
R: El metodo esPalindromo convierte la cadena en un arreglo de caracteres, lo invierte, lo vuelve a unir en una cadena y compara el resultado con la cadena original para determinar si es un palindromo

**¿Cómo lo uso?**
R: Se llama al metodo pasando una cadena como argumento
Ej:
esPalindromo("ana"), el metodo retornara true porque "ana" se lee igual al derecho y al reves

Paso 2:

2.1)

El metodo realiza los siguientes pasos para comprobar si una palabra es un palindromo:

1. Se le entrega una cadena de caracteres como argumento al metodo esPalindromo.
2. Divide la cadena en un arreglo de caracteres con split('').
3. Invierte el arreglo con reverse().
4. Une los caracteres del arreglo invertido para formar una cadena con join('').
5. Compara la cadena original con la invertida para verificar si son iguales; si son iguales, el metodo retorna true y si no son iguales retorna false.