# Latorre_Garcia_FcoJesus_PROG_Tarea04
Francisco Jesús Latorre García

Ejercicio 1
Realiza un programa que lea una palabra por teclado y determine si es una palabra panvocálica o no. Una palabra es panvocálica si contiene al menos las cinco vocales.

Ejercicio 2
Realiza un programa que pida por teclado una matrícula española: si es correcta mostrará los números por un lado y las letras por otro, de lo contrario informará que no es válida. Debes utilizar expresiones regulares y grupos para resolverlo. Recuerda que en las letras de las matrículas no se utilizan las vocales.

Ejercicio 3
Se pretende utilizar el diagrama de clases anterior para crear un programa que nos pida por teclado el número de triángulos a generar. Cree un array de triángulos del tamaño anteriormente introducido y cree cada triángulo con vértices generados aleatoriamente entre 0 y 100 (Math.random()*100). Una vez relleno el array lo recorrerá para calcular la media de los perímetros de los triángulos e informará del perímetro medio. Una vez hecho esto, volverá a recorrer el array para contar cuántos triángulos tienen un perímetro mayor o igual que el perímetro medio y cuántos menor. También deberá quedarse con el triángulo de mayor perímetro y de menor perímetro e informar de todo ello al usuario.

Tareas a realizar
1. Lo primero que debes hacer es crearte un repositorio en GitHub denominado Apellido1_Apellido2_Nombre_PROG_Tarea04 que será donde vayas guardando los diferentes cambios que se pide realices a la tarea. Deberás inicializar el fichero README.md con tu nombre y una descripción de la tarea.

2. Una vez hecho esto deberás clonarlo a tu espacio de trabajo y hacer que se convierta en un proyecto Java visible desde tu IDE y enlazado a dicho repositorio de GitHub.

3. Añade a tu proyecto el paquete utilidades que contendrá la clase Entrada (java - 4124 B). Haz un commit.

4. Crea un nuevo paquete nombrado cadenas. Crea en él una clase llamada Ejercicio1 que contenga un método main y que resuelva el primer ejercicio. Haz un commit.

5. En el paquete anterior crea otra clase llamada Ejercicio2  que contenga un método main y que resuelva el segundo ejercicio. Haz un commit.

6. Crea un paquete llamado arrays. Crea en él la clase Punto con sus dos atributos y la visibilidad adecuada. Haz un commit.

7. Crea un constructor con parámetros que actualice el valor de los atributos correctamente. Haz un commit.

8. Crea los métodos get para los atributos. Haz un commit.

9. Crea un método llamado toString que devolverá un String que será la representación de dicho punto: (x, y). Haz un commit.

10. Crea un método llamado distancia que devuelva la distancia entre el punto y otro pasado por parámetro. Para ello puedes utilizar la siguiente fórmula:

11. Crea, dentro del paquete arrays, una clase llamada Triangulo con sus tres vértices como atributos y con la visibilidad adecuada. Haz un commit.

12. Crea un constructor para esta clase que acepte como parámetros los vértices del triángulo y los asigne a los atributos. Haz un commit.

13. Crea los métodos get para los diferentes atributos con su visibilidad adecuada. Haz un commit.

14. Crea un método llamado toString que devolverá un String que será la representación de dicho triángulo: A(x, y) B(x, y) C(x, y). Haz un commit.

15. Crea un método llamado perímetro que devolverá el perímetro del triángulo. El perímetro de un triángulo se halla sumando sus lados. Por lo que deberás hallar los tres lados (AB, AC, BC) y sumarlo. Para hllar cada lado puedes recurrir a la distancia entre un punto y otro implementada en la clase Punto. Haz un commit.

16. Crea una clase, dentro del paquete arrays, llamada Principal que incluya un método main. Haz un commit.

17. Crea el código necesario para pedir cuántos triángulos queremos generar y cree un array de Puntos de dicho tamaño. Haz un commit.

18. Añade el código necesario para que se generen aleatoriamente los vértices de cada triángulo, para todos los triángulos. Haz un commit.

19. Añade el código necesario para calcular el perímetro medio de todos los triángulos y lo muestre al usuario. Haz un commit.

20. Añade el código necesario para calcular cuántos triángulos tienen un perímetro mayor o igual a la media y cuántos menor e informe al usuario. También debe de quedarse con el triángulo de mayor perímetro y de menor perímetro y mostrar la información de cada uno de ellos. Haz un commit y un push.
