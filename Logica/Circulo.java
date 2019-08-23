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
public class Circulo extends FiguraGeometrica{
    
//Atributos    
    private double radio;
    
//Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
//Metodos     
    @Override
    public void calcularArea(){ 
        area = Math.PI*(Math.pow(radio,2));
    }
    
    @Override
    public void calcularPerimetro(){       
        perimetro = (2 * radio) * Math.PI;
    }
   
}
