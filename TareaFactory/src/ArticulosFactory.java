public class ArticulosFactory {
    public ArticulosFactory() {
    }

    public static Articulos getArticulos(int idArticulo) {
        switch (idArticulo) {
            case 1:
                return new Libro(12345678,"El principito","Niño habla con un zorro y una rosa en un frasco"," Saint-Exupery",150,100);
            case 2:
                return new Libro(784392,"El Extranjero","Un wey loco","Albert Camus",300,500);
            case 3:
                return new Revista(987654312,"Interesante",12,50,"Cada 4 meses");
            case 4:
                return new Revista(21122,"Conversus",34,45,"cada 3 meses");
            case 5:
                return new Periodico(1,"Proceso","12/05/2023",25);
            case 6:
                return new Periodico(2,"El Universal","12/06/2022",30);
            default:
            System.out.println("Ese articulo no existe");
            return null;
        }
    }
}