/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.calculator.calculadoraings;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Main {
     public static void main(String[] args) throws Exception {

  Analizadoring m = new Analizadoring();
        Comprobador c = new Comprobador();
         System.out.println("*la calculadora solo suma,resta,multiplica,divide Ejemplo: (40/2)*(4+50)/6+9 = 189");
        System.out.println("*Escribe una expresión a operar: ");
        Scanner leer = new Scanner(System.in);
        String expr = leer.nextLine();       
       m.inicio_exprecion(expr); 
     }
}
