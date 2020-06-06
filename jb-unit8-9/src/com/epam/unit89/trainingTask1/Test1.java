package com.epam.unit89.trainingTask1;

public class Test1 {
	private int x;
	private int y;
	
	public void setX(int _x) {
		x=_x;
	}
	
	public void setY(int _y) {
		y=_y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public void printX() {
		System.out.println("X = " +x);
	}
	
	public void printY() {
		System.out.println("Y = " +y);
	}
	
	public int calculateSum() {
		int Sum;
		Sum = x+y;
		return Sum;
	}
	
	public int calculateMax() {
		int max;
		if (x>y) {
			max = x;
		} else {
			max = y;
		}
		return max;
	}
}