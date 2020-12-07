/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author jhamil
 */
@RunWith(Parameterized.class)
public class CalculadoraTest {
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {2,6,"+",8},{3,9,"*",27},{10,3,"-",7},{16,4,"/",4},{12,0,"/",0}
        });
    }
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public int valor2;
    @Parameterized.Parameter(2)
    public String op;
    @Parameterized.Parameter(3)
    public int esperado;
    
    Calculadora utils = new Calculadora();
    
    @Test
    public void testCalculadora() {
        int resultado  = utils.suma(valor1,valor2);
        if(op == "+"){
            assertEquals(esperado,utils.suma(valor1,valor2));
        }
        if(op == "-"){
            assertEquals(esperado,utils.resta(valor1,valor2));
        }
        if(op == "*"){
            assertEquals(esperado,utils.multimplicacion(valor1,valor2));
        }
        if(op == "/"){
            
            if(valor2!=0){
                assertEquals(esperado,utils.division(valor1,valor2));
            }
            else{
 
            }
        }
    
    }
    
}
