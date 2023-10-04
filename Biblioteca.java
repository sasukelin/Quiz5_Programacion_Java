import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    /**
     * Clase Biblioteca
     * Explicación: Esta clase representa una biblioteca que almacena libros disponibles de la biblioteca. En este caso, se utiliza un ArrayList para
     * almacenar los libros disponibles y da acceso directo a los lirbos disponibles
     * a los elementos.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    // Atributo
    private List<Libro> librosDisponibles;

    // Constructor
    public Biblioteca() {
        librosDisponibles = new ArrayList<>(); // Inicializa la lista de libros disponibles como un ArrayList
    }

    // Método para registrar un libro
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro); // Agrega un libro a la lista de libros disponibles
    }

    // Método para mostrar la información de todos los libros disponibles
    public List<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles; // Devuelve la lista de libros disponibles
    }
}



