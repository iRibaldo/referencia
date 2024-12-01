/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prueba.ouebita;





public class Pruebita {
    
    
    private String marca;   
    private int modelo;
    private double motor;
    private String tipoCombustible; // Valores: gasolina, bioetanol, diésel, biodiésel, gas natural.
    private String tipoAutomovil;  // Valores: ciudad, subcompacto, compacto, familiar, ejecutivo, SUV.
    private int numPuertas;
    private int numAsientos;
    private int velocidadMaxima;
    private String color;          // Valores: blanco, negro, rojo, naranja, amarillo, verde, azul, violeta.
    private int velocidadActual;

    

   
    // Constructor
    
   
    public Automovil(String marca, int modelo, double motor, String tipoCombustible, String tipoAutomovil, int numPuertas,
                     int numAsientos, int velocidadMaxima, String color) {
        
       
    this.marca = marca;
        
       
    this.modelo = modelo;
        
       
    this.motor = motor;
    this.tipoCombustible = tipoCombustible;
    this.tipoAutomovil = tipoAutomovil;
    this.numPuertas = numPuertas; 
    this.numAsientos = numAsientos;

    this.velocidadMaxima = velocidadMaxima;
    
    this.color = color;    
    this.velocidadActual = 0;
    }

   
    // Métodos Getters y Setters
    
   
    public String getMarca() {
        
       
    return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public int getModelo() {
        
       
    return modelo;
    }
    public void setModelo(int modelo) {
        
       
    this.modelo = modelo;
    }
    public double getMotor() {
        
       
    return motor;
    }
   
    public void setMotor(double motor) {
        
       
    this.motor = motor;
    }
    public String getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    public String getTipoAutomovil() {
        return tipoAutomovil;
    }
    public void setTipoAutomovil(String tipoAutomovil) {
        
       
    this.tipoAutomovil = tipoAutomovil;
    }
    public int getNumPuertas() {
        
       
    return numPuertas;
    }
    public void setNumPuertas(int numPuertas) {
        
       
    this.numPuertas = numPuertas;
    }
    public int getNumAsientos() {
        return numAsientos;
    }
    public void setNumAsientos(int numAsientos) {
        
       
    this.numAsientos = numAsientos;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getColor() {
        
       
    return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    // Métodos de control
    public void acelerar(int incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede acelerar más allá de la velocidad máxima permitida.");
        } else {
            velocidadActual += incremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    public void desacelerar(int decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar por debajo de 0 km/h.");
        } else {
            velocidadActual -= decremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    public void frenar() {
        velocidadActual = 0;
        System.out.println("El automóvil se ha detenido. Velocidad actual: " + velocidadActual + " km/h");
    }

    public double calcularTiempoLlegada(double distancia) {
        if (velocidadActual == 0) {
            System.out.println("El automóvil está detenido, el tiempo no se puede calcular.");
            return -1;
        }
        return distancia / velocidadActual;
    }

    public void mostrarAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " litros");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("Número de Puertas: " + numPuertas);
        System.out.println("Número de Asientos: " + numAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }

}
