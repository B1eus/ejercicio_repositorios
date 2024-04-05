package ejemplo_clase_viernes;

public class Persona {
	String name;
	int edad;
	String city;
	//get set
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//constructor
	public Persona(String name, int edad,String city) {
		this.name = name;
		this.edad = 18;
		this.city=city;

}
}