package me.fsanllehi;

import java.util.List;
import java.util.Scanner;

class Util {
    static void listarVehiculos(){
        int cont = 0;
        for (Auto autos: Listas.getAutos()) {
            System.out.printf("ID: %s\n" +
                    "Patente: %s\n" +
                    "Marca: %s\n" +
                    "KM: %s\n" +
                    "Max. Pasajeros: %s\n" +
                    "Max. KG: %s\n" +
                    "Precio: %s\n", cont+1, autos.getPatente(), autos.getMarca(), autos.getKM(), autos.getMaxPas(), autos.getMaxKG(), autos.getPrecio());
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
            cont++;
        }
    }
    static void buscarPlaca(String placa){
        for (Auto autos: Listas.getAutos()) {
            if (placa.equals(autos.getPatente())){
                System.out.printf("Patente: %s\n" +
                        "Marca: %s\n" +
                        "KM: %s\n" +
                        "Max. Pasajeros: %s\n" +
                        "Max. KG: %s\n" +
                        "Precio: %s\n", autos.getPatente(), autos.getMarca(), autos.getKM(), autos.getMaxPas(), autos.getMaxKG(), autos.getPrecio());
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
        for (Auto autos: Listas.getAutos()){
            if (cat == 1 && !autos.isCompacto()){
                continue;
            }else if (cat == 2 && !autos.isPasajeros()){
                continue;
            }else if (cat == 3 && !autos.isCarga()){
                continue;
            }else if (cat == 4 && !autos.isBlindado()){
                continue;
            }
            System.out.println("============");
            System.out.printf("Patente: %s\n" +
                    "Marca: %s\n" +
                    "KM: %s\n" +
                    "Max. Pasajeros: %s\n" +
                    "Max. KG: %s\n" +
                    "Disponible?: %s\n", autos.getPatente(), autos.getMarca(), autos.getKM(), autos.getMaxPas(), autos.getMaxKG(), autos.isDisponible());
            System.out.println("============");
        }
    }
    static void buscarRangoKM(int desde, int hasta){
        for (Auto autos: Listas.getAutos()){
            if (autos.getKM() > desde && autos.getKM() < hasta){
                System.out.println("============");
                System.out.printf("Patente: %s\n" +
                        "Marca: %s\n" +
                        "KM: %s\n" +
                        "Max. Pasajeros: %s\n" +
                        "Max. KG: %s\n" +
                        "Disponible?: %s\n", autos.getPatente(), autos.getMarca(), autos.getKM(), autos.getMaxPas(), autos.getMaxKG(), autos.isDisponible());
                System.out.println("============");
            }
        }

    }
    static void cambiarDisponibilidad(int id, boolean status){
        Auto obj = Listas.getAutos().get(id-1);
        System.out.printf("Cambiado desde %b -> %s\n", obj.isDisponible(), status);
        obj.setDisponible(status);
    }
    static void cargarDemo(){
        Listas.setAutos(new Auto("CVVC11","Jeep", 200000, 5, 2500, false, true, false, false, true,4000000,""));
        Listas.setAutos(new Auto("DZRB13","Hyundai", 105000, 5, 1000, true, false, false, false, true,8000000,""));
    }
}
