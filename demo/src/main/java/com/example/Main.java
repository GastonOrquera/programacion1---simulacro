package com.example;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Empleado[] empleados = new Empleado[] {
                new Desarrollador("Ana", 120000, "Java"),
                new Gerente("Luis", 150000, "Ventas"),
                new Desarrollador("Carlos", 110000, "Python"),
                new Gerente("Marta", 130000, "Marketing")
        };

        System.out.println("Información de empleados:");
        for (Empleado e : empleados) {
            empresa.mostrarInformacion(e);
        }

        System.out.println("\nOrdenados por sueldo (descendente):");
        empresa.ordenarPorSueldo(empleados);
        for (Empleado e : empleados) {
            System.out.println(e.mostrarDatos());
        }

        System.out.println("\nBúsqueda por nombre:");
        try {
            Empleado buscado = empresa.buscarPorNombre(empleados, "Marta");
            System.out.println("Encontrado: " + buscado.mostrarDatos());
        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
