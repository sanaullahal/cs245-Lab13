package edu.miu.cs.cs425.lab14unittest.flattenarray.q1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(value = MockitoJUnitRunner.class)
public class MyMathTest {

    @Mock
    ICalculator calc;


//    @Before
//    public void setUp() throws Exception {
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }

    @Test
    public void doComplexCalculation() {
        MyMath math= new MyMath(calc);
        //when(calc.add(3,4)).thenReturn(7);
        when(calc.multiply(5,6)).thenReturn(30);
        //double result= math.doComplexCalculation(3,4);
        double result1= math.doComplexCalculation(5,6);
        System.out.println("Result1: " +result1);
        assertEquals(30, result1, 0);
        //assertEquals(30, result1);
    }
}