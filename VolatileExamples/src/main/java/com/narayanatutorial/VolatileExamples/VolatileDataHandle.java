package com.narayanatutorial.VolatileExamples;

public class VolatileDataHandle {
	private volatile int counter = 0;

	public int getCounter() {
		return counter;
	}

	public void increaseCounter() {
		++counter; // increases the value of counter by 1
	}
}
