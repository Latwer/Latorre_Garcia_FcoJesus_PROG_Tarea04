package cadenas;

import java.util.regex.*;
import utilidades.Entrada;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 * Realiza un programa que pida por teclado una matrícula española: si es
 * correcta mostrará los números por un lado y las letras por otro, de lo
 * contrario informará que no es válida. Debes utilizar expresiones regulares y
 * grupos para resolverlo. Recuerda que en las letras de las matrículas no se
 * utilizan las vocales.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.printf("Introduce una matrícula española: ");
        String matricula = Entrada.cadena();
        Pattern patron = Pattern.compile("(\\d{4})([bcdfghjklmnñpqrstvwxyzBCDFGHJKLMNÑPQRSTVWXYZ]{3})");
        Matcher emparejador = patron.matcher(matricula);
        if (emparejador.matches()) {
            System.out.println("Números:" + emparejador.group(1));
            System.out.println("Letras:" + emparejador.group(2));
        } else {
            System.out.println("No, no contiene el patrón");
        }
    }
}
