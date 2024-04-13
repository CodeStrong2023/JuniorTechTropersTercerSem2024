//MI PARTE A SUBIR
package mundopc;

import ar.com.system2023.mundopc.*;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluethooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
       
        
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluethooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        
        Orden orden1 = new Orden(); //Inicializamos el arreglo vacío
        Orden orden2 = new Orden(); //Nueva lista para orden2
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        orden2.agregarComputadora(computadorasVarias);
        orden1.mostrarOrden();
        orden2.mostrarOrden();
   
        

        //Crear mas objetos de tipo computadora con todos sus elementos
        //completar una lista en el objeto orden1 que llegue a los 10 elementos
        //probar de esta manera los métodos al maximo rendimiento

        //TODO: tarea 10 dispositivos de cada uno
        //Teclados
        Teclado tecladoKuramaK552 = new Teclado("USB", "Redragon");
        Teclado tecladoK618 = new Teclado("Bluetooth", "Redragon");
        Teclado tecladorkh81 = new Teclado("USB", "Royal Kludge");
        Teclado tecladoG213 = new Teclado("USB", "Logitech");
        Teclado tecladoK95 = new Teclado("USB", "Corsair");
        Teclado tecladoHuntsmanV2 = new Teclado("Bluetooth", "Razer");
        Teclado tecladoG513 = new Teclado("USB", "Logitech");
        Teclado tecladoStrixScopeNXDeluxe = new Teclado("USB", "Asus ROG");
        Teclado tecladoMKXTKL = new Teclado("USB", "Mars Gaming");
        Teclado tecladoAlloyElite2 = new Teclado("USB", "HyperX");

        // Monitor
        Monitor monitorG95sc = new Monitor("Samsung", 49);
        Monitor monitorAcerNitro = new Monitor("Acer", 31.5);
        Monitor monitorKG241Y = new Monitor("Acer Nitro", 23.8);
        Monitor monitorC255BFWT240 = new Monitor("Sceptre", 24.5);
        Monitor monitor32QN600 = new Monitor("LG", 32);
        Monitor monitorVP3268a = new Monitor("ViewSonic", 32);
        Monitor monitorUltraGear38GN950 = new Monitor("LG", 38);
        Monitor monitorXeneon32QHD165 = new Monitor("Corsair", 32);
        Monitor monitorM32UC = new Monitor("Gigabyte", 31.5);
        Monitor monitorVG289Q = new Monitor("Asus TUF", 28);

        // Raton
        // Todo: RF (conexion de radiofrecuencia)
        Raton ratonGM08 = new Raton("USB", "MSI");
        Raton ratonG305 = new Raton("RF", "Logitech");
        Raton ratonGXT110Felox = new Raton("RF", "Trust");
        Raton ratonDeathadder = new Raton("USB", "Raxer");
        Raton ratonGamingM4 = new Raton("Bluetooth", "Asus");
        Raton ratonAerox32022 = new Raton("Bluetooth", "SteelSeries");
        Raton ratonBasiliskV3Pro = new Raton("Bluetooth , RF", "Razer");
        Raton ratonHXMC002B = new Raton("USB", "Hyperx");
        Raton ratonSabrePro = new Raton("Bluetooth , RF", "Corsair");
        Raton ratonG203 = new Raton("USB", "Logitech");

        //Computadoras
        Computadora computadora1 = new Computadora("combo1", monitor32QN600, tecladoAlloyElite2, ratonAerox32022);
        Computadora computadora2 = new Computadora("combo2", monitorAcerNitro, tecladoAlloyElite2, ratonDeathadder);
        Computadora computadora3 = new Computadora("combo3", monitorC255BFWT240, tecladoG513, ratonBasiliskV3Pro);
        Computadora computadora4 = new Computadora("combo4", monitorG95sc, tecladoMKXTKL, ratonDeathadder);
        Computadora computadora5 = new Computadora("combo5", monitorGamer, tecladoG513, ratonGamer);
        Computadora computadora6 = new Computadora("combo6", monitorXeneon32QHD165, tecladorkh81, ratonBasiliskV3Pro);
        Computadora computadora7 = new Computadora("combo7", monitorC255BFWT240, tecladoG513, ratonBasiliskV3Pro);
        Computadora computadora8 = new Computadora("combo8", monitorUltraGear38GN950, tecladoHuntsmanV2, ratonGM08);
        Computadora computadora9 = new Computadora("combo9", monitorVG289Q, tecladoK95, ratonBasiliskV3Pro);
        Computadora computadora10 = new Computadora("combo10", monitorM32UC, tecladoMKXTKL, ratonGamingM4);


        // Orden de prueba
        Orden ordenP = new Orden();
        ordenP.agregarComputadora(computadora1);
        ordenP.agregarComputadora(computadora2);
        ordenP.agregarComputadora(computadora3);
        ordenP.agregarComputadora(computadora4);
        ordenP.agregarComputadora(computadora5);
        ordenP.agregarComputadora(computadora6);
        ordenP.agregarComputadora(computadora7);
        ordenP.agregarComputadora(computadora8);
        ordenP.agregarComputadora(computadora9);
        ordenP.agregarComputadora(computadora10);
        
        
        //Muestra de orden
        ordenP.mostrarOrden();

        ordenP.agregarComputadora(computadora1);

       
        // todo podemos observar que no rompe pero solo muestra el texto de superacion de limite

    }
}