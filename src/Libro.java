import java.util.Date;


    public class Libro {

        private static Long nextId=0L;
        private Long idLibro;
        private String titulo;
        private String autor;
        private String isbn;
        private int anioPublicacion;
        private Integer stock;

        public Libro( String titulo, String autor, String isbn, int anioPublicacion, Integer stock){
            this.idLibro=nextId++;
            this.titulo=titulo;
            this.autor=autor;
            this.isbn=isbn;
            this.anioPublicacion=anioPublicacion;
            this.stock=stock;
        }

        public Libro(){

        }

        public Long getIdLibro() {
            return idLibro;
        }

        public void setIdLibro(Long idLibro) {
            this.idLibro = idLibro;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        public String getIsbn() {
            return isbn;
        }

        public void setIsbn(String isbn) {
            this.isbn = isbn;
        }

        public int getAnioPublicacion() {
            return anioPublicacion;
        }

        public void setAnioPublicacion(int anioPublicacion) {
            this.anioPublicacion = anioPublicacion;
        }

        public Integer getStock() {
            return stock;
        }

        public void setStock(Integer stock) {
            this.stock = stock;
        }

        public void mostrarInformacion(){
            System.out.println(
                    "id: "+this.idLibro+
                            "\n titulos: "+ this.titulo +
                            "\n autor: "+ this.autor+
                            "\n isbn: "+ this.isbn+
                            "\n Año publicacion: "+ this.anioPublicacion+
                            "\n Stock: "+ this.stock);
        }

        public void disminuirStock(){
            if (this.stock>0){
                this.stock = this.stock-1;
            }

        }

        public void aumentarStock(){
            this.stock = this.stock+1;
        }


        @Override
        public String toString(){
            return "Libro{"+
                    "idLibro= "+idLibro+
                    ", titulos= '"+titulo+'\''+
                    ", autor= '"+autor+'\''+
                    ", isbn= '"+isbn+'\''+
                    ", anioPublicacion= '"+anioPublicacion+'\''+
                    ", stock= '"+stock+'\'';

        }

    }

