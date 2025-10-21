package com.example;

public class Empresa {
    public void mostrarInformacion(Empleado empleado) {
        System.out.println(empleado.mostrarDatos());
    }

    public void ordenarPorSueldo(Empleado[] empleados) {
        for (int i = 0; i < empleados.length - 1; i++) {
            for (int j = 0; j < empleados.length - 1 - i; j++) {
                if (empleados[j].getSueldo() < empleados[j + 1].getSueldo()) {
                    Empleado aux = empleados[j];
                    empleados[j] = empleados[j + 1];
                    empleados[j + 1] = aux;
                }
            }
        }
    }

    public Empleado buscarPorNombre(Empleado[] empleados, String nombreBuscado) {
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(nombreBuscado)) {
                return e;
            }
        }
        throw new RuntimeException("Empleado con nombre '" + nombreBuscado + "' no encontrado.");
    }
}
