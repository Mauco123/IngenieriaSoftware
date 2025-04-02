import java.util.Scanner;

public class Lobby {
    private configuracionGlobal config;
    String cambioVolumen,cambioVolEfectos,cambioVolMusica,cambioDificultad,cambioIdioma;
    Scanner teclado = new Scanner(System.in);

    //Constructor de la clase Lobby
    public Lobby() {
        this.config = configuracionGlobal.getInstance();
    }

    //Metodo para mostrar las configuraciones que se tienen
    public void mostrarMenu() {
        System.out.println("Configuraciones:\n");
        config.mostrarConfiguraciones();
    }

    //Metodo para cambiar la configuraciones
    public void cambiarConfig(){

        //Pedirle al usuario que cambie sus configuraciones
        System.out.println("Menu de Configuraciones del Lobby");
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
        //Hacer el cambio de las configuraciones

        config.setVolumen(cambioVolumen);
        config.setVolumenEfectos(cambioVolEfectos);
        config.setVolumenMusica(cambioVolMusica);
        config.setDificultad(cambioDificultad);
        config.setIdioma(cambioIdioma);

        //Mostrar las configuraciones cambiadas
        config.mostrarConfiguraciones();
        System.out.println("----------------------------------");

    }
}
