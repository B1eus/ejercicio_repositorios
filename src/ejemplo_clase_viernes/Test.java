package ejemplo_clase_viernes;

public class Test {

	public static void main(String[] args) {
		Persona tony_stark = new Persona ("Tony Stark", 35,"new york"); 
		tony_stark.setEdad(35);
		System.out.println("persona:  "+tony_stark.name+"  "+tony_stark.edad+"  "+tony_stark.city);
		
		
		SuperHero iron_man = new SuperHero(tony_stark.name, tony_stark.edad,null);
				iron_man.heroname="Iron man";
		iron_man.powers = new String[] {"*volar","*pelear"};
		iron_man.city = "orlando";
		iron_man.franquicia = "Marvel";
		
		System.out.println("super heroe :" +"  "+iron_man.heroname+iron_man.city+"  "+iron_man.franquicia);
		iron_man.mostrar_poderes();
		//villano
		Persona Arthur_Fleck = new Persona ("Arthur Fleck", 35,"Gothan"); 
		Arthur_Fleck.setEdad(35);
		System.out.println("persona:  "+Arthur_Fleck.name+"  "+Arthur_Fleck.edad+"  "+Arthur_Fleck.city);
		
		
		Villano joker = new Villano(Arthur_Fleck.name, Arthur_Fleck.edad,null);
				joker.Villan_name="joker";
		joker.powers = new String[] {"*pelear"};
		joker.city = "Gothan";
		joker.franquicia = "Dc";
		
		System.out.println("super villano :"+"  "+joker.Villan_name+joker.city+"  "+joker.franquicia);
		joker.mostrar_poderes();
	}

}
