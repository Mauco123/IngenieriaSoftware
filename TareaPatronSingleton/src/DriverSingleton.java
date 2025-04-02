public class DriverSingleton {
    public static void main(String[] args) {
        
        //Crear el objeto juego1
        Juego juego1 = new Juego("Bloodborne");
        juego1.iniciar();

        //Modificar las configuraciones en el juego
        juego1.cambiarConfiguraciones();


        //Crear objeto lobby y mostrar las configuraciones que tiene
        Lobby lobby = new Lobby();
        lobby.mostrarMenu();

        //Modificar las configuraciones en el lobby
        lobby.cambiarConfig();














    }
}
