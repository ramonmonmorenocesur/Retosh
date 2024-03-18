package ejercicio4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException{
        //pedir por pantalla tantas personas como se quiera 
        // al final de cada persona preguntar si se quieres introducir otra[s/n]
        //guardar las personas en una lista de tipo list





        //hacemos un bucle do while donde metemos el procedimiento pedimos por pantalla y lo que introducimos lo metemos en una variable 

        Persona persona = new Persona();
        Scanner teclado = new Scanner (System.in);
        char continuar = 'S';
        List<Persona> personas = new ArrayList<Persona>();
       

// introduccion de personas
        System.out.println("Quieres introducir una persona");
        continuar = teclado.nextLine().toUpperCase().charAt(0);
        while(continuar=='S'){
            System.out.println("introduce el DNI");
           persona.setDni(teclado.nextLine());
            System.out.println("introduce el NOMBRE");
            persona.setNombre(teclado.nextLine());

            System.out.println("introduce el APELLIDO");
            persona.setApellidos(teclado.nextLine());

            System.out.println("introduce el EDAD");
            persona.setEdad(teclado.nextInt());
            teclado.nextLine();System.err.println();
            personas.add(persona);

            System.out.println("hasta ahora has introducido "+ personas.size()+ "personas");
                
            

            System.out.println("Quieres introducir otra persona");
        continuar = teclado.nextLine().toUpperCase().charAt(0);
        }   teclado.close();
        for (Persona personaActual : personas) {
            System.out.println(personaActual);
        }
       
        String pathFichero ="src//ejercicio4//persona.dat";
        ObjectOutputStream escritor=null;
        try {
            escritor= new ObjectOutputStream(new FileOutputStream(pathFichero));
            for (Persona personaActual : personas) {
                escritor.writeObject(personaActual);
            }
          
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }finally{
            if(escritor!=null)
            escritor.close();
        }
        
        ObjectInputStream





      












    }
    
}
