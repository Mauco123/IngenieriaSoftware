public class Revista implements Articulos {
    private int ISSN;
    private String nombre;
    private int numeroEdicion;
    private float precio;
    private String periocidad;
    //Constructor por defecto
    public Revista() {
    }
    //Constructor

    public Revista(int ISSN, String nombre, int numeroEdicion, float precio, String periocidad) {
        this.ISSN = ISSN;
        this.nombre = nombre;
        this.numeroEdicion = numeroEdicion;
        this.precio = precio;
        this.periocidad = periocidad;
    }

    //Getters and Setters
    public int getISSN() {
        return ISSN;
    }

    public void setISSN(int ISSN) {
        this.ISSN = ISSN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getPeriocidad() {
        return periocidad;
    }

    public void setPeriocidad(String periocidad) {
        this.periocidad = periocidad;
    }

    //ToString
    @Override
    public String toString() {
        return "Revista{" +
                "ISSN=" + ISSN +
                ", nombre='" + nombre + '\'' +
                ", numeroEdicion=" + numeroEdicion +
                ", precio=" + precio +
                ", periocidad='" + periocidad + '\'' +
                '}';
    }
}
