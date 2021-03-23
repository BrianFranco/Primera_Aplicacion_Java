package entidades;

public class Principal {
	
	
	
	public static void main(String[] args) {

		System.out.println("Probando clase fecha.");
		
		Fecha f=new Fecha(26,3,21,10,10,10);
		
		System.out.println(f.toString());
		
		System.out.println("Probando array de 2 Calendarios.");
		System.out.println("Calendario hereda de Fecha y Fecha hereda de Hora.");
		System.out.println("En Java no se permite herencia multiple.");
		System.out.println("Es decir: class Calendario extends Fecha,Hora (no se puede)");
		
		Calendario [] aC = new Calendario[2];
		aC[0]=new Calendario();
		aC[1]=new Calendario("Turno con medico",f);
		
		 
	    for (Calendario calendario : aC) {
			System.out.println(calendario.toString());
		}
		
	    
	    System.out.println("Implementar polimorfismo con clase abstracta y metodo.");
	    
	    Hora [] aH = new Hora[2];
	    
	    aH[0]=new Fecha(26,8,21);
	    aH[1]=new Calendario("Mi cumpleaños",aH[0].DevolverFecha());
	    
	    for (Hora hora : aH) {
			System.out.println(hora.toString());
		}
	    
	}
}
