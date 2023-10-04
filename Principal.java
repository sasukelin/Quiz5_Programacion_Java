import java.util.ArrayList;
import java.util.List;
public class Principal {
    /**
     * Método main
     * Explicación: Este método es el punto de entrada de la aplicación y se utiliza para crear una instancia de la clase Biblioteca,
     * registrar libros y mostrar información sobre los libros.
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     * Complejidad temporal: O(1) - Tiempo constante.
     */

        public static void main(String[] args) {
            Biblioteca bibliotecaKonradLorenz = new Biblioteca();

            Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
            Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
            Libro libro3 = new Libro("1984", "George Orwell", 326);
            Libro libro4 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
            Libro libro5 = new Libro("La Odisea", "Homero", 448);


            // Registro de los libros en la biblioteca

            bibliotecaKonradLorenz.registrarLibro(libro1);
            bibliotecaKonradLorenz.registrarLibro(libro2);
            bibliotecaKonradLorenz.registrarLibro(libro3);
            bibliotecaKonradLorenz.registrarLibro(libro4);
            bibliotecaKonradLorenz.registrarLibro(libro5);

            // Muestra la informacion de cada uno de los libros disponibles en la bibloteca


            System.out.println("Información de los libros disponibles en la biblioteca:");
            List<Libro> librosDisponibles = bibliotecaKonradLorenz.mostrarLibrosDisponibles();
            for (Libro libro : librosDisponibles) {
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Número de Páginas: " + libro.getNumeroPaginas());
                System.out.println("----------------------");
            }
        }
}







