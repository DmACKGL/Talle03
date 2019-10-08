package me.fsanllehi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Bienvenido al AlquiControl!");

        while (true){
            System.out.println("¿Que accion quiere realizar?\n" +
                    "1) Ingresar Vehiculos\n" +
                    "2) Consultar Vehiculos\n" +
                    "3) Listar todos los vehiculos en la DB\n" +
                    "9) Cargar Demo\n" +
                    "0) Salir");
            int seleccion = scan.nextInt();

            if (seleccion == 1) {
                System.out.println("¿Cuantos vehiculos quiere ingresar?");
                int cantidad = scan.nextInt();
                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Ingrese patente:");
                    String patente = scan.nextLine();
                    scan.next();
                    System.out.println("Ingrese Marca:");
                    String marca = scan.nextLine();
                    scan.next();
                    System.out.println("Ingrese cantidad de KM:");
                    int KM = scan.nextInt();
                    System.out.println("Ingrese capacidad de pasajeros:");
                    int MaxPas = scan.nextInt();
                    System.out.println("Ingrese capacidad de carga:");
                    int MaxPeso = scan.nextInt();
                    System.out.println("¿De que categoria es el vehiculo?\n" +
                            "1) Compacto\n" +
                            "2) Pasajeros\n" +
                            "3) Carga\n" +
                            "4) Blindados");
                    int tipo = scan.nextInt();
                    if (tipo == 1) {
                        Listas.setAutos(new Auto(patente, marca, KM, MaxPas, MaxPeso, true, false, false, false));
                    } else if (tipo == 2) {
                        Listas.setAutos(new Auto(patente, marca, KM, MaxPas, MaxPeso, false, true, false, false));
                    } else if (tipo == 3) {
                        Listas.setAutos(new Auto(patente, marca, KM, MaxPas, MaxPeso, false, false, true, false));
                    } else if (tipo == 4) {
                        Listas.setAutos(new Auto(patente, marca, KM, MaxPas, MaxPeso, false, false, false, true));
                    }
                }
            }

            if (seleccion == 2){
                System.out.println("¿A base de que quiere buscar?\n" +
                        "1) Patente\n" +
                        "2) Categoria\n" +
                        "3) Kilometraje");
                seleccion = scan.nextInt();
                if (seleccion == 1) {
                    System.out.println("Ingrese patente a buscar: ");
                    scan.nextLine();
                    String placa = scan.nextLine();
                    System.out.println("=============");
                    Util.buscarPlaca(placa);
                    System.out.println("=============");
                }else if (seleccion == 2){

                }else if (seleccion == 3){

                }

            }

            if (seleccion == 3){
                Util.listarVehiculos();
            }

            if (seleccion == 9){
                Util.cargarDemo();
                Util.listarVehiculos();
                System.out.println("Datos Demo cargados.");
            }

            if (seleccion == 0){
                break;
            }
        }
    }
}
