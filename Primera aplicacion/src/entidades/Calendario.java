package entidades;

public class Calendario extends Fecha{

	//Attributes
	
	String nota;

	
	//Constructors
	public Calendario() {
		super();
		this.nota="No hay notas para esta fecha";
	}
	
	public Calendario(String nota,int dia,int mes,int anio) {
		
		super(dia,mes,anio);
		this.nota=nota;
	}
	
	public Calendario(String nota,Fecha f) {
		super(f);
		this.nota=nota;
	}
	
	//Getters and Setters
	public String getNota() {
		return nota;
	}

	public void setNota(String nota) {
		this.nota = nota;
	}

	//toString
	@Override
	public String toString() {
		return "Calendario: " + nota +" - "+ super.toString();
	}
	
	
	
}
