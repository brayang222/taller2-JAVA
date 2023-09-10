package com.brayanvargas.domain;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
    private int numEtapaBV;
    private List<Equipo> equiposBV;
    private static int nroEtapasBV = 0;
    private int numeroEtapaBV;
    private static Equipo equipoGanador;

    private Etapa(int numEtapaBV, Equipo equipoGanador) {
        this.numEtapaBV = numEtapaBV;
        this.equiposBV = new ArrayList<>();
        this.numeroEtapaBV = nroEtapasBV + 1;

        Etapa.nroEtapasBV++;
    }

    public static Etapa crearEtapa(int numEtapaBV, Equipo equipoGanador) {
        if(numEtapaBV > 10) {
            System.out.println("La competencia debe contener exactamente 10 etapas");
            return null;
        } else {
            return new Etapa(numEtapaBV, equipoGanador);

        }


    }

    public int getNumEtapaBV() {
        return numEtapaBV;
    }

    public List<Equipo> getEquiposBV() {
        return equiposBV;
    }

    public static int getNroEtapasBV() {
        return nroEtapasBV;
    }

    public int getNumeroEtapaBV() {
        return numeroEtapaBV;
    }

    public static Equipo getEquipoGanador() {
        return equipoGanador;
    }
}
