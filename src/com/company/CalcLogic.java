package com.company;

public class CalcLogic {

    public static int calculateInsuranceTotal(String product, int propSize) throws Exception {

        if ( product == "Kompakt") {
            return propSize * 650;
        } else if ( product == "Optimal") {
            return propSize * 700;
        } else {
            throw new Exception("Typo");
        }

    }
}
