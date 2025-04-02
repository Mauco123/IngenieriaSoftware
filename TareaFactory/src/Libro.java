public class Libro implements Articulos{
    //Elementos de la clase
    private int ISBN;
    private String titulo;
    private String resena;
    private String autor;
    private float precio;
    private int numeroPaginas;

    //Constructor por defecto
    public Libro() {
    }

    //Contructor
    public Libro(int ISBN, String titulo, String resena, String autor, float precio, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.resena = resena;
        this.autor = autor;
        this.precio = precio;
        this.numeroPaginas = numeroPaginas;
    }

    //Getters and Setters
    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getResena() {
        return resena;
    }

    public void setResena(String resena) {
        this.resena = resena;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    //To String
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}










