
public class Emprego {
	
	private double salario;
	private String inicio;
	private String fim;
	private Empresa empresa;
	private PessoaEmpregado pessoa;
	
	public Emprego(double salario,String inicio,String fim,Empresa empresa,PessoaEmpregado pessoa) {
		this.salario = salario;
		this.inicio = inicio;
		this.fim = fim;
		this.empresa = empresa;
		this.pessoa = pessoa;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getInicio() {
		return inicio;
	}

	public void setInicio(String inicio) {
		this.inicio = inicio;
	}

	public String getFim() {
		return fim;
	}

	public void setFim(String fim) {
		this.fim = fim;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public PessoaEmpregado getPessoa() {
		return pessoa;
	}

	public void setPessoa(PessoaEmpregado pessoa) {
		this.pessoa = pessoa;
	}
	
	

}
