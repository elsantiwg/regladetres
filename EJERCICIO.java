/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author kspg
 */
public class EJERCICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        Scanner valor = new Scanner(System.in);
        System.out.println("valor 1: ");
        double valor1 = valor.nextDouble();
        System.out.println("valor 2: ");
        double valor2 = valor.nextDouble();
        System.out.println("valor a calcular: ");
        double calcular = valor.nextDouble();
        double resultado = (calcular * valor2) / valor1;
        System.out.println("El resultado es: " + resultado);
    }
}
