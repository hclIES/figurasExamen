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
public class Rectángulo extends Figura {

    private double base;
    private double altura;

    public Rectángulo(double x, double y, Color color, double base, double altura) {
        super(x, y, color);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double perímetro() {
        return 2 * base + 2 * altura;
    }

    @Override
    public double área() {
        return base * altura;
    }
}
