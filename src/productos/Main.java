package productos;

public class Main {
    public static void main(String[] args) {
        Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor s2 = new Servidor("ServidorBD", "192.168.1.21");

        System.out.println("Total servidores en la red: " + Servidor.getTotalServidores());
        System.out.println("Servidores activos al inicio: " + Servidor.getServidoresActivos());

        System.out.println("Estado de ServidorWeb: " + (s1.isActivo() ? "Encendido" : "Apagado"));

        System.out.println("\n--- Iniciando servidores ---");
        s1.activar();
        s2.activar();

        System.out.println("Estado de ServidorWeb: " + (s1.isActivo() ? "Encendido" : "Apagado"));
        System.out.println("Servidores activos en total: " + Servidor.getServidoresActivos());

        System.out.println("\n--- Apagando servidores ---");
        s1.desactivar();
        System.out.println("Servidores activos tras apagar uno: " + Servidor.getServidoresActivos());

        s1.desactivar();
        System.out.println("Servidores activos tras intento inválido: " + Servidor.getServidoresActivos());
    }
}