package me.fsanllehi;

import java.util.List;
import java.util.Scanner;

class Util {
    static void listarVehiculos(){
        for (Auto autos: Listas.getAutos()) {
            System.out.printf("Patente: %s\n" +
                    "Marca: %s\n" +
                    "KM: %s\n" +
                    "Max. Pasajeros: %s\n" +
                    "Max. KG: %s\n", autos.getPatente(), autos.getMarca(), autos.getKM(), autos.getMaxPas(), autos.getMaxKG());
            if (autos.isCompacto()) {
                System.out.println("Tipo: Compacto");
            }
            if (autos.isPasajeros()) {
                System.out.println("Tipo: Pasajeros");
            }
            if (autos.isCarga()) {
                System.out.println("Tipo: Carga");
            }
            if (autos.isBlindado()) {
                System.out.println("Tipo: Blindado");
            }
            System.out.println("======================");
        }
    }
    static void buscarPlaca(String placa){
        for (Auto autos: Listas.getAutos()) {
            if (placa.equals(autos.getPatente())){
                System.out.printf("Patente: %s\n" +
                        "Marca: %s\n" +
                        "KM: %s\n" +
                        "Max. Pasajeros: %s\n" +
                        "Max. KG: %s\n", autos.getPatente(), autos.getMarca(), autos.getKM(), autos.getMaxPas(), autos.getMaxKG());
                if (autos.isCompacto()) {
                    System.out.println("Tipo: Compacto");
                }
                if (autos.isPasajeros()) {
                    System.out.println("Tipo: Pasajeros");
                }
                if (autos.isCarga()) {
                    System.out.println("Tipo: Carga");
                }
                if (autos.isBlindado()) {
                    System.out.println("Tipo: Blindado");
                }
            }
        }
    }
    static void buscarCategoria(int cat){
        if (cat == 1){
            for (Auto autos: Listas.getAutos()){

                System.out.printf("Patente: %s\n" +
                        "Marca: %s\n" +
                        "KM: %s\n" +
                        "Max. Pasajeros: %s\n" +
                        "Max. KG: %s\n", autos.getPatente(), autos.getMarca(), autos.getKM(), autos.getMaxPas(), autos.getMaxKG());
            }
        }
    }
    static void cargarDemo(){
        Listas.setAutos(new Auto("CVVC11","Jeep", 200000, 5, 2500, false, true, false, false));
        Listas.setAutos(new Auto("DZRB13","Hyundai", 105000, 5, 1000, true, false, false, false));
    }
}
