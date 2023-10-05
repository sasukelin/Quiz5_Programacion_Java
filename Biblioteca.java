import java.util.LinkedList;
public class Biblioteca {
    //Atributos
    // Lista para almacenar los libros disponibles en la biblioteca
    private LinkedList<Libro> librosDisponibles = new LinkedList<>();



    // Método para registrar un libro en la biblioteca
    public void registrarLibro(Libro Libro) {
        librosDisponibles.add(Libro);

    }
    // Método para buscar un libro por título
    public Libro buscarLibro(String titulo) {
        Libro libroEncontrado = null;

    // Recorrido aa la lista de libros disponibles
        for (Libro libro : librosDisponibles) {
            if (libro.getTituloLibro().equalsIgnoreCase(titulo)) {
                libroEncontrado = libro;
                break;
            }
        }
        return libroEncontrado;// Devolvemos el libro encontrado (o null si no se encontró)
    }


    // Método para mostrar los libros disponibles en la biblioteca
    public void mostrarLibrosDisponibles() {
        if (librosDisponibles.isEmpty()) {
            System.out.println("No hay libros disponibles en la biblioteca.");
        } else {
            System.out.println("Libros disponibles en la biblioteca:");
            System.out.println("----------------------");
            for (Libro libro : librosDisponibles) {
                System.out.println("Título: " + libro.getTituloLibro());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Número de páginas: " + libro.getNumeroPaginas());
                System.out.println("----------------------");
            }
        }
    }
}




