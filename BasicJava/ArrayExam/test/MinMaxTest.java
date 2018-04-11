/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import arrayexam.ArrayExam;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tisanai.Cha
 */
public class MinMaxTest {

    private int[] score = {100, 30, 60, 1, 80};
    

    public MinMaxTest() {
    }

    
    @Test
    public void NumberLessthanZeroOrMorethanOneHundredReturnNull() { //0-100
	int[] scoreOutRange={-1, 1, 3, 50};
        int[] result = ArrayExam.findMinMax(scoreOutRange);
        assertNull(result);
        
    }

    @Test
    public void findMinZeroInArray() { // min check
        int[] zeroScore={2, 1, 0, 50};
        int expectResult = 0;
        int[] result = ArrayExam.findMinMax(zeroScore);
        assertEquals(expectResult, result[0]);
    }
    
    @Test
    public void findMinInArray() { // min check
        int expectResult = 1;
        int[] result = ArrayExam.findMinMax(score);
        assertEquals(expectResult, result[0]);
    }
   
    @Test
    public void findMaxInArray() { // max check
        int expectResult = 100;
        int[] result = ArrayExam.findMinMax(score);
        assertEquals(expectResult, result[1]);
    }

    @Test
    public void arrayLength() { //min an max
        int expectResult = 2;
        int result = ArrayExam.findMinMax(score).length;
        assertEquals(expectResult, result);
    }

}
