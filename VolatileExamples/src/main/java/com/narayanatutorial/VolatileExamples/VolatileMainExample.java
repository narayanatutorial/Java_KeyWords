package com.narayanatutorial.VolatileExamples;

public class VolatileMainExample {

	private final static int noOfThreads = 5;

	public static void main(String[] args) throws InterruptedException {
		VolatileDataHandle volatileData = new VolatileDataHandle(); // object of VolatileData class
		Thread[] threads = new Thread[noOfThreads]; // creating Thread array
		for (int i = 0; i < noOfThreads; ++i) {
			threads[i] = new VolatileThread(volatileData);
		}
		for (int i = 0; i < noOfThreads; ++i) {
			threads[i].setName("T"+i);
			threads[i].start(); // starts all reader threads
		}
		for (int i = 0; i < noOfThreads; ++i) {
			threads[i].join(); // wait for all threads
		}
	}
}
