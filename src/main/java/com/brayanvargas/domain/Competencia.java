package com.brayanvargas.domain;

import java.util.ArrayList;
import java.util.List;

public class Competencia {
    private String nombreCompetenciaBV;
    private static final String PATROCINADOR_COMPETENCIA_BV = "Red Bull";
    private List<Etapa> etapasBV;
    private static int nroCompetenciaBV = 0;
    private int numeroCompetenciaBV;

    private Competencia(String nombreCompetenciaBV) {
        this.nombreCompetenciaBV = nombreCompetenciaBV;
        this.etapasBV = new ArrayList<>();
        this.numeroCompetenciaBV = nroCompetenciaBV + 1;

        nroCompetenciaBV++;
    }

    public static Competencia crearCompetencia(String nombreCompetenciaBV) {
        if (nroCompetenciaBV != 1){
            System.out.println("En esta lógica, no debería de haber más de una competencia.");
            return null;
        } else {
            return new Competencia(nombreCompetenciaBV);
        }
    }

    public String getNombreCompetenciaBV() {
        return nombreCompetenciaBV;
    }

    public List<Etapa> getEtapas() {
        return etapasBV;
    }

    public static int getNroCompetencia() {
        return nroCompetenciaBV;
    }

    public int getNumeroCompetencia() {
        return numeroCompetenciaBV;
    }
}
