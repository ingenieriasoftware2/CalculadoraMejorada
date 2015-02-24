/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.test;

import co.edu.bosque.swii.calculator.calculadoraings.Restaings;
import co.edu.bosque.swii.calculadoraCommand.Command;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author pablo
 */
public class RestaTest {
  @Test
    public void deberestarDosNumeros() {
        Command command = new Restaings();
        double resultado = command.ejecutar(6, 5);
        Assert.assertEquals(1.0, resultado);
    }

    @Test
    public void restaNegativa() {
        Command command = new Restaings();
        double resultado = command.ejecutar(-5, -11);
        Assert.assertEquals(6.0, resultado);
    }
    @Test
    public void testrestaCeros(){
        Command command= new Restaings();
        double resultado = command.ejecutar(0, 0);
        Assert.assertEquals(0.0,resultado);
    }
    @Test
    public void testrestaDecimales(){
       Command command= new Restaings();
        double resultado = command.ejecutar(2.4, 1.1);
        Assert.assertEquals(1.2999999999999998,resultado);
        
    }   
}
