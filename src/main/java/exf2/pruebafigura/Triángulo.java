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
public class Triángulo extends Figura {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triángulo(double x, double y, Color color, double lado1, double lado2, double lado3) {
        super(x, y, color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    @Override
    public double perímetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public double área() {
        double sp = perímetro() / 2;
        return Math.sqrt(sp * (sp - lado1) * (sp - lado2) * (sp - lado3));
    }
}
