package ejemplo_clase_viernes;

public class SuperHero extends Persona{
	String heroname;
	String powers[];
	String franquicia;
	//constructor 
	public SuperHero(String name,int edad,String franquicia) {
		super(name,edad, null);
		
	}
	public void mostrar_poderes() {
		for (int i = 0;i<powers.length;i++) {
			System.out.println(powers[i]);
		}
			
	}

}
