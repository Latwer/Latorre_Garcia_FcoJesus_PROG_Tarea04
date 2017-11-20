package cadenas;

import utilidades.Entrada;

/**
 * @author Francisco Jesus Latorre Garcia <franlatorregarcia@gmail.com>
 * Realiza un programa que lea una palabra por teclado y determine si es una
 * palabra panvocálica o no. Una palabra es panvocálica si contiene al menos las
 * cinco vocales.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.printf("Introduce una cadena de caracteres: ");
        String cadena = Entrada.cadena();
        int cadenaA, cadenaE, cadenaI, cadenaO, cadenaU, cadenaa, cadenae, cadenai, cadenao, cadenau;
        cadenaA = (cadena.indexOf("A"));
        cadenaE = (cadena.indexOf("E"));
        cadenaI = (cadena.indexOf("I"));
        cadenaO = (cadena.indexOf("O"));
        cadenaU = (cadena.indexOf("U"));
        cadenaa = (cadena.indexOf("a"));
        cadenae = (cadena.indexOf("e"));
        cadenai = (cadena.indexOf("i"));
        cadenao = (cadena.indexOf("o"));
        cadenau = (cadena.indexOf("u"));
        if (cadenaA >= 0 && cadenaE >= 0 && cadenaI >= 0 && cadenaO >= 0 && cadenaU >= 0
                && cadenaa >= 0 && cadenae >= 0 && cadenai >= 0 && cadenao >= 0 && cadenau >= 0) {
            System.out.println("Esta cadena es panvocálica.");
        } else {
            System.out.println("Esta cadena de caracteres no es panvocálica.");
        }
    }
}
