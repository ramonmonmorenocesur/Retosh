package ejercicio4;

import java.io.Serializable;

public class Persona implements Serializable{

    //esta clase la tendras que haber definido antes 
    //minimo 4 atributos y un constructor para inicializar el objeto).
    //ATRIBUTOS
    //DNI,NOMBRE,APELLIDOS,EDAD
    //PRIVATE
    //CONSTRUCTOR
    //GETTTERS Y SETTERS


    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    //constructor

    public Persona() {
        dni=null;
        nombre=null;
        apellidos=null;
        edad=-1;
    }

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //getters y setters
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
    public String toString(){
        return("[DNI"+ dni+" "+"NOMBRE:"+nombre+"APELLIDO "+ apellidos+"EDAD "+edad  +   "]");
    }
}
