package com.brayanvargas.domain;

import java.util.ArrayList;
import java.util.List;

public class Etapa {
    private int numEtapaBV;
    private List<Equipo> equiposBV;
    private static int nroEtapasBV = 0;
    private int numeroEtapaBV;
    private List<Equipo> equiposGanadores;

    private Etapa(int numEtapaBV) {
        this.numEtapaBV = numEtapaBV;
        this.equiposBV = new ArrayList<>();
        this.numeroEtapaBV = nroEtapasBV + 1;
        this.equiposGanadores = new ArrayList<>();

        Etapa.nroEtapasBV++;
    }

    public static Etapa crearEtapa(int numEtapaBV) {
        if(numEtapaBV > 10) {
            System.out.println("La competencia debe contener exactamente 10 etapas");
            return null;
        } else {
            return new Etapa(numEtapaBV);
        }
    }

    public void agregarEquipoGanador(Equipo equipoGanador) {
        equiposGanadores.add(equipoGanador);
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

    public List<Equipo> getEquiposGanadores() {
        return equiposGanadores;
    }
}
