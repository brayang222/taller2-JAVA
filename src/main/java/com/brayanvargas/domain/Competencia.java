package com.brayanvargas.domain;

import java.util.ArrayList;
import java.util.List;

public class Competencia {
    private String nombreCompetenciaBV;
    private static final String PATROCINADOR_COMPETENCIA_BV = "Red Bull";
    private List<Etapa> etapas;
    private static int nroCompetencia = 0;
    private int numeroCompetencia;

    private Competencia(String nombreCompetenciaBV) {
        this.nombreCompetenciaBV = nombreCompetenciaBV;
        this.etapas = new ArrayList<>();
        this.numeroCompetencia = nroCompetencia + 1;

        nroCompetencia++;
    }

    public static Competencia crearCompetencia(String nombreCompetenciaBV) {
        if (nroCompetencia != 1){
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
        return etapas;
    }

    public static int getNroCompetencia() {
        return nroCompetencia;
    }

    public int getNumeroCompetencia() {
        return numeroCompetencia;
    }
}
