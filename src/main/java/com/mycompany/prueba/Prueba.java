/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;


public class Prueba {

    public static void main(String[] args) {
        

        // Crear un automóvil
        Automovil auto = new Automovil("Toyota", 2022, 1.8, "gasolina", "compacto", 4, 5, 180, "rojo");

        // Mostrar atributos iniciales
        auto.mostrarAtributos();

        // Colocar velocidad actual en 100 km/h
        auto.setVelocidadActual(100);
        System.out.println("Velocidad actual: " + auto.getVelocidadActual() + " km/h");

        // Aumentar velocidad en 20 km/h
        auto.acelerar(20);

        // Reducir velocidad en 50 km/h
        auto.desacelerar(50);

        // Frenar el automóvil
        auto.frenar();
    }
        
    }
}
