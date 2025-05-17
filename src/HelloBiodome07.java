
public class HelloBiodome07 {
	
	public static String codeDNA(String input)
	{	
		input = input.toUpperCase();
		
		String result = "";
		char current  = input.charAt(0);
		int cnt = 1;
		
		for(int i = 0; i< input.length(); i++)
		{
			char c = input.charAt(i);
			if(c != 'C' && c != 'Y' && c != 'J' && c != 'E' && c != 'H')
			{
				System.out.println("DNA consists of C,J,H,E,Y. Check your DNA again.");
				System.exit(0);
			}
			
			if(i+1== input.length()) continue;
			
			if(c == input.charAt(i+1))
			{
				cnt++;
			}
			else {
				result += current + Integer.toString(cnt);
				current = input.charAt(i+1);
				cnt = 1;
			}
		}
		
		result += current + Integer.toString(cnt);
		
		return result;
	}
	
	public static void main(String[] args) {
		
		if (args.length < 1) {
			System.out.println("please, Write DNA-code");
		}
		
		String input = "";
		if(args.length>1) {
			
			for(int i = 0; i<args.length; i++)
			{
				input += args[i];
			}
		}
		
		
		String result = codeDNA(input);
		System.out.println(result);
		
	}
}
