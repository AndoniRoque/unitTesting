package ar.utn.frbb.tup;

import java.util.HashMap;
import java.util.Map;

public class Hijos {
    public String nombre;
    public int edad;
    public HashMap<String, Persona> padres = new HashMap<>();

    public HashMap<String, Persona> getPadres() {
        return padres;
    }

    public void setPadres(HashMap<String, Persona> padres) {
        this.padres = padres;
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


    public Hijos(String nombre, int edad, Map<String, Persona> padres) {
        this.nombre = nombre;
        this.edad = edad;
        agregarPadres(padres.get("Padre"), padres.get("Madre"));
    }

    @Override
    public String toString() {
        return "Hijos{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                '}';
    }

    public void agregarPadres(Persona padre, Persona madre) {
        padres.put("Padre", padre);
        padres.put("Madre", madre);
    }
}
