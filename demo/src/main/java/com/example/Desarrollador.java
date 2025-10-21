package com.example;

public class Desarrollador extends Empleado {
    private String lenguaje;

    public Desarrollador(String nombre, double sueldo, String lenguaje) {
        super(nombre, sueldo);
        this.lenguaje = lenguaje;
    }

    @Override
    public String mostrarDatos() {
        return "Desarrollador " + getNombre() + ", lenguaje: " + lenguaje + ", sueldo: " + getSueldo();
    }
}
