package me.fsanllehi;

import java.util.ArrayList;

public class Listas {
    private static ArrayList<Auto> Autos = new ArrayList<>();

    public static ArrayList<Auto> getAutos() {
        return Autos;
    }

    public static void setAutos(Auto autos) {
        Autos.add(autos);
    }


}
