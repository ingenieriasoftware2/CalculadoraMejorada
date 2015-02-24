/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.test;


import co.edu.bosque.swii.calculator.calculadoraings.Invocador;
import static java.lang.Double.NaN;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author pablo
 */
public class InvocadorTest {
    @Test
    public void debeMultiplicacionDosNumeros() {
        Invocador invocador = new Invocador();
        double resultado = invocador.ejecutar(6, 5, "*");
        Assert.assertEquals(30.0, resultado);
    }
     @Test
    public void testMultiplicacionDecimales(){
       Invocador invocador= new Invocador();
        double resultado = invocador.ejecutar(2.4, 2.1,"*");
        Assert.assertEquals(5.04,resultado);
        
    } 
     @Test
    public void restaNegativa() {
        Invocador invocador= new Invocador();
        double resultado = invocador.ejecutar(-5, -11,"-");
        Assert.assertEquals(6.0, resultado);
    }
    @Test
    public void sumaNegativa() {
        Invocador invocador = new Invocador();
        double resultado = invocador.ejecutar(-5, -10,"+");
        Assert.assertEquals(-15.0, resultado);
    }
     @Test
    public void testDivisionCeros(){
        Invocador invocador= new Invocador();
        double resultado = invocador.ejecutar(0, 0,"/");
        Assert.assertEquals(NaN,resultado);
    }
    
}
