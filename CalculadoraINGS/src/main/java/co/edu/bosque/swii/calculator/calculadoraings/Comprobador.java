/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.calculator.calculadoraings;

/**
 *
 * @author
 */
public class Comprobador {
    
    
  
    public String limpiarParentesis(String Exp)
    {
        Analizadoring e= new Analizadoring();
        
       double numero=0,numero1=0, resultado=0;
        char opera=0;
        String aux="", convert="";
        for (int i = 0; i < Exp.length(); i++) {
            if (Exp.charAt(i) == '(') {
                
                while (Exp.charAt(i) != ')') {
                    
                    while ((!Character.isDigit(Exp.charAt(i)))) {
                      opera = Exp.charAt(i);
                        i++;
                    }
                    while (((Character.isDigit(Exp.charAt(i))) || (Exp.charAt(i) == '.'))) {

                        convert += Exp.charAt(i);
                       i++;
                    }
                    if (numero == 0) {
                        numero = Float.parseFloat(convert);
                    } else {
                        numero1 = Float.parseFloat(convert);
                    }
                   convert="";

                }
                resultado = e.Operacion(numero, numero1, opera);
                aux +=resultado;
                numero=0;
                
             //   i--;
            }
            else if ((Exp.charAt(i) != '(') && (Exp.charAt(i) != ')')) {
                aux = aux + Exp.charAt(i);
            }
        
        
    }
        return aux;
    }  
}  
