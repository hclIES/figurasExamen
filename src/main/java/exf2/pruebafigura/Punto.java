/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exf2.pruebafigura;

/**
 *
 * @author cic
 */
public class Punto extends Figura{

    private double x;
    private double y;

    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto p) {
        x = p.x;
        y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distancia(Punto p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    public Punto simétrico() {
        Punto nuevoP = new Punto(this.x * -1, this.y);
        return nuevoP;
    }

    public boolean compara(Punto p) {
        boolean salida = false;
        if (p.x == x && p.y == y) {
            salida = true;
        }
        return salida;

    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }

    @Override
    public double perímetro() {
        return 1;
    }

    @Override
    public double área() {
        return 1;
    }
}
