package com.epam.unit89.trainingTask1;

public class Test1Operator {

	public static void main(String[] args) {
		Test1 obj = new Test1();
		obj.setX(3);
		obj.setY(2);
		int x = obj.getX();
		int y = obj.getY();
		obj.printX();
		obj.printY();
		int Sum = obj.calculateSum();
		System.out.println("Sum " +x+ " and " +y+ " = " + Sum);
		int Max = obj.calculateMax();
		System.out.println("Max between " +x+ " and " +y+ " = " + Max);
	}

}
