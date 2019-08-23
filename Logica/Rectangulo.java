/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Cristian
 */
public class Rectangulo extends FiguraGeometrica{
    
//Atributos     
    protected double base;
    protected double altura;

 //Constructor   
    public Rectangulo(){
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
 //Metodos    
    @Override
    public void calcularArea(){        
        area = base * altura;  
    }
    
    @Override
    public void calcularPerimetro(){   
        perimetro = (2 * base) + (2 * altura);
    }  
}
