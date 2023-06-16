/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package exf2.pruebafigura;

import java.util.Scanner;
import java.awt.Color;
import java.util.InputMismatchException;

/**
 *
 * @author cic
 */
public class PruebaFigura {

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("1) Triángulo");
            System.out.println("2) Rectángulo");
            System.out.println("3) Cuadrado");
            System.out.println("4) Figura mayor que otra");
            System.out.println("5) Salir");
            boolean valido = false;
            do {
                try {
                    System.out.print("Introduzca una opción (1-5): ");
                    opcion = new Scanner(System.in).nextInt();
                    if (opcion < 1 || opcion > 5) {
                       throw new InputMismatchException();
                    }else{
                        valido=true;
                    }
                } catch (InputMismatchException io) {
                    System.out.println("Debe ser un número entre 1 y 5");
                }
            } while (!valido);
            try {
                if (opcion != 5) {
                    System.out.print("Introduzca la coordenada x del centro: ");
                    double x = new Scanner(System.in).nextDouble();
                    System.out.print("Introduzca la coordenada y del centro: ");
                    double y = new Scanner(System.in).nextDouble();
                    switch (opcion) {
                        case 1 ->                             {
                                System.out.print("Introduzca el lado 1 del triángulo: ");
                                double lado1 = new Scanner(System.in).nextDouble();
                                System.out.print("Introduzca el lado 2 del triángulo: ");
                                double lado2 = new Scanner(System.in).nextDouble();
                                System.out.print("Introduzca el lado 3 del triángulo: ");
                                double lado3 = new Scanner(System.in).nextDouble();
                                Triángulo t = new Triángulo(x, y, Color.red, lado1, lado2, lado3);
                                System.out.println("El perímetro es " + t.perímetro());
                                System.out.println("El área es " + t.área());
                            }
                        case 2 -> {
                            System.out.print("Introduzca la base del rectángulo: ");
                            double base = new Scanner(System.in).nextDouble();
                            System.out.print("Introduzca la altura del rectángulo: ");
                            double altura = new Scanner(System.in).nextDouble();
                            Rectángulo r = new Rectángulo(x, y, Color.red, base, altura);
                            System.out.println("El perímetro es " + r.perímetro());
                            System.out.println("El área es " + r.área());
                        }
                        case 3 ->                             {
                                System.out.print("Introduzca el lado del cuadrado: ");
                                double lado = new Scanner(System.in).nextDouble();
                                Cuadrado c = new Cuadrado(x, y, Color.red, lado);
                                System.out.println("El perímetro es " + c.perímetro());
                                System.out.println("El área es " + c.área());
                            }
                        case 4 ->                             {
                                System.out.println("vamos a comparar dos cuadrados");
                                System.out.print("Introduzca el lado del primer cuadrado: ");
                                double lado = new Scanner(System.in).nextDouble();
                                System.out.print("Introduzca el lado del segundo cuadrado: ");
                                double lado1 = new Scanner(System.in).nextDouble();
                                Cuadrado c1 = new Cuadrado(x, y, Color.red, lado);
                                Cuadrado c2 = new Cuadrado(x, y, Color.red, lado);
                                if (c1.esMayorQue(c2) == 1) {
                                    System.out.println("El primer cuadrado es mayor");
                                } else if (c1.esMayorQue(c2) == -1) {
                                    System.out.println("el segundo cuadrado es mayor");
                                } else if (c1.esMayorQue(c2) == 0) {
                                    System.out.println("Los cuadrados son iguales");
                                }                                  }
                        default -> {
                        }
                    }
                } else {
                    System.out.println("Opción inválida");
                }
            } catch (InputMismatchException io) {
                System.out.println("Debe ser un número");
            }
        } while (opcion != 5);
    }
}
