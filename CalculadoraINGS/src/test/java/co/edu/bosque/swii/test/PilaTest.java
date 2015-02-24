/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.test;


import co.edu.bosque.swii.calculator.calculadoraings.Pila;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 *
 * @author pablo
 */
public class PilaTest {
    @Test
   public void insertarALaPila(){
        Pila pila= new Pila();
        int num= pila.insertarPila('+'); 
        Assert.assertEquals(num, 1);
    }
    @Test
   public void retiraDePila(){
        Pila pila= new Pila();
        char num= pila.retiraPila(); 
        Assert.assertEquals(num, '#');
    }
    @Test
   public void topeDeLaPila(){
        Pila pila= new Pila();
        char num= pila.topePila(); 
        Assert.assertEquals(num, '#');
    }
       
   
    
}
