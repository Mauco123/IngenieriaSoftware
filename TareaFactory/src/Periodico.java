public class Periodico implements Articulos{
    private int ID;
    private String nombre;
    private String fechaPublicacion;
    private float precio;

    //Constructor por defecto
    public Periodico() {
    }

    //Constructor
    public Periodico(int ID, String nombre, String fechaPublicacion, float precio) {
        this.ID = ID;
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    //Getters and Setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    //ToString

    @Override
    public String toString() {
        return "Periodico{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", fechaPublicacion='" + fechaPublicacion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
