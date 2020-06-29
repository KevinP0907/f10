package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

        //example run of the program
        int examplePropSize = 50;
        int compactSum = CalcLogic.calculateInsuranceTotal("Kompakt", examplePropSize);
        int optimalSum = CalcLogic.calculateInsuranceTotal("ptimal", examplePropSize);

        System.out.println("Kostenvoranschlag für Kompaktpaket: " + compactSum + "\nKostenvoranschlag für Optimalpaket: " + optimalSum);

    }

}
