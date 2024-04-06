package ar.com.system2023.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadora[]; //Arreglo de objetos
    private static int contadorOrdenes;
    private static final int MAX_CUMPUTADORAS = 10;
    private int contadorComputadora;

    //Cosntuctor vacio
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.computadora = new Computadora[Orden.MAX_CUMPUTADORAS];
    }

    //Metodo para agregar una nueva computadora al arreglo
    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadora < Orden.MAX_CUMPUTADORAS) {
            this.computadora[this.contadorComputadora++] = computadora;
        }
    }
}
