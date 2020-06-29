package com.company;

import static org.junit.jupiter.api.Assertions.*;

class CalcLogicTest {

    @org.junit.jupiter.api.Test
    void calculateInsuranceTotal() throws Exception {

        // tests if computation is correct with correct product parameter
        assertTrue(CalcLogic.calculateInsuranceTotal("Kompakt", 1) == 650);
        assertFalse(CalcLogic.calculateInsuranceTotal("Kompakt", 1) == 1);
        assertTrue(CalcLogic.calculateInsuranceTotal("Optimal", 1) == 700);
        assertFalse(CalcLogic.calculateInsuranceTotal("Optimal", 1) == 1);

        // tests if the exception is thrown when incorrect product parameter is passed
        Exception exception = assertThrows(Exception.class, () -> System.out.println(CalcLogic.calculateInsuranceTotal("Otimal", 1) == 1));
        assertEquals("Typo", exception.getMessage());

    }


}