public class DriverFactory {
    public DriverFactory() {
    }

    public static void main(String[] args) {
        System.out.println(ArticulosFactory.getArticulos(3));
        System.out.println(ArticulosFactory.getArticulos(6));
    }
}
