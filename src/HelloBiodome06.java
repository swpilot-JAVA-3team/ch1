
public class HelloBiodome06 {
	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("please enter two DNAcode");
			return;
		}
		
		
		int i = 0;
		while(i<20)
		{
			if(args[0].charAt(i) != args[1].charAt(i))
			{
				System.out.println("DNA is not identical");
				return ;
			}
			i++;
		}
		
		System.out.println("identical DNA");
		return ;
		
	}
}
