package com.github.poo.t13;

public class HelloWorld {

	private String helloWorld;

	public HelloWorld() {
		this.helloWorld = "Hello World!";
	}

	public void helloWorld() {
		System.out.println(this.helloWorld);
	}

	public String getHelloWorld() {
		return helloWorld;
	}

	public void setHelloWorld(String helloWorld) {
		this.helloWorld = helloWorld;
	}

}
