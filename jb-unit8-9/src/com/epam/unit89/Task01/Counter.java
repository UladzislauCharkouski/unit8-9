package com.epam.unit89.Task01;

public class Counter {
	private int min;
	private int max;
	private int current;
	
	public Counter(int _min, int _max, int _current) {
		min = _min;
		max = _max;
		current = _current;
	}
	
	public Counter() {
		this(0, 10, 1);
	}
	
	public int currentValue() {
		return current;
	}
	
	public void increase() {
		current++;
		if (current > max) {
		   current = min;
		}
	}
	
	public void decrease() {
		current--;
		if (current < min) {
		   current = max;
		}
	}
}