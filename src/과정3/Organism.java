package 과정3;

public class Organism {
	String name;
	String species; 
	String habitat;
	
	public Organism(String name, String species, String habitat)
	{
		this.name = name;
		this.habitat = habitat;
		this.species = species;
	}
	
	void displayInfo()
	{
		System.out.print(name + species + habitat);
	}
}
