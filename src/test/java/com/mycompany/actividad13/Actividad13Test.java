/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.actividad13;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author yerayo
 */
public class Actividad13Test {
    
    public Actividad13Test() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }

    /**
     * Test of dia_laboral method, of class Actividad13.
     */
    @org.junit.jupiter.api.Test
    public void testDia_laboral_1() {
        System.out.println("dia_laboral");
        String dia = "Lunes";
        boolean expResult = true;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDia_laboral_2() {
        System.out.println("dia_laboral");
        String dia = "Martes";
        boolean expResult = true;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDia_laboral_3() {
        System.out.println("dia_laboral");
        String dia = "Miercoles";
        boolean expResult = true;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDia_laboral_4() {
        System.out.println("dia_laboral");
        String dia = "Jueves";
        boolean expResult = true;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDia_laboral_5() {
        System.out.println("dia_laboral");
        String dia = "Viernes";
        boolean expResult = true;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDia_laboral_6() {
        System.out.println("dia_laboral");
        String dia = "Sabado";
        boolean expResult = false;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDia_laboral_7() {
        System.out.println("dia_laboral");
        String dia = "Domingo";
        boolean expResult = false;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testDia_laboral_8() {
        System.out.println("dia_laboral");
        String dia = "default";
        boolean expResult = false;
        boolean result = Actividad13.dia_laboral(dia);
        assertEquals(expResult, result);
    }
    
}
