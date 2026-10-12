package pedidos;

public class Main {
    public static void main(String[] args) {
        Aplicacion app1 = new Aplicacion("SistemaVentas", "1.0");
        Aplicacion app2 = new Aplicacion("PortalRRHH", "2.1");

        System.out.println("Total de aplicaciones creadas: " + Aplicacion.getTotalAplicaciones());

        System.out.println("¿SistemaVentas está ejecutándose?: " + app1.isEjecutando());

        app1.iniciar();
        System.out.println("¿SistemaVentas está ejecutándose ahora?: " + app1.isEjecutando());

        app1.cerrar();
        System.out.println("¿SistemaVentas está ejecutándose al final?: " + app1.isEjecutando());
    }
}