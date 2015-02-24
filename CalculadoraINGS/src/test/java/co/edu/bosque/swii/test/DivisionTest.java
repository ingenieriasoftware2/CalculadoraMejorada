/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.test;

import co.edu.bosque.swii.calculadoraCommand.Command;
import co.edu.bosque.swii.calculator.calculadoraings.Divisionings;
import static java.lang.Double.NaN;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author pablo
 */
public class DivisionTest {
   @Test
    public void debeDivisionDosNumeros() {
        Command command = new Divisionings();
        double resultado = command.ejecutar(6, 5);
        Assert.assertEquals(1.2, resultado);
    }

    @Test
    public void divisionNegativa() {
        Command command = new Divisionings();
        double resultado = command.ejecutar(-5, -11);
        Assert.assertEquals(0.45454545454545453, resultado);
    }
    @Test
    public void testDivisionCeros(){
        Command command= new Divisionings();
        double resultado = command.ejecutar(0, 0);
        Assert.assertEquals(NaN,resultado);
    }
    @Test
    public void testDivisionDecimales(){
       Command command= new Divisionings();
        double resultado = command.ejecutar(2.4, 1.5);
        Assert.assertEquals(1.5999999999999999,resultado);
        
    }   
}
