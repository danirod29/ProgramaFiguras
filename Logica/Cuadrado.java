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
public class Cuadrado extends Rectangulo{
    
//Constructor
    public Cuadrado(double base) {
        this.base = base;     
    }

//Metodos    
    @Override
    public void calcularArea(){        
        area = base * base;  
    }
    
    @Override
    public void calcularPerimetro(){   
        perimetro = (4 * base);
    }  
        
}
