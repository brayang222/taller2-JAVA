package com.brayanvargas.app;

import com.brayanvargas.domain.Corredor;
import com.brayanvargas.domain.Equipo;
import com.brayanvargas.domain.Etapa;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {

        Equipo equipo1 = Equipo.crearEquipo("Equipo 1");
        Equipo equipo2 = Equipo.crearEquipo("Equipo 2");
        Equipo equipo3 = Equipo.crearEquipo("Equipo 3");
        Equipo equipo4 = Equipo.crearEquipo("Equipo 4");
        Equipo equipo5 = Equipo.crearEquipo("Equipo 5");

        Corredor Marcelo = Corredor.crearCorredor("Marcelo", equipo1);
        Corredor Felipe = Corredor.crearCorredor("Felipe", equipo1);
        Corredor Alejadro = Corredor.crearCorredor("Alejadro", equipo1);
        Corredor Juan = Corredor.crearCorredor("Juan", equipo1);
        Corredor Diego = Corredor.crearCorredor("diego", equipo1);

        Corredor Maximo = Corredor.crearCorredor("Maximo", equipo2);
        Corredor Leon = Corredor.crearCorredor("Leon", equipo2);
        Corredor Tomas = Corredor.crearCorredor("Tomas", equipo2);
        Corredor Violeta = Corredor.crearCorredor("Violeta", equipo2);
        Corredor Oriana = Corredor.crearCorredor("Oriana", equipo2);

        Corredor valenttina = Corredor.crearCorredor("valenttina", equipo3);
        Corredor Claudia = Corredor.crearCorredor("Claudia", equipo3);
        Corredor Daniela = Corredor.crearCorredor("Daniela", equipo3);
        Corredor Messi = Corredor.crearCorredor("Messi", equipo3);
        Corredor Antonella = Corredor.crearCorredor("Antonella", equipo3);

        Corredor Stephen = Corredor.crearCorredor("Stephen", equipo4);
        Corredor Andrew = Corredor.crearCorredor("Andrew", equipo4);
        Corredor Isaac = Corredor.crearCorredor("Isaac", equipo4);
        Corredor Mac = Corredor.crearCorredor("Mac", equipo4);
        Corredor Alex = Corredor.crearCorredor("Alex", equipo4);

        Corredor heisenberg = Corredor.crearCorredor("heisenberg", equipo5);
        Corredor Kevin = Corredor.crearCorredor("Kevin", equipo5);
        Corredor Gabriela = Corredor.crearCorredor("Gabriela", equipo5);
        Corredor Frida = Corredor.crearCorredor("Frida", equipo5);
        Corredor Freya = Corredor.crearCorredor("Freya", equipo5);

        Etapa etapa1 = Etapa.crearEtapa(1, equipo1);
        Etapa etapa2 = Etapa.crearEtapa(2, equipo1);
        Etapa etapa3 = Etapa.crearEtapa(3, equipo3);
        Etapa etapa4 = Etapa.crearEtapa(4, equipo3);
        Etapa etapa5 = Etapa.crearEtapa(5, equipo3);
        Etapa etapa6 = Etapa.crearEtapa(6, equipo3);
        Etapa etapa7 = Etapa.crearEtapa(7, equipo3);
        Etapa etapa8 = Etapa.crearEtapa(8, equipo2);
        Etapa etapa9 = Etapa.crearEtapa(9, equipo4);
        Etapa etapa10 = Etapa.crearEtapa(10, equipo5);

        /*List<String> nombresCorredores = new ArrayList<>();

        // Obtener los nombres de los objetos Corredor automáticamente
        Field[] campos = Corredor.class.getDeclaredFields();
        for (Field campo : campos) {
            if (campo.getType() == String.class) {
                try {
                    String nombre = (String) campo.get(null);
                    nombresCorredores.add(nombre);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        // Crear un objeto Random
        Random random = new Random();

        // Crear una lista para almacenar los nombres seleccionados aleatoriamente
        List<String> nombresSeleccionados = new ArrayList<>();

        // Seleccionar 10 nombres aleatoriamente
        for (int i = 0; i < 10; i++) {
            int indiceAleatorio = random.nextInt(nombresCorredores.size());
            String nombreSeleccionado = nombresCorredores.get(indiceAleatorio);
            nombresSeleccionados.add(nombreSeleccionado);
        }

        // Imprimir los nombres seleccionados aleatoriamente
        System.out.println("Nombres seleccionados aleatoriamente:");
        for (String nombre : nombresSeleccionados) {
            System.out.println(nombre);
        }*/
    }
}



