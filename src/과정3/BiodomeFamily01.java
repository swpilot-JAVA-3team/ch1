package 과정3;

public class BiodomeFamily01 {
	public static void main(String[] args)
	{
		LifeNest Life = new LifeNest();
		Organism x1 = new Organism("펭귄","동물","남극");
		Organism x2 = new Organism("코알라","동물","호주");
		Organism x3 = new Organism("선인장","식물","사막");
		Organism x4 = new Organism("페퍼민트","식물","정원");
		
		Life.add(x1);
		Life.add(x2);
		Life.add(x3);
		Life.add(x4);
		
		Life.print_all();
		
		Life.delete("코알라");
		Life.delete("선인장");
		
		Life.print_all();
	}
}
