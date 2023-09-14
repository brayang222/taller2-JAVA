package com.brayanvargas.domain;

public class Corredor {
    private int idBV;
    private String nombreBV;
    private Equipo equipoBV;
    private static int nroCorredoresBV = 0;
    private int numeroCorredorBV;

    public Corredor(String nombreBV, Equipo equipoBV) {
        this.nombreBV = nombreBV;
        this.equipoBV = equipoBV;
        this.numeroCorredorBV = nroCorredoresBV + 1;

        Corredor.nroCorredoresBV++;
    }

    public int getIdBV() {
        return idBV;
    }

    public String getNombreBV() {
        return nombreBV;
    }

    public Equipo getEquipoBV() {
        return equipoBV;
    }

    public static int getNroCorredoresBV() {
        return nroCorredoresBV;
    }

    public int getNumeroCorredorBV() {
        return numeroCorredorBV;
    }

}
