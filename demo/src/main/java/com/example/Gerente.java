package com.example;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    @Override
    public String mostrarDatos() {
        return "Gerente " + getNombre() + ", departamento: " + departamento + ", sueldo: " + getSueldo();
    }
}
