package ejercicio4;
//crear un array de 1000 persona

import java.io.BufferedInputStream;

//introducir la misma persona pero con edad consecutivo
//crear archivo en directorio "personas" llamado "personasInicial.dat"
//almacenar en dicho archivo todas las personas 
//crear dos archivos "personas par.dat"y personasimpar.dat
//leer personas de personas inical.dat y almacenar dependiendo del dni en uno otro

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Ejercicio4Nuestro {

    public static void main(String[] args) throws IOException {
    Persona[]personas=new Persona[1000];
    Persona persona=new Persona ("jk","jk","jk",0);    
    File directorio=new File("C://Users//RamonMorenoUrbaneja//Desktop//RETOS//retoUD5//src//ejercicio4//personas");
    directorio.mkdir();
    File personaActual = new File("C://Users//RamonMorenoUrbaneja//Desktop//RETOS//retoUD5//src//ejercicio4//personas//personaIncial.dat");
    ObjectOutputStream escritor = null;
    //flujo de salida
    try {
        escritor = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(personaActual)));

        for(int i =0;i<personas.length;i++){
            persona.setEdad(i);
            personas[i]=persona;
            escritor.writeObject(personas[i]);
        }
       
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    } finally {
        if (escritor != null) {
            escritor.close();
        }
    }

    //flujo de entrada

    //abrir un nuevo flujo de salida y flujos de entrada para par e impar
    ObjectOutputStream escritorPar=null;
    ObjectOutputStream escritorImpar=null;
    File personaImpar;
    File personaPar;
    personaPar = new File(directorio.getAbsolutePath()+"//personaPar.dat");
    personaImpar = new File(directorio.getAbsolutePath()+"//personaImpar.dat");
    ObjectInputStream lector=null;
   

    
   
        try {
            lector = new ObjectInputStream(new BufferedInputStream(new FileInputStream(personaActual)));
            escritorPar = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(personaPar)));
            escritorImpar= new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(personaImpar)));
            
            for (int i = 0; i < personas.length; i++) {
                persona=(Persona)lector.readObject();
                if(persona.getEdad()%2==0){
                    escritorPar.writeObject(persona);
                }else{
                    escritorImpar.writeObject(persona);
                }
            }
            
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if (lector!=null) {
                lector.close();
                
            }
            if (escritorPar!=null) {
                escritorPar.close();
                
            }
            if(escritorImpar!=null){
                escritorImpar.close();
            }
        }
    }

}

