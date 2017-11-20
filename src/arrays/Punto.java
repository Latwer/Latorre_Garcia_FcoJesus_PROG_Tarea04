package arrays;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 * 6. Crea un paquete llamado arrays. Crea en él la clase Punto con sus dos
 * atributos (x e y) y la visibilidad adecuada. 7. Crea un constructor con
 * parámetros que actualice el valor de los atributos correctamente. 8. Crea los
 * métodos get para los atributos. 9. Crea un método llamado toString que
 * devolverá un String que será la representación de dicho punto: (x, y). 10.
 * Crea un método llamado distancia que devuelva la distancia entre el punto y
 * otro pasado por parámetro. Para ello puedes utilizar la siguiente fórmula:
 */
public class Punto {

    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
