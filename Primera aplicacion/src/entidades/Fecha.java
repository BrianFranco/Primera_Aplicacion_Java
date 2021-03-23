package entidades;

public class Fecha extends Hora {
	
	//Attributes
	
	private int dia;
	private int mes;
	private int anio;
	
	//Contractors
	
	public Fecha(){
		super();
		dia=mes=anio=0;
		
	}
	
	
	Fecha(int dia,int mes,int anio,int segundos,int minutos,int hora){
		super(segundos,minutos,hora);
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	Fecha(int dia,int mes,int anio){
		super();
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
	}
	
	public Fecha(Fecha f){
		super(f.getHora(),f.getMinutos(),f.getSegundos());
		this.dia=f.getDia();
		this.mes=f.getMes();
		this.anio=f.getAnio();
	}
	
	//toString
	@Override
	public String toString() {
		return "Fecha: " + dia + "/" + mes + "/" + anio+" - " + super.toString();
	}

	
	
	//Getters and Setters
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

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}


	//Abstracted
	@Override
	public Fecha DevolverFecha() {
		// TODO Auto-generated method stub
		return this;
	}



	

}
