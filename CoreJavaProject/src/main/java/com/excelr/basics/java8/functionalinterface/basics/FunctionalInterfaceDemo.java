package com.excelr.basics.java8.functionalinterface.basics;

@FunctionalInterface
interface Singer{
	void singSong(String ss);
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		Singer indianSinger = (songName) -> {
			System.out.println("Singing the song: "+ songName);
			System.out.println("Adding melodious tunes...");
			System.out.println("Why this kolaveri...");
		};
		
		indianSinger.singSong("Yo boys");
		indianSinger.singSong("Jai Ho");
		indianSinger.singSong("Blue Eyes");
	}
}
