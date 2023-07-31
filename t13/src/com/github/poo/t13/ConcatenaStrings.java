package com.github.poo.t13;

public class ConcatenaStrings {

	private String s1;
	private String s2;
	private String concatenado;

	public ConcatenaStrings(String s1, String s2) {
		this.s1 = s1;
		this.s2 = s2;
		this.concatenado = s1 + s2;
	}

	public void mostraConcatenacao() {
		System.out.println("String concatenada: " + this.concatenado);
	}

	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public String getConcatenado() {
		return concatenado;
	}

	public void setConcatenado(String concatenado) {
		this.concatenado = concatenado;
	}

}
