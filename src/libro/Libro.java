package libro;

import Indentidad.Ejercicio1;
import java.util.Scanner;

public class Libro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Ejercicio1 L1 = new Ejercicio1();

        leerlibro(L1);
        mostrarlibro(L1);
    }

    private static void leerlibro(Ejercicio1 L1) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese titulo del libro:");
        L1.nombre = leer.nextLine();
        System.out.println("Ingrese autor del libro:");
        L1.autor = leer.nextLine();
        System.out.println("Ingrese ISBN del libro:");
        L1.ISBN = leer.nextLong();

        System.out.println("Ingrese numero de paginas:");
        L1.NumPag = leer.nextInt();

    }

    private static void mostrarlibro(Ejercicio1 L1) {
        System.out.println(L1.toString()); 
    }

}
  