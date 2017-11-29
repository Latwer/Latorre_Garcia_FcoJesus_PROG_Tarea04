package arrays;

import utilidades.Entrada;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 * Crea una clase, dentro del paquete arrays, llamada Principal que incluya un
 * método main. Haz un commit. Crea el código necesario para pedir cuántos
 * triángulos queremos generar y cree un array de Triangulos de dicho tamaño.
 * Haz un commit. Añade el código necesario para que se generen aleatoriamente
 * los vértices de cada triángulo, para todos los triángulos. Haz un commit.
 * Añade el código necesario para calcular el perímetro medio de todos los
 * triángulos y lo muestre al usuario. Haz un commit. Añade el código necesario
 * para calcular cuántos triángulos tienen un perímetro mayor o igual a la media
 * y cuántos menor e informe al usuario. También debe de quedarse con el
 * triángulo de mayor perímetro y de menor perímetro y mostrar la información de
 * cada uno de ellos. Haz un commit y un push.
 *
 * Se pretende utilizar el diagrama de clases anterior para crear un programa
 * que nos pida por teclado el número de triángulos a generar. Cree un array de
 * triángulos del tamaño anteriormente introducido y cree cada triángulo con
 * vértices generados aleatoriamente entre 0 y 100 (Math.random()*100). Una vez
 * relleno el array lo recorrerá para calcular la media de los perímetros de los
 * triángulos e informará del perímetro medio. Una vez hecho esto, volverá a
 * recorrer el array para contar cuántos triángulos tienen un perímetro mayor o
 * igual que el perímetro medio y cuántos menor. También deberá quedarse con el
 * triángulo de mayor perímetro y de menor perímetro e informar de todo ello al
 * usuario.
 */
public class Principal {

    public static void main(String[] args) {
        int tamano, contadorMayor = 0, contadorMenor = 0;
        double perimetroMedio, sumaPerimetro = 0, perimetroMayor = 0, perimetroMenor = 1000;
        Triangulo arrayTriangulos[];
        do {
            System.out.printf("¿Cuantos triángulos quieres generar? ");
            tamano = Entrada.entero();
        } while (tamano <= 0);

        arrayTriangulos = new Triangulo[tamano];

        //Creación de los triángulos
        for (int i = 0; i < arrayTriangulos.length; i++) {
            Punto verticeA = new Punto(Math.random() * 100, Math.random() * 100);
            Punto verticeB = new Punto(Math.random() * 100, Math.random() * 100);
            Punto verticeC = new Punto(Math.random() * 100, Math.random() * 100);
            arrayTriangulos[i] = new Triangulo(verticeA, verticeB, verticeC);
            //System.out.println(arrayTriangulos[i]);
            sumaPerimetro += arrayTriangulos[i].perimetro();
            //System.out.println(perimetro);
        }
        //Media de los triángulos
        perimetroMedio = sumaPerimetro / tamano;
        System.out.printf("El perímetro medio de todos los triángulos es: %.3f%n", perimetroMedio);

        //Número de triángulos mayores o menores a la media
        for (int i = 0; i < arrayTriangulos.length; i++) {
            if (perimetroMedio <= arrayTriangulos[i].perimetro()) {
                contadorMayor++;
            }
            if (perimetroMedio > arrayTriangulos[i].perimetro()) {
                contadorMenor++;
            }
            if (arrayTriangulos[i].perimetro() > perimetroMayor) {
                perimetroMayor = arrayTriangulos[i].perimetro();
            }
            if (arrayTriangulos[i].perimetro() < perimetroMenor) {
                perimetroMenor = arrayTriangulos[i].perimetro();
            }
        }
        System.out.println("El número de triángulos con un perímetro mayor o igual a la media es: " + contadorMayor);
        System.out.println("El número de triángulos con un perímetro menor a la media es: " + contadorMenor);

        //El triángulo mayor y el menor
        for (int i = 0; i < arrayTriangulos.length; i++) {
            if (perimetroMayor == arrayTriangulos[i].perimetro()) {
                System.out.printf("El triángulo con mayor perímetro es: %s y tiene un perímetro de %.3f%n", arrayTriangulos[i], perimetroMayor);
            }
        }

        for (int i = 0; i < arrayTriangulos.length; i++) {
            if (perimetroMenor == arrayTriangulos[i].perimetro()) {
                System.out.printf("El triángulo con menor perímetro es: %s y tiene un perímetro de %.3f%n", arrayTriangulos[i], perimetroMenor);
            }
        }
    }
}
