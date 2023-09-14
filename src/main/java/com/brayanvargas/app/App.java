package com.brayanvargas.app;

import com.brayanvargas.domain.Corredor;
import com.brayanvargas.domain.Equipo;
import com.brayanvargas.domain.Etapa;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Equipo equipo1 = Equipo.crearEquipo("Equipo 1");
        Equipo equipo2 = Equipo.crearEquipo("Equipo 2");
        Equipo equipo3 = Equipo.crearEquipo("Equipo 3");
        Equipo equipo4 = Equipo.crearEquipo("Equipo 4");
        Equipo equipo5 = Equipo.crearEquipo("Equipo 5");

        Corredor Marcelo = Equipo.crearCorredor("Marcelo", equipo1);
        Corredor Felipe = Equipo.crearCorredor("Felipe", equipo1);
        Corredor Alejadro = Equipo.crearCorredor("Alejadro", equipo1);
        Corredor Juan = Equipo.crearCorredor("Juan", equipo1);
        Corredor Diego = Equipo.crearCorredor("diego", equipo1);

        Corredor Maximo = Equipo.crearCorredor("Maximo", equipo2);
        Corredor Leon = Equipo.crearCorredor("Leon", equipo2);
        Corredor Tomas = Equipo.crearCorredor("Tomas", equipo2);
        Corredor Violeta = Equipo.crearCorredor("Violeta", equipo2);
        Corredor Oriana = Equipo.crearCorredor("Oriana", equipo2);

        Corredor valenttina = Equipo.crearCorredor("valenttina", equipo3);
        Corredor Claudia = Equipo.crearCorredor("Claudia", equipo3);
        Corredor Daniela = Equipo.crearCorredor("Daniela", equipo3);
        Corredor Messi = Equipo.crearCorredor("Messi", equipo3);
        Corredor Antonella = Equipo.crearCorredor("Antonella", equipo3);

        Corredor Stephen = Equipo.crearCorredor("Stephen", equipo4);
        Corredor Andrew = Equipo.crearCorredor("Andrew", equipo4);
        Corredor Isaac = Equipo.crearCorredor("Isaac", equipo4);
        Corredor Mac = Equipo.crearCorredor("Mac", equipo4);
        Corredor Alex = Equipo.crearCorredor("Alex", equipo4);

        Corredor heisenberg = Equipo.crearCorredor("heisenberg", equipo5);
        Corredor Kevin = Equipo.crearCorredor("Kevin", equipo5);
        Corredor Gabriela = Equipo.crearCorredor("Gabriela", equipo5);
        Corredor Frida = Equipo.crearCorredor("Frida", equipo5);
        Corredor Freya = Equipo.crearCorredor("Freya", equipo5);


        List<Corredor> corredoresEquipo5 = equipo5.getCorredoresBV();

        System.out.println("Corredores del equipo 5");
        for (Corredor corredor : corredoresEquipo5) {
            System.out.println(corredor.getNombreBV());
        }

        System.out.println("---------------------------------------------------------");

        List<Etapa> resultadosEtapas = new ArrayList<>();

        Etapa etapa1 = Etapa.crearEtapa(1);
        Etapa etapa2 = Etapa.crearEtapa(2);
        Etapa etapa3 = Etapa.crearEtapa(3);
        Etapa etapa4 = Etapa.crearEtapa(4);
        Etapa etapa5 = Etapa.crearEtapa(5);
        Etapa etapa6 = Etapa.crearEtapa(6);
        Etapa etapa7 = Etapa.crearEtapa(7);
        Etapa etapa8 = Etapa.crearEtapa(8);
        Etapa etapa9 = Etapa.crearEtapa(9);
        Etapa etapa10 = Etapa.crearEtapa(10);

        etapa1.agregarEquipoGanador(equipo1);
        etapa2.agregarEquipoGanador(equipo1);
        etapa3.agregarEquipoGanador(equipo3);
        etapa4.agregarEquipoGanador(equipo3);
        etapa5.agregarEquipoGanador(equipo3);
        etapa6.agregarEquipoGanador(equipo3);
        etapa7.agregarEquipoGanador(equipo3);
        etapa8.agregarEquipoGanador(equipo2);
        etapa9.agregarEquipoGanador(equipo4);
        etapa10.agregarEquipoGanador(equipo5);

        resultadosEtapas.add(etapa1);
        resultadosEtapas.add(etapa2);
        resultadosEtapas.add(etapa3);
        resultadosEtapas.add(etapa4);
        resultadosEtapas.add(etapa5);
        resultadosEtapas.add(etapa6);
        resultadosEtapas.add(etapa7);
        resultadosEtapas.add(etapa8);
        resultadosEtapas.add(etapa9);
        resultadosEtapas.add(etapa10);

        for (int i = 0; i < resultadosEtapas.size(); i++) {
            Etapa etapa = resultadosEtapas.get(i);
            List<Equipo> equiposGanadores = etapa.getEquiposGanadores();
            System.out.println("Ganadores de la etapa " + (i + 1) + ":");
            for (Equipo equipo : equiposGanadores) {
                System.out.println("- " + equipo.getNombreEquipoBV());
            }
        }

        System.out.println("---------------------------------------------------------");

        List<String> nombresCorredores = new ArrayList<>();

        nombresCorredores.add("Marcelo");
        nombresCorredores.add("Alejadro");
        nombresCorredores.add("valenttina");
        nombresCorredores.add("valenttina");
        nombresCorredores.add("valenttina");
        nombresCorredores.add("valenttina");
        nombresCorredores.add("Antonella");
        nombresCorredores.add("Leon");
        nombresCorredores.add("Alex");
        nombresCorredores.add("Freya");

        for (String podio : nombresCorredores) {
            System.out.println("El top 10 de corredores fue: " + podio);
        }

    }
}



