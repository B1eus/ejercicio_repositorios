package ejemplo_clase_viernes;

public class Villano extends Persona {
		
	String Villan_name;
	String powers[];
	String franquicia;
	public Villano(String name,int edad,String franquicia) {
			super(name,edad, null);
		
	}
		
	public void mostrar_poderes() {
		for (int i = 0;i<powers.length;i++) {
			System.out.println(powers[i]);
		}	
	

	}
	}
