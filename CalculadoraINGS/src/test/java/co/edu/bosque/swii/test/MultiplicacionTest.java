/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.test;


import co.edu.bosque.swii.calculadoraCommand.Command;
import co.edu.bosque.swii.calculator.calculadoraings.Multiplicacionings;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author pablo
 */
public class MultiplicacionTest {
 @Test
    public void debeMultiplicacionDosNumeros() {
        Command command = new Multiplicacionings();
        double resultado = command.ejecutar(6, 5);
        Assert.assertEquals(30.0, resultado);
    }

    @Test
    public void multiplicacionNegativa() {
        Command command = new Multiplicacionings();
        double resultado = command.ejecutar(-5, -11);
        Assert.assertEquals(55.0, resultado);
    }
    @Test
    public void testMultiplicacionCeros(){
        Command command= new Multiplicacionings();
        double resultado = command.ejecutar(0, 0);
        Assert.assertEquals(0.0,resultado);
    }
    @Test
    public void testMultiplicacionDecimales(){
       Command command= new Multiplicacionings();
        double resultado = command.ejecutar(2.4, 2.1);
        Assert.assertEquals(5.04,resultado);
        
    }      
}
