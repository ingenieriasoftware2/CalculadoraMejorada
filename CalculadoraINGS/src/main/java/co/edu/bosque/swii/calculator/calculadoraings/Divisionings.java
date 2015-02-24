/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.calculator.calculadoraings;

import co.edu.bosque.swii.calculadoraCommand.Command;

/**
 *
 * @author pablo
 */
public class Divisionings implements Command {

    public Divisionings() {
    }

    @Override
    public double ejecutar(double op1, double op2) {
    return op1/op2;
    }
    
}
