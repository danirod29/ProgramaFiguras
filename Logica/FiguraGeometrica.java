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
public class FiguraGeometrica {
//Atributos   
    protected double area; 
    protected double perimetro;
    
//Constructor
    
    public FiguraGeometrica() {
    }
//Metodos    
    public void calcularArea(){       
    }

    public void calcularPerimetro(){
    }
    
//Metodos setter y getter
    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
    
//...............................................
    
    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
   
}
