package productos;

public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;

    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    public void activar() {
        if (!this.activo) {
            this.activo = true;
            servidoresActivos++;
            System.out.println(this.nombre + " activado.");
        }
    }

    public void desactivar() {
        if (this.activo) {
            this.activo = false;
            servidoresActivos--;
            System.out.println(this.nombre + " desactivado.");
        }
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }
    public boolean isActivo() {
        return this.activo;
    }
}