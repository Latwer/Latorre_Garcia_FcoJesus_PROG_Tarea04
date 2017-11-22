package arrays;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 * Crea, dentro del paquete arrays, una clase llamada Triangulo con sus tres
 * vértices como atributos y con la visibilidad adecuada. Haz un commit. Crea un
 * constructor para esta clase que acepte como parámetros los vértices del
 * triángulo y los asigne a los atributos. Haz un commit. Crea los métodos get
 * para los diferentes atributos con su visibilidad adecuada. Haz un commit.
 * Crea un método llamado toString que devolverá un String que será la
 * representación de dicho triángulo: A(x, y) B(x, y) C(x, y). Haz un commit.
 * Crea un método llamado perímetro que devolverá el perímetro del triángulo. El
 * perímetro de un triángulo se halla sumando sus lados. Por lo que deberás
 * hallar los tres lados (AB, AC, BC) y sumarlo. Para hallar cada lado puedes
 * recurrir a la distancia entre un punto y otro implementada en la clase Punto.
 * Haz un commit.
 */
public class Triangulo {

    private Punto verticeA;
    private Punto verticeB;
    private Punto verticeC;

    public Triangulo(Punto verticeA, Punto verticeB, Punto verticeC) {
        this.verticeA = verticeA;
        this.verticeB = verticeB;
        this.verticeC = verticeC;
    }

    private Punto getVerticeA() {
        return verticeA;
    }

    private Punto getVerticeB() {
        return verticeB;
    }

    private Punto getVerticeC() {
        return verticeC;
    }

    public String toString() {
        return "A= " + verticeA + ", B= " + verticeB + ", C= " + verticeC;
    }

    public double perimetro() {
        double distanciaAB = verticeA.distancia(verticeB);
        double distanciaAC = verticeA.distancia(verticeC);
        double distanciaBC = verticeB.distancia(verticeC);
        double perimetro = distanciaAB + distanciaAC + distanciaBC;
        return perimetro;
    }
}
