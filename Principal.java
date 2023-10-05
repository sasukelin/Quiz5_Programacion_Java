
public class Principal {
    /**
     * Método Principal
     * Este método es el punto de entrada de la aplicación. Crea una instancia de la clase Biblioteca
     * y registra varios libros en ella. Luego, muestra la información de los libros disponibles
     * de la biblioteca.
     * Complejidad temporal: O(1) - Tiempo constante.
     */


    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();

        // Registrar libros

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

        bibliotecaKonradLorenz.mostrarLibrosDisponibles();

    }
}