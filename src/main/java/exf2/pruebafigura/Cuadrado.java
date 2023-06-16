/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exf2.pruebafigura;

import java.awt.Color;

/**
 *
 * @author cic
 */
public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(double x, double y, Color color,double lado) {
        super(x, y, color);
        this.lado=lado;
    }
    
    @Override
     public double perímetro() {
        return  2 * lado + 2 * lado;
    }

    @Override
    public double área() {
        
        return lado*lado;
    }
}
