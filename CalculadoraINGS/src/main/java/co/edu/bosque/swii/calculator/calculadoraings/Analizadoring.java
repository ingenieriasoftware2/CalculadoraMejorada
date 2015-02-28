/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package co.edu.bosque.swii.calculator.calculadoraings;

import co.edu.bosque.swii.calculadoraCommand.Command;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Analizadoring {
    public static ArrayList e = new ArrayList();
    public static int[][] m = new int[7][7];
    public static String x ="" ,pasos="";
    Pila pila = new Pila();
         
      Comprobador c = new Comprobador();
    Invocador controlador = new Invocador();
    public static List<Double> lista = new ArrayList();
    
public String inicio_exprecion(String palabra){
      Analizadoring h= new Analizadoring();    
         boolean q;
         x= c.limpiarParentesis(palabra);
         h.SepararCaracteres(x);
        
         for (int i = 0; i <= lista.size(); i++) {
         int variable,opc,acu;
      variable=lista.size();
      opc= variable-1;
      acu= opc -1;
       if(lista.size()!=1){
      h.realizar_Operacion(acu,opc); 
       }
    }
            
         return pasos;
}
    public  void SepararCaracteres(String Exp) {

        pila.initPila();
        int i = 0;
        boolean valor;
        char compara;
        int n = Exp.length() - 1, d;
        String aux1, aux2;
        aux2 = Exp;
        aux1 = "";

        while ((i <= n)) {
            while ((i <= n) && (!Character.isDigit(aux2.charAt(i)))) {
                aux1 = aux1 + aux2.charAt(i);
                valor = evaluativo(aux2.charAt(i));
                if (valor = true && !pila.pilaVacia()) {
                    while (valor != false) {
                        compara = pila.topePila();
                        d = prioridad(compara, aux2.charAt(i));
                        valor = evaluar_prioridad(d);
                    }

                }
                pila.insertarPila(aux2.charAt(i));
                i++;
                aux1 = "";
            }

            while ((i <= n) && ((Character.isDigit(aux2.charAt(i))) || (aux2.charAt(i) == '.'))) {
                aux1 = aux1 + aux2.charAt(i);
                i++;
            }

            lista.add(Double.parseDouble(aux1));
            aux1 = "";
        }
        //return e;
    }

    public boolean evaluar_prioridad(int t) {
        boolean valor1;
        if (t == 1) {
            int variable, opc, acu;
            variable = lista.size();
            opc = variable - 1;
            acu = opc - 1;
            realizar_Operacion(acu, opc);
            valor1 = true;
        } else {
            valor1 = false;
        }
        return valor1;
    }

    public void realizar_Operacion(int variable, int variable2) {
        double resultado = 0, numero1, numero2;
        char operado;
        String compa;
        numero1 = lista.get(variable);
        numero2 = lista.get(variable2);
        operado = pila.topePila();
        compa =(new StringBuffer().append(operado)).toString();
        if (operado == '+') {
            
            resultado =  controlador.ejecutar(numero1, numero2, compa);
            pasos+=" operar  suma entre  ("+numero1+" + "+numero2+" )";
             System.out.println("operar  suma entre  "+numero1+" + "+numero2+" )");
        
        } else if (operado == '-') {
            resultado = controlador.ejecutar(numero1, numero2, compa);
            pasos+=" operar  resta entre ( "+numero1+" - "+numero2+" )";
               System.out.println("operar  resta entre  "+numero1+" - "+numero2+" )");
        } else if (operado == '*') {
            resultado = controlador.ejecutar(numero1, numero2, compa);
            pasos+=" operar  multiplicacion entre  ( "+numero1+" * "+numero2+" )";
              System.out.println("operar  multiplicacion entre  "+numero1+" * "+numero2+" )");
        } else if (operado == '/') {
            resultado = controlador.ejecutar(numero1, numero2, compa);
            pasos+=" operar  divicion entre ( "+numero1+" / "+numero2+" )";
              System.out.println("operar  divicion entre  "+numero1+" / "+numero2+" )");
        }
        imprimir(resultado);
        lista.set(variable, resultado);
        lista.remove(variable2);
        pila.retiraPila();

    }
     public double Operacion(double variable, double variable2,char operado) {
        double resultado = 0;        
       String opera= (new StringBuffer().append(operado)).toString();
        if (operado == '+') {
            resultado = controlador.ejecutar(variable, variable2, opera);
            pasos+=" operar  suma entre parentesis ( "+variable+" + "+variable2+" )";
             System.out.println("operar  suma entre parentesis ( "+variable+" + "+variable2+" )");
        } else if (operado == '-') {
            resultado = controlador.ejecutar(variable, variable2, opera);
            pasos+=" operar  resta entre parentesis ( "+variable+" - "+variable2+" )";
            System.out.println("operar  resta entre parentesis ( "+variable+" - "+variable2+" )");
        } else if (operado == '*') {
            resultado = controlador.ejecutar(variable, variable2, opera);
            pasos+=" operar  multiplicacion entre parentesis ( "+variable+" * "+variable2+" )";
            System.out.println("operar  multiplicacion entre parentesis ( "+variable+" * "+variable2+" )");
        } else if (operado == '/') {
            resultado = controlador.ejecutar(variable, variable2, opera);
            pasos+="operar  divicion entre parentesis ( "+variable+" / "+variable2+" )";
            System.out.println("operar  divicion entre parentesis ( "+variable+" / "+variable2+" )");
        }
        imprimir(resultado);
       
 return resultado;
    }

    public void imprimir(double b) {
        if(b!= 0.0){
        pasos+=" respuesta de la operacion " + b;
        }
        System.out.println("respuesta de la operacion " + b);
    }
    public  void vaciar_todo(){
      x ="";
      pasos="";
      lista= new ArrayList();;
    }
    

    public void matriz_Prioridad() {

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j <= 1 && i >= 2) {
                    m[i][j] = 1;
                } else {
                    m[i][j] = 0;
                }

            }

        }
     }

    public int prioridad(char opcion1, char opcion2) {
        matriz_Prioridad();
        int j = 0, i = 0;

        switch (opcion1) {
            case '+':
                i = 0;
                break;
            case '-':
                i = 1;
                break;
            case '*':
                i = 2;
                break;
            case '/':
                i = 3;
                break;
            case '^':
                i = 4;
                break;
            case '(':
                i = 5;
                break;

        }
        switch (opcion2) {
            case '+':
                j = 0;
                break;
            case '-':
                j = 1;
                break;
            case '*':
                j = 2;
                break;
            case '/':
                j = 3;
                break;
            case '^':
                j = 4;
                break;
            case '(':
                j = 5;
                break;
            case ')':
                j = 6;
                break;
        }

        return (m[i][j]);
    }

    public static boolean evaluativo(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')');
    }
    public double resultado_final(){
        return lista.get(0);
    }  
}
