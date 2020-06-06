package com.epam.unit89.Task01;

public class CounterOperator {
	public static void main(String[] args) {
		countWithCustomValues();
		countWithDefaultValues();
	}
	
	public static void countWithCustomValues() {
		Counter counter = new Counter(0, 20, 5);
		System.out.println("Starting to increase from the number - " + counter.currentValue());
		for (int i = 0; i < 22; i++) {
			counter.increase();
			System.out.println("Current value is: " + counter.currentValue());
		}
		System.out.println("Finish counting");
				  
		System.out.println();
		System.out.println("Starting to decrease from the number - " + counter.currentValue());
		for (int i = 0; i < 25; i++) {
			counter.decrease();
			System.out.println("Current value is: " + counter.currentValue());
		  }
		System.out.println("Finish counting");
	}
	
	public static void countWithDefaultValues() {
		Counter counter = new Counter();
		System.out.println("Starting to increase from the number - " + counter.currentValue());
		for (int i = 0; i < 22; i++) {
			counter.increase();
			System.out.println("Current value is: " + counter.currentValue());
		}
		System.out.println("Finish counting");
				  
		System.out.println();
		System.out.println("Starting to decrease from the number - " + counter.currentValue());
		for (int i = 0; i < 25; i++) {
			counter.decrease();
			System.out.println("Current value is: " + counter.currentValue());
		  }
		System.out.println("Finish counting");
	}
}
