package Indentidad;

/**
 *
 * @author Stilo
 */
public class Ejercicio1 {

    public long ISBN;
    public String nombre;
    public String autor;
    public int NumPag;

    public Ejercicio1() {
    }

    @Override
    public String toString() {
        return "Libro: " + "ISBN=" + ISBN + ", nombre=" + nombre + ", autor=" + autor + ", NumPag=" + NumPag  ;
    }

    public Ejercicio1(long ISBN, String nombre, String autor, int NumPag) {

        this.nombre = nombre;
        this.autor = autor;
        this.ISBN = ISBN;
        this.NumPag = NumPag;
    }

}
