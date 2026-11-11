# U2-ejercicio15
### Sistema de Gestión de Envío de Encomiendas

Este ejercicio consiste en desarrollar un sistema de gestión logística en Java mediante la colaboración y comunicación entre objetos.

La clase `Paquete` almacena el código, destino y estado actual de cada encomienda. La clase `CamionDeReparto` administra una lista de paquetes asignados y permite actualizar sus estados individualmente o en conjunto. Por su parte, `CentroLogistico` mantiene una colección de camiones y se encarga de difundir órdenes de actualización a todos ellos.

Se simula el envío de un mensaje masivo desde el centro logístico para modificar el estado de las encomiendas a "En Tránsito", mostrando los resultados por consola.

El objetivo es practicar la **comunicación entre objetos**, las asociaciones, el uso de colecciones (`List`), los métodos de actualización y la difusión de mensajes entre múltiples objetos.
