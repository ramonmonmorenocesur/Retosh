package practicasClase;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import ejercicio4.Persona;


public class ListasYconjuntos {




    public static void main(String[] args) {
            //vamos a crear una lista de Personas
            //la rellenamos de 100  personas
            //creamos un set de personas
            //le introducimos lso elementos de la lista
            //sacar en pantalla en cada linea :
            //lista,elem(i):edad // set,elem(i)
        Persona persona;
           
            List<Persona> listaPersonas = new ArrayList<Persona>();
        for (int i = 0; i < 101; i++) {
            persona = new Persona("12","jk","jk", i);
            listaPersonas.add(persona);
        }
        HashSet<Persona>setPersona=new HashSet<Persona>();
        for (int i = 0; i < listaPersonas.size(); i++) {
           

            setPersona.add(listaPersonas.get(i));
            
        }

        System.out.println(setPersona);




    }
}
