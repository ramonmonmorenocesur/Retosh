package ejercicio2;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ejercicio2 {
    

public static void main(String[] args) throws IOException {
    
puntoA();
puntoBC();

}
////aparatdo 1 crea un directorio" dirEjer2"" y comprueba que existe despues crea dos ficheros de texto""uno y dos txt"

/**
 * @throws IOException
 */
public static void puntoA() throws IOException{
//mostrar directorio actual

System.out.println(System.getProperty("user.dir"));

//crear directorio: dirEjer2 (comprobar si existe)
File directorio = new File("dirEjer2");
if(directorio.exists()){
System.out.println("El directorio ya existe");

} else {

 directorio.mkdir();
}


//crear dos ficheros
File fileUno = new File("dirEjer2//uno.txt");
File fileDos = new File("dirEjer2//dos.txt");

if (fileUno.exists()) {
System.out.println("El fichero"+fileUno.getName()+"Ya existe ");
}

    else{

  fileUno.createNewFile();        
    }
    
    if (fileDos.exists()) {
        System.out.println("El fichero"+fileDos.getName()+"Ya existe ");
        }
        
            else{
        
          fileDos.createNewFile();        
            }

            //metodo B
   



}



     public static void puntoBC() throws IOException {

//PIDE AL USUARIO NOMBRE HASTA QUE EL INTRODUCIDO SOLO SEA UN "-"


String nombre;
BufferedWriter escritor=null;
Scanner teclado = new Scanner(System.in);
    try {
        escritor = new BufferedWriter(new FileWriter(new File("dirEjer2//uno.txt")));
        do{
            System.out.println("Introduce nombre por pantalla");
            System.out.println("Introduce - para terminar");
            nombre=teclado.nextLine();
            if( ! nombre.equals("-"))
            escritor.write(nombre+'\n');
        }while(!nombre.equals("-"));
    }catch (IOException e) {
        System.out.println(e.getMessage());
    }finally{
        if(escritor!= null){
            escritor.close();
            teclado.close();
        }
    }
















}
}