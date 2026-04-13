package com.demo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testMultiplyMatrices() {
        int[][] A = {
            {1, 2},
            {3, 4}
        };
        int[][] B = {
            {5, 6},
            {7, 8}
        };
        
 
        int[][] expected = {
            {19, 22},
            {43, 50}
        };

        int[][] result = App.multiplyMatrices(A, B);
        assertArrayEquals(expected, result, "The matrix multiplication result is incorrect.");
    }

    @Test
    public void testIncompatibleDimensions() {
        int[][] A = {{1, 2, 3}}; 
        int[][] B = {{1, 2}};    

        int[][] result = App.multiplyMatrices(A, B);
        assertNull(result, "Should return null for incompatible matrix dimensions.");
    }
}