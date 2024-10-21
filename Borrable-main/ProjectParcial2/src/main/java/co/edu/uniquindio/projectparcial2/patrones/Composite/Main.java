package co.edu.uniquindio.projectparcial2.patrones.Composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Menu main = new Menu("Menu principal");
        Objeto objeto = new Objeto("Martillo");
        Objeto objeto2 = new Objeto("Zappato");
        Objeto objeto3 = new Objeto("Luis");
        Objeto objeto4 = new Objeto("Yuyu");
        Objeto objeto5 = new Objeto("Pepito");
        Objeto objeto6 = new Objeto("Taladro");
        Objeto objeto7 = new Objeto("Puntillas");

        Menu kit1 = new Menu("Kit1");
        kit1.agregarComponente(objeto);
        kit1.agregarComponente(objeto7);
        kit1.agregarComponente(objeto2);
        kit1.agregarComponente(objeto6);

        Menu kit2 = new Menu("Personas");
        kit2.agregarComponente(objeto3);
        kit2.agregarComponente(objeto4);
        kit2.agregarComponente(objeto5);

        main.agregarComponente(kit1);
        main.agregarComponente(kit2);

        main.show();

    }
}
