package com.epam.unit89.trainingTask2;

public class FractionOperator {

	public static void main(String[] args) {
        int k = 3;
        Fraction[] fractions = new Fraction[k];
        fractions[0] = new Fraction(1,2);
        fractions[1] = new Fraction(2,3);
        fractions[2] = new Fraction(3,4);

        System.out.println("Display fractions:");
        for (int i = 0; i < k; i++) {
            System.out.print("[" + fractions[i].getNumerator() + "/" + fractions[i].getDenominator() + "]");
        }
    }
}
