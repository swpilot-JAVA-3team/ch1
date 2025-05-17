package Problem1;

public class HelloBiodome01 {
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("enter your name again");
		}
		
		else
		{
			System.out.print("welcome ");
			for(String name : args) {
			System.out.print(name +" ");
			}

		}
		
	}
}
