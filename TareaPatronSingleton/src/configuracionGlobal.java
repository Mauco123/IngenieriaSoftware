public class configuracionGlobal {
    private String volumen;
    private String volumenEfectos;
    private String volumenMusica;
    private String dificultad;
    private String idioma;

    //Asignar los valores a las configuraciones
    private configuracionGlobal(){
        volumen = "100%";
        volumenEfectos = "75%";
        volumenMusica = "80%";
        dificultad = "media";
        idioma = "Español";
    }
    //Obtener la instancia unica
    public static configuracionGlobal getInstance(){
        return new configuracionGlobal();
    }

    //Getters and Setters
    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getVolumenEfectos() {
        return volumenEfectos;
    }

    public void setVolumenEfectos(String volumenEfectos) {
        this.volumenEfectos = volumenEfectos;
    }

    public String getVolumenMusica() {
        return volumenMusica;
    }

    public void setVolumenMusica(String volumenMusica) {
        this.volumenMusica = volumenMusica;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    // Metodo para mostrar las configuraciones asignadas
    public void mostrarConfiguraciones() {
        System.out.println("CONFIGURACIONES");
        System.out.println("Volumen general: " + volumen);
        System.out.println("Volumen de musica: " + volumenMusica);
        System.out.println("Volumen de efectos: " + volumenEfectos);
        System.out.println("Dificultad: " + dificultad);
        System.out.println("Idioma: " + idioma);
    }
}
