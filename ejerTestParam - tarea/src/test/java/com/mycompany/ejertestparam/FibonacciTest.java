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
public class FibonacciTest {
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {2,"0,1,1,2"},{3,"0,1,1,2,3"}
        });
    }
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public String esperado;
    
    Fibonacci utils = new Fibonacci();
    
    @Test
    public void testFibonacci() {
        String resultado  = utils.bibonacci(valor1);
        assertEquals(esperado,resultado);
    }
    
}
