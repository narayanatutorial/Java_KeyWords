package com.narayanatutorial.VolatileExamples;

public class VolatileThread extends Thread {
	private final VolatileDataHandle data;

	public VolatileThread(VolatileDataHandle data) {
		this.data = data;
	}

	@Override
	public void run() {
		int oldValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getName() + "]: Old value = " + oldValue);
		data.increaseCounter();
		int newValue = data.getCounter();
		System.out.println("[Thread " + Thread.currentThread().getName() + "]: New value = " + newValue);
	}
}