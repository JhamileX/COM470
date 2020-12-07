/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejertestparam;

import java.util.List;
import org.assertj.core.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author jhamil
 */
@RunWith(Parameterized.class)
public class NumeroPrimoTest {
    
    
    @Parameterized.Parameters
    public static List<Object> datos() {
        //devolvera una lista
        return Arrays.asList(new Object[][]{
            {2,true},{5,true},{8,false},{15,false},{42,false},{17,true}
        });
    }
    @Parameterized.Parameter(0)
    public int valor1;
    @Parameterized.Parameter(1)
    public Boolean esperado;
    
    NumeroPrimo utils = new NumeroPrimo();
    
    @Test
    public void testNumeroPrimo() {
        Boolean resultado  = utils.validate(valor1);
        assertEquals(esperado,resultado);
    }
}
