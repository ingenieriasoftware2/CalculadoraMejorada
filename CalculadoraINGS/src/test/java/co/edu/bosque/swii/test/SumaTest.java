/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.test;


import co.edu.bosque.swii.calculator.calculadoraings.Sumaings;
import co.edu.bosque.swii.calculadoraCommand.Command;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author pablo
 */
public class SumaTest {
    @Test
    public void debeSumarDosNumeros() {
        Command command = new Sumaings();
        double resultado = command.ejecutar(1, 1);
        Assert.assertEquals(resultado, 2.0);
    }

    @Test
    public void sumaNegativa() {
        Command command = new Sumaings();
        double resultado = command.ejecutar(-5, -10);
        Assert.assertEquals(-15.0, resultado);
    }
    @Test
    public void testSumaCeros(){
        Command command= new Sumaings();
        double resultado = command.ejecutar(0, 0);
        Assert.assertEquals(0.0,resultado);
    }
    @Test
    public void testSumaDecimales(){
       Command command= new Sumaings();
        double resultado = command.ejecutar(2.4, 1.1);
        Assert.assertEquals(3.5,resultado);
        
    }
}
