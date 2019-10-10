package me.fsanllehi;

class Util {
    static void listarOBJ(int cont, Auto autos){
        System.out.println("==================");
        System.out.printf(
                "ID: %s\n" +
                "Patente: %s\n" +
                "Marca: %s\n" +
                "KM: %s\n" +
                "Max. Pasajeros: %s\n" +
                "Max. KG: %s\n" +
                "Precio: %s\n" +
                "Disponible: %b\n" +
                "Conductor: %s\n",
                cont+1,
                autos.getPatente(),
                autos.getMarca(),
                autos.getKM(),
                autos.getMaxPas(),
                autos.getMaxKG(),
                autos.getPrecio(),
                autos.isDisponible(),
                ((autos.getConductor().equals("")) ? "N/A" : autos.getConductor())
        );
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
        System.out.println("==================");
    }
    static void listarVehiculos(){
        int cont = 0;
        for (Auto autos: Listas.getAutos()) {
            listarOBJ(cont, autos);
            cont++;
        }
    }
    static void buscarPlaca(String placa){
        int cont = 0;
        for (Auto autos: Listas.getAutos()) {
            if (placa.equals(autos.getPatente())){
                listarOBJ(cont, autos);
            }
            cont++;
        }
    }
    static Auto buscarOBJ(String placa){
        for (Auto autos: Listas.getAutos()) {
            if (placa.equals(autos.getPatente())){
                return autos;
            }
        }
        return null;
    }
    static void buscarCategoria(int cat){
        int cont = 0;
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
            listarOBJ(cont, autos);
            cont++;
        }
    }
    static void buscarRangoKM(int desde, int hasta){
        int cont = 0;
        for (Auto autos: Listas.getAutos()){
            if (autos.getKM() > desde && autos.getKM() < hasta){
                listarOBJ(cont, autos);
            }
            cont++;
        }

    }
    static void cambiarDisponibilidad(int id, boolean status){
        Auto obj = Listas.getAutos().get(id-1);
        System.out.printf("Cambiado desde %b -> %s\n", obj.isDisponible(), status);
        obj.setDisponible(status);
    }
    static void cambiarDisponibilidad(int id, boolean status, String nombre){
        Auto obj = Listas.getAutos().get(id-1);
        System.out.printf("Cambiado desde %b -> %s\n", obj.isDisponible(), status);
        obj.setDisponible(status);
        obj.setConductor(nombre);
    }
    static void cargarDemo(){
        Listas.setAutos(new Auto("CVVC11","Jeep", 200000, 5, 2500, false, true, false, false, true,4000000,""));
        Listas.setAutos(new Auto("DZRB13","Hyundai", 105000, 5, 1000, true, false, false, false, true,8000000,""));
    }
    static void calcularPrecio(String placa){
        // TODO: Crear sitema de precios

        Auto obj = buscarOBJ(placa);
        if (null==obj){
            System.out.println("No se encontro el vehiculo");
            return;
        }
        int cuenta = 500;
        if (obj.getKM() <= 50000) cuenta = cuenta+30;

        obj.setPrecio(20000);
    }
}
