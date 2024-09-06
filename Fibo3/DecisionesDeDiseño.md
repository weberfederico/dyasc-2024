Consigna:
-

Partiendo del ejercicio Fibonacci 2, copiarlo en otra carpeta llamada Fibo3 y a partir de eso realizar las modificaciones necesarias para soportar las siguientes opciones:

-f=xxxxxx: escribe la salida en el archivo cuyo nombre se especifique.

-m=s: donde m define el modo de funcionamiento, el cual puede ser "l" o "s", "l" significa "lista", lo cual es el comportamiento actual en fibo2. 
"s"  significa "sumatoria" y significa que el programa debe calcular la sumatoria de los items de la secuencia de fibonacci del número especificado.

El programa puede invocarse sin la opción "-m" en cuyo caso el comportamiento debe ser por default debe ser el de fibo2.

![image](https://github.com/user-attachments/assets/3af086ce-cd7e-46a6-aac7-07ea7ca78ffd)

Decisiones de Diseño:
-

![image](https://github.com/user-attachments/assets/5c7229d4-0a5c-4d4d-8e84-783b7fba817a)

Se decidio utiliar una clase llamada Fibonacci la cual contendria el metodo denomindado "generarSecuenciaFibonacci", este solo se encarga de generar la secuencia y nada mas.
Por otro lado, la clase ModificarFibonacci es la que se encargara de modificar la secuencia manteniendo las modificaciones de Fibo2 y las nuevas opciones de Fibo3. Por ultimo,
la clase Ejecutable, la cual depende de las dos anteriores como de denota en el diagrama, se encarga de manejar la entrada del usuario, generar la secuencia de Fibonacci, 
y gestionar la salida.

Requisitos implicitos: 

1. No se especifica que tipo de archivo debe ser el de salida, si bien en el ejemplo se muestra con el uso de .txt, se opto por generar un archivo sin formato el cual
el propio usuario elegira como abrirlo.

2. No se explica cómo debería manejarse la validación de los parámetros incorrectos o faltantes, es decir, que sucede si se pasa un valor no válido para -m (distinto de "l" o "s")
o si -f no tiene un nombre válido de archivo. Para este caso de opto indicar mediante un try y catch que si el archivo no tiene un nombre valido lo indique por pantalla.


