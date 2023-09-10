package com.brayanvargas.domain;

public class Corredor {
    private int idBV;
    private String nombreBV;
    private Equipo equipoBV;
    private static int nroCorredoresBV = 0;
    private int numeroCorredorBV;

    private Corredor(String nombreBV, Equipo equipoBV) {
        this.nombreBV = nombreBV;
        this.equipoBV = equipoBV;
        this.numeroCorredorBV = nroCorredoresBV + 1;

        Corredor.nroCorredoresBV++;
    }

    public static Corredor crearCorredor(String nombreBV, Equipo equipoBV){
        if (nroCorredoresBV < 5) {
            return new Corredor(nombreBV, equipoBV);
        } else {
            System.out.println("No se pueden tener más de 5 corredores en un equipo");
            return null;
        }
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
