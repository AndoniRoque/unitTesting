package ar.utn.frbb.tup;

import java.util.ArrayList;

public class Persona {

    public String nombre;
    public int edad;
    public long dni;
    public ArrayList<String> hijos = new ArrayList<>();

    public Persona(String nombre, int edad, long dni, ArrayList<String> hijos) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public ArrayList<String> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<String> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni +
                ", hijos=" + hijos +
                '}';
    }

    public void agregarHijos(String hijo) {
        getHijos().add(hijo);
    }
}
