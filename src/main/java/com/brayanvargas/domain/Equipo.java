package com.brayanvargas.domain;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombreEquipoBV;
    private List<Corredor> corredoresBV;
    private static Integer nroEquiposBV = 0;
    private int numeroEquipoBV;
    private int contadorCorredores;

    private Equipo(String nombreEquipoBV) {
        this.nombreEquipoBV = nombreEquipoBV;
        this.corredoresBV = new ArrayList<>();
        this.numeroEquipoBV = nroEquiposBV + 1;

        Equipo.nroEquiposBV++;
    }

    public static Equipo crearEquipo(String nombreEquipoBV) {
        if (nroEquiposBV < 5) {
            return new Equipo(nombreEquipoBV);
        } else {
            System.out.println("No se pueden tener más de 5 equipos en la competencia");
            return null;
        }
    }

    public static Corredor crearCorredor(String nombreBV, Equipo equipoBV){
        if (equipoBV.contadorCorredores < 5) {
            Corredor nuevoCorredor = new Corredor(nombreBV, equipoBV);
            equipoBV.getCorredoresBV().add(nuevoCorredor);
            equipoBV.contadorCorredores++;
            return nuevoCorredor;
        } else {
            System.out.println("No se pueden tener más de 5 corredores en un equipo");
            return null;
        }
    }

    public String getNombreEquipoBV() {
        return nombreEquipoBV;
    }

    public List<Corredor> getCorredores() {
        return corredoresBV;
    }

    public static Integer getNroEquiposBV() {
        return nroEquiposBV;
    }

    public int getNumeroEquipoBV() {
        return numeroEquipoBV;
    }

    public List<Corredor> getCorredoresBV() {
        return corredoresBV;
    }
}
