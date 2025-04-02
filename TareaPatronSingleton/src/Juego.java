import java.util.Scanner;

public class Juego {
    private String nombreJuego;
    private configuracionGlobal config;
    String cambioVolumen,cambioVolEfectos,cambioVolMusica,cambioDificultad,cambioIdioma;
    Scanner teclado = new Scanner(System.in);

    //Constructor de la clase juego
    public Juego(String nombre) {
        this.nombreJuego = nombre;
        // Obtenemos la instancia única de configuración
        this.config = configuracionGlobal.getInstance();
    }

    //Metodo para iniciar el juego
    public void iniciar() {
        System.out.println("Iniciando el juego: " + nombreJuego);
        System.out.println("Aplicando configuraciones:");
        config.mostrarConfiguraciones();
    }

    //Metodo para cambiar las configuraciones
    public void cambiarConfiguraciones() {

        //Pedirle al usuario que cambie sus configuraciones
        System.out.println("Menu de Configuraciones del juego");
        System.out.println("Cambiar volumen general");
        cambioVolumen = teclado.nextLine();
        teclado=new Scanner(System.in);
        System.out.println("Cambiar volumen de la musica");
        teclado=new Scanner(System.in);
        cambioVolMusica = teclado.nextLine();
        System.out.println("Cambiar volumen de efectos");
        teclado=new Scanner(System.in);
        cambioVolEfectos = teclado.nextLine();
        System.out.println("Cambiar dificultad");
        teclado=new Scanner(System.in);
        cambioDificultad = teclado.nextLine();
        System.out.println("Cambiar idioma");
        teclado=new Scanner(System.in);
        cambioIdioma = teclado.nextLine();
        System.out.println("---------------------------------\n");
        //Hacer el cambio de las configuraciones

        config.setVolumen(cambioVolumen);
        config.setVolumenEfectos(cambioVolEfectos);
        config.setVolumenMusica(cambioVolMusica);
        config.setDificultad(cambioDificultad);
        config.setIdioma(cambioIdioma);

        //Mostrar las configuraciones cambiadas
        config.mostrarConfiguraciones();

    }


}
