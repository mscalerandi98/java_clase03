package clase04;

public class Libro {

    private String titulo;
    private String isbn;
    private String autor;
    private boolean estaPrestado;

    public Libro() {
    }

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean prestamo(){
        if (!estaPrestado){
            System.out.println("Prestamo habilidado");
            estaPrestado = true;
        }else {
            System.out.println("No se puede realizar el prestamo");
        }
        return  estaPrestado;
    }

    private boolean isEstaPrestado() {
        return estaPrestado;
    }

    public void setEstaPrestado(boolean estaPrestado) {
        this.estaPrestado = estaPrestado;
    }

    public boolean devolucion(){
        if (estaPrestado){
            estaPrestado = false;
            System.out.println("El libro: " + this.titulo + " fue devuelto");
        }else {
            System.out.println("No se puede devolver el libro");
        }
        return estaPrestado;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
