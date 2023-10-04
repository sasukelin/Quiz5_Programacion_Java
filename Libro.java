public class Libro  {
    private String tituloLibro;
    private String autor;
    private int numeroPaginas;

    /**
     * Constructor de la clase Libro
     * Explicación: Crea una instancia de la clase Libro con los atributos proporcionados.
     * @param titulo Una cadena de caracteres que representa el título del libro.
     * @param autor  Una cadena de caracteres que representa el autor del libro.
     * @param numeroPaginas Un entero que representa el número de páginas del libro.
     * Complejidad temporal: O(1) - Tiempo constante.
     */

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.tituloLibro = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Explicación: Este método devuelve el título del libro.
     * Método para obtener el título del libro
     *
     * @return titulo
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String getTitulo() {
        return tituloLibro;
    }

    /**
     * Explicación: Este método devuelve el título del libro.
     * Explicación: Este método devuelve el autor del libro.
     * @return autor
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Método para obtener el número de páginas del libro
     * Explicación: Este método devuelve el número de páginas del libro.
     * @return numPaginas
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    /**
     * Método para mostrar la información del libro
     * Explicación: Este método imprime la información del libro, incluyendo el título, el autor y el número de páginas.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public void info() {
        System.out.println("Titulo: " + tituloLibro);
        System.out.println("Autor: " + autor);
        System.out.println("Numero De Paginas: " + numeroPaginas);
    }

}

