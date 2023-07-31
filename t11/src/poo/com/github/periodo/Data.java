package poo.com.github.periodo;

public class Data {

	private int dia;
	private int mes;
	private int ano;
	private boolean ehFinal; // TRUE = Data Final e FALSE = Data Inicial

	Data(int dia, int mes, int ano, boolean ehFinal) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.ehFinal = ehFinal;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean isEhFinal() {
		return ehFinal;
	}

	public void setEhFinal(boolean ehFinal) {
		this.ehFinal = ehFinal;
	}

}
