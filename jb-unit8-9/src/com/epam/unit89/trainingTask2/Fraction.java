package com.epam.unit89.trainingTask2;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction (int _numerator, int _denominator) {
		numerator = _numerator;
		denominator = _denominator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public int getDenominator() {
		return denominator;
	}
}
