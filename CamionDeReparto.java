import java.util.ArrayList;
import java.util.List;

public class CamionDeReparto {
    private String patente;
    private List<Paquete> paquetes;

    public CamionDeReparto(String patente) {
        this.patente = patente;
        this.paquetes = new ArrayList<>();
    }

    public void agregarPaquete(Paquete paquete) {
        paquetes.add(paquete);
    }

    public void actualizarEstadoPaquete(String codigoPaquete,
                                        String nuevoEstado) {
        for (Paquete paquete : paquetes) {
            if (paquete.getCodigo().equals(codigoPaquete)) {
                paquete.cambiarEstado(nuevoEstado);
                System.out.println("Paquete " + codigoPaquete
                        + " actualizado a: " + nuevoEstado);
                return;
            }
        }

        System.out.println("Paquete " + codigoPaquete
                + " no encontrado en el camion " + patente);
    }

    public void actualizarTodosLosPaquetes(String nuevoEstado) {
        for (Paquete paquete : paquetes) {
            paquete.cambiarEstado(nuevoEstado);
        }
    }

    public void mostrarPaquetes() {
        System.out.println("Camion: " + patente);

        for (Paquete paquete : paquetes) {
            System.out.println(paquete);
        }
    }
}