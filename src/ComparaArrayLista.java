//creamos un array de 10000 elementos de tipo Persona
//crear una lista de 10000 elementos de tipo persona 
//comparar el tiempo de inserccion en cada caso.
// todas las instacias son igaules
//compara el tiempo 

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ComparaArrayLista {
    public static void main(String[] args) {

        // crear array de 10000 personas
        // introducirla en el array

        Persona persona = new Persona("jd", "jd", "jd", 12);

        Persona[] personas;
        personas = new Persona[10000];
        long tiempoInicial=0;
        long tiempoSalida=0;
        long tiempoTotal=0;
       tiempoInicial= System.nanoTime();
       // for de array
        for (int i=0;i<personas.length;i++){

            persona=personas[i];
        }
        tiempoSalida=System.nanoTime();
        tiempoTotal=tiempoSalida-tiempoInicial;
        System.out.println("el tiempo total "+tiempoTotal);

 List<Persona> personas2 = new ArrayList<Persona>();
 tiempoInicial= System.nanoTime();
 //for de la lista
for(int i =0;i<=10000;i++){

    personas2.add(persona);
}

tiempoSalida=System.nanoTime();
tiempoTotal=tiempoSalida-tiempoInicial;
System.out.println("el tiempo total "+tiempoTotal);

//array2
tiempoInicial= System.nanoTime();
for (int i=0;i<personas.length;i++){

    personas[i]=persona;
}
tiempoSalida=System.nanoTime();
tiempoTotal=tiempoSalida-tiempoInicial;
System.out.println("el tiempo total "+tiempoTotal);
//lista2
tiempoInicial= System.nanoTime();
for(int i =0;i<=10000;i++){

    personas2.get(i);
}tiempoSalida=System.nanoTime();
tiempoTotal=tiempoSalida-tiempoInicial;
System.out.println("el tiempo total "+tiempoTotal);
    }
}

class Persona {

    // esta clase la tendras que haber definido antes
    // minimo 4 atributos y un constructor para inicializar el objeto).
    // ATRIBUTOS
    // DNI,NOMBRE,APELLIDOS,EDAD
    // PRIVATE
    // CONSTRUCTOR
    // GETTTERS Y SETTERS

    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    // constructor

    public Persona() {
        dni = null;
        nombre = null;
        apellidos = null;
        edad = -1;
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // getters y setters
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return ("[DNI" + dni + " " + "NOMBRE:" + nombre + "]");
    }
}