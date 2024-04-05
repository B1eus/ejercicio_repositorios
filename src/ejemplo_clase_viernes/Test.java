package ejemplo_clase_viernes;

public class Test {

	public static void main(String[] args) {
		Persona tony_stark = new Persona ("Tony Stark", 35,"new york"); 
		tony_stark.setEdad(35);
		System.out.println(tony_stark.name+": "+tony_stark.edad+tony_stark.city);
		System.out.println(tony_stark.name+": "+tony_stark.edad+tony_stark.city);
		
		
		SuperHero iron_man = new SuperHero(tony_stark.name, tony_stark.edad);
				iron_man.heroname="Iron man";
		iron_man.powers = new String[] {"volar","pelear"};
		iron_man.city = "orlando";
	
	
	}

}
