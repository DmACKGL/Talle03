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
                    "4) Cambiar disponibilidad de vehiculo\n" +
                    "5) Consultar precio de un vehiculo por patente\n" +
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
                    System.out.println("Ingrese el precio del vehiculo (Ejemplo: 23000000)");
                    int precio = scan.nextInt();
                    if (tipo == 1) {
                        Listas.setAutos(new Auto(patente, marca, KM, MaxPas, MaxPeso, true, false, false, false, true, precio,""));
                    } else if (tipo == 2) {
                        Listas.setAutos(new Auto(patente, marca, KM, MaxPas, MaxPeso, false, true, false, false, true, precio,""));
                    } else if (tipo == 3) {
                        Listas.setAutos(new Auto(patente, marca, KM, MaxPas, MaxPeso, false, false, true, false,true, precio,""));
                    } else if (tipo == 4) {
                        Listas.setAutos(new Auto(patente, marca, KM, MaxPas, MaxPeso, false, false, false, true,true, precio,""));
                    }
                }
            }

            if (seleccion == 2){
                System.out.println("¿A base de que quiere buscar?\n" +
                        "1) Patente\n" +
                        "2) Categoria\n" +
                        "3) Kilometraje");
                int sel = scan.nextInt();
                if (sel == 1) {
                    System.out.println("Ingrese patente a buscar: ");
                    scan.nextLine();
                    String placa = scan.nextLine();
                    Util.buscarPlaca(placa);
                }else if (sel == 2){
                    System.out.println("¿Por que categoria quiere filtrar?\n" +
                            "1) Compacto\n" +
                            "2) Pasajeros\n" +
                            "3) Carga\n" +
                            "4) Blindado");
                    int cat = scan.nextInt();
                    Util.buscarCategoria(cat);
                }else if (sel == 3){
                    System.out.println("¿Desde cuantos KM?");
                    int desde = scan.nextInt();
                    System.out.println("¿Hasta cuantos KM?");
                    int hasta = scan.nextInt();
                    Util.buscarRangoKM(desde, hasta);
                }
            }

            if (seleccion == 3){
                Util.listarVehiculos();
            }

            if (seleccion == 4){
                Util.listarVehiculos();
                System.out.println("Ingrese ID del vehiculo a editar:");
                int id = scan.nextInt();
                System.out.println("¿A que estado desea cambiarlo? (True/False)");
                boolean status = scan.nextBoolean();
                if (!status) {
                    System.out.println("¿Cual es el nombre del conductor?");
                    scan.nextLine();
                    String nombre = scan.nextLine();
                    Util.cambiarDisponibilidad(id, status, nombre);
                }else{
                    Util.cambiarDisponibilidad(id, status);
                }
            }

            if (seleccion == 5){
                System.out.println("Ingrese Patente:");
                scan.nextLine();
                String placa = scan.nextLine();
                Util.buscarPlaca(placa);
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
