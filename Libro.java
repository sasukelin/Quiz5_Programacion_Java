public class Libro  {
    private String tituloLibro;
    private String autor;
    private int numeroPaginas;

    /**
     * clase Libro
     */


        /**
         * Método constuctor para inicializar los atributos de la clase
         * @param tituloLibro titulo del libro
         * @param autor autor del libro
         * @param numeroPaginas numero de paginas del libro
         *
         * Complejidad temporal: O(1) Tiempo constante
         */
        public  Libro (String  tituloLibro, String  autor, int  numeroPaginas){
            this. tituloLibro =  tituloLibro;
            this. autor =  autor;
            this.numeroPaginas =numeroPaginas;

        }

        /**
         * Método para obtener el titulo del libro
         * @return Retorna el titulo del libro
         *
         * Complejidad temporal: O(1) Tiempo constante
         */
        public String getTituloLibro() {
            return tituloLibro;
        }
        /**
         * Método para  modificar el titulo del libro
         * @set establece o modifica el titulo del libro
         *
         * Complejidad temporal: O(1) Tiempo constante
         */
        public void settituloLibro() {
            this.tituloLibro = tituloLibro;
        }
        /**
         * Método para obtener el autor del libro
         * @return Retorna el autor  del libro
         *
         * Complejidad temporal: O(1) Tiempo constante
         */
        public String getAutor() {
            return autor;
        }
        /**
         * Método para  modificar el autor del libro
         * @set establece o modifica el autor  del libro
         *
         * Complejidad temporal: O(1) Tiempo constante
         */
        public void setAutor(String autor) {
            this.autor = autor;
        }
        /**
         * Método para obtener el numero de paginas del libro
         * @return Retorna el numero de paginas  del libro
         *
         * Complejidad temporal: O(1) Tiempo constante
         */
        public int getNumeroPaginas() {
            return numeroPaginas;
        }






    }
