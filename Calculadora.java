package PAQUETE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Calculadora {
    
    private double num_1;
    private double num_2;

    
    //Constructores
    public Calculadora() {
    }

    public Calculadora(double numero1, double numero2) {
        this.num_1 = numero1;
        this.num_2 = numero2;
        
    }
    
    //Getters and setters

    public double getNumero1() {
        return num_1;
    }

    public void setNumero1(double numero1) {
        this.num_1 = numero1;
    }

    public double getNumero2() {
        return num_2;
    }

    public void setNumero2(double numero2) {
        this.num_2 = numero2;
    }

    
    
    
    //To String

    @Override
    public String toString() {
        return "Calculadora{" + "numero1=" + num_1 + ", numero2=" + num_2 + '}';
    }

    
    
    public double getSuma(){
        double resultado;
        resultado=num_1+num_2;
        return resultado;
    }
    
    public double getResta(){
        double resultado;
        resultado=num_1-num_2;
        return resultado;
    }
    
    public double getMultiplicacion(){
        double resultado;
        resultado=num_1*num_2;
        return resultado;
    }
    
    public double getDivision(){
        double resultado;
        resultado=num_1/num_2;
        return resultado;
    }
    
    
    
}
