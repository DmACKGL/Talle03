package me.fsanllehi;

public class Auto {
    private String Patente;
    private String Marca;
    private int KM;
    private int MaxPas;
    private int MaxKG;
    private boolean Compacto = false;
    private boolean Pasajeros = false;
    private boolean Carga = false;
    private boolean Blindado = false;
    private boolean Disponible = false;
    private int precio;
    private String nombres;

    public Auto(String patente, String marca, int KM, int maxPas, int maxKG, boolean compacto, boolean pasajeros, boolean carga, boolean blindado, boolean disponible, int precio, String nombres) {
        Patente = patente;
        Marca = marca;
        this.KM = KM;
        MaxPas = maxPas;
        MaxKG = maxKG;
        Compacto = compacto;
        Pasajeros = pasajeros;
        Carga = carga;
        Blindado = blindado;
        Disponible = disponible;
        this.precio = precio;
        this.nombres = nombres;
    }

    public String getPatente() {
        return Patente;
    }

    public void setPatente(String patente) {
        Patente = patente;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public int getKM() {
        return KM;
    }

    public void setKM(int KM) {
        this.KM = KM;
    }

    public int getMaxPas() {
        return MaxPas;
    }

    public void setMaxPas(int maxPas) {
        MaxPas = maxPas;
    }

    public int getMaxKG() {
        return MaxKG;
    }

    public void setMaxKG(int maxKG) {
        MaxKG = maxKG;
    }

    public boolean isCompacto() {
        return Compacto;
    }

    public void setCompacto(boolean compacto) {
        Compacto = compacto;
    }

    public boolean isPasajeros() {
        return Pasajeros;
    }

    public void setPasajeros(boolean pasajeros) {
        Pasajeros = pasajeros;
    }

    public boolean isCarga() {
        return Carga;
    }

    public void setCarga(boolean carga) {
        Carga = carga;
    }

    public boolean isBlindado() {
        return Blindado;
    }

    public void setBlindado(boolean blindado) {
        Blindado = blindado;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean disponible) {
        Disponible = disponible;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
}
