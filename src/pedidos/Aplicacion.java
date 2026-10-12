package pedidos;

public class Aplicacion {
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0;

    public Aplicacion(String nombre, String version) {
        totalAplicaciones++;
        this.id = totalAplicaciones;
        this.nombre = nombre;
        this.version = version;
        this.ejecutando = false;
    }

    public void iniciar() {
        this.ejecutando = true;
        System.out.println("La aplicación " + this.nombre + " se ha iniciado.");
    }

    public void cerrar() {
        this.ejecutando = false;
        System.out.println("La aplicación " + this.nombre + " se ha cerrado.");
    }

    public static int getTotalAplicaciones() {
        return totalAplicaciones;
    }
    public boolean isEjecutando() {
        return this.ejecutando;
    }
}