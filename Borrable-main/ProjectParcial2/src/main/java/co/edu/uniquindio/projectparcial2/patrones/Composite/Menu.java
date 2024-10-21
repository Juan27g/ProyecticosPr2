package co.edu.uniquindio.projectparcial2.patrones.Composite;

import java.util.ArrayList;
import java.util.Arrays;

public class Menu implements ICompositeObjeto{
    private String  nombre;
    private ArrayList<ICompositeObjeto> componentes;

    public Menu(String nombre) {
        this.nombre = nombre;
        componentes = new ArrayList<>();
    }

    public void agregarComponente(ICompositeObjeto componente) {
        componentes.add(componente);
    }

    @Override
    public void show() {
        System.out.println("///////////////////COMPONENTE CON MAS COMPONENTES DENTRO////////////////////////");
        System.out.println("Nombre del kit: " + nombre);
        for (ICompositeObjeto componente : componentes) {
            componente.show();
        }
        System.out.println("///////////////////////////////////////////////////////////////////////////");
    }
}
