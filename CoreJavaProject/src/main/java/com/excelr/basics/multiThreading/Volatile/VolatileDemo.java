package com.excelr.basics.multiThreading.Volatile;

public class VolatileDemo {

	private static volatile boolean flag = false;

	public static void main(String[] args) {
		Thread writerThread = new Thread(() -> {
			System.out.println("Writer: Changing flag to true");
			flag = true;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Writer: Flag is now true");
		});

		Thread readerThread = new Thread(() -> {
			while (!flag) {
				System.out.println("Reader: waiting for flag to be true");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("Writer: Flag is now true");
		});
		
		writerThread.start();
		readerThread.start();
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		try {
			writerThread.join();
			readerThread.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

	}
}
