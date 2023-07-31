package com.github.poo.t13;

public class Main {

	public static void main(String[] args) {

		HelloWorld helloWorld = new HelloWorld();
		Media media = new Media(15.0, 30.0, 45.0);
		ConcatenaStrings concatena = new ConcatenaStrings("Programacao", " Orientada a Objetos");
		helloWorld.helloWorld();
		media.mostraMedia();
		concatena.mostraConcatenacao();

	}

}
