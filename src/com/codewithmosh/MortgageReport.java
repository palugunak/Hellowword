package com.codewithmosh;

import java.text.NumberFormat;

public class MortgageReport {

    private MortgageCaluculator caluculator;

    public MortgageReport(MortgageCaluculator caluculator) {
        this.caluculator = caluculator;
    }

    public void printPaymentSchedule() {
        System.out.println();
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("----------------");
        for (short month = 1; month <= caluculator.getYears() * MortgageCaluculator.MONTHS_IN_YEAR; month++) {
            double balance = caluculator.calculateBalance(month);
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
        }
    }

    public void printMortgtage(int principal, float annualInterest, byte years) {
        double mortgage = caluculator.calculateMortgage();
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println();
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.println("Monthly Payments: " + mortgageFormatted);
    }

    public void printMortgage() {

    }
}
