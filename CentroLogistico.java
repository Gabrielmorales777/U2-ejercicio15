import java.util.ArrayList;
import java.util.List;

public class CentroLogistico {
    private List<CamionDeReparto> camiones;

    public CentroLogistico() {
        camiones = new ArrayList<>();
    }

    public void agregarCamion(CamionDeReparto camion) {
        camiones.add(camion);
    }

    public void difundirActualizacion(String nuevoEstado) {
        System.out.println("Centro Logistico: enviando orden de actualizacion...");
        System.out.println("Nuevo estado: " + nuevoEstado);
        System.out.println();

        for (CamionDeReparto camion : camiones) {
            camion.actualizarTodosLosPaquetes(nuevoEstado);
        }
    }

    public void mostrarEstadoGeneral() {
        System.out.println("===== ESTADO GENERAL DE ENCOMIENDAS =====");

        for (CamionDeReparto camion : camiones) {
            camion.mostrarPaquetes();
            System.out.println();
        }
    }
}