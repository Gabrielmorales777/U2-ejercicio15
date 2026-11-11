public class Main {
    public static void main(String[] args) {

        CentroLogistico centro = new CentroLogistico();


        CamionDeReparto camion1 =
                new CamionDeReparto("AB123CD");

        CamionDeReparto camion2 =
                new CamionDeReparto("EF456GH");


        Paquete paquete1 =
                new Paquete("P001", "Mendoza");

        Paquete paquete2 =
                new Paquete("P002", "San Martin");

        Paquete paquete3 =
                new Paquete("P003", "Buenos Aires");

        Paquete paquete4 =
                new Paquete("P004", "Cordoba");


        camion1.agregarPaquete(paquete1);
        camion1.agregarPaquete(paquete2);

        camion2.agregarPaquete(paquete3);
        camion2.agregarPaquete(paquete4);


        centro.agregarCamion(camion1);
        centro.agregarCamion(camion2);


        System.out.println("=== ESTADO INICIAL ===");
        centro.mostrarEstadoGeneral();


        System.out.println("=== ACTUALIZACION MASIVA ===");
        centro.difundirActualizacion("En Tránsito");


        System.out.println();
        centro.mostrarEstadoGeneral();
    }
}