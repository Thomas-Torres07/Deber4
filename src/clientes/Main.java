package clientes;

public class Main {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("jperez", "jperez@correo.com");
        Usuario u2 = new Usuario("aramirez", "aramirez@correo.com");
        Usuario u3 = new Usuario("lgarcia", "lgarcia@correo.com");
        Usuario u4 = new Usuario("mlopez", "mlopez@correo.com");

        System.out.println("Total de usuarios registrados: " + Usuario.getContadorUsuarios());

        System.out.println("\n--- Detalles de usuarios ---");
        System.out.println("ID: " + u1.getId() + " | Username: " + u1.getUsername());
        System.out.println("ID: " + u4.getId() + " | Username: " + u4.getUsername());
    }
}