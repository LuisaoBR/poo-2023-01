package festa;

public class Danca {
	
	private Musica musica;
	private String tipo;
	private String horaInicio;
	private String horaFim;
	
	public Danca(Musica musica,String tipo,String horaInicio,String horaFim) {
		this.musica = musica;
		this.tipo = tipo;
		this.horaFim = horaFim;
		this.horaInicio = horaInicio;
	}

	public Musica getMusica() {
		return musica;
	}

	public void setMusica(Musica musica) {
		this.musica = musica;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	@Override
	public String toString() {
		return "Danca [musica=" + musica + ", tipo=" + tipo + ", horaInicio=" + horaInicio + ", horaFim=" + horaFim
				+ "]";
	}
	
	
	
	

}
