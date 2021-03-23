package entidades;

public abstract class Hora {

	
	//Attributes
	private int segundos;
	private int minutos;
	private int hora;
	
	//Constructors
	
	public Hora() {
		this.segundos=0;
		this.minutos=0;
		this.hora=0;
	}
	
	public Hora(int hora,int minutos,int segundos) {
		this.segundos=segundos;
		this.minutos=minutos;
		this.hora=hora;
	}

	
	//Setters and Getters
	
	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	
	//toString
	@Override
	public String toString() {
		return "Hora: " + hora+":"+minutos+":"+segundos;
	}
		
		
	//Abstracted
	public abstract Fecha DevolverFecha();

}
