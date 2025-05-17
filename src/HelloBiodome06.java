
public class HelloBiodome06 {
	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("please enter two DNAcode");
			return;
		}
		
		/*toCharArray: string을 char배열로 반환*/
		char[] str1 = args[0].toCharArray();
		char[] str2 = args[1].toCharArray();
		int i = 0;
		
		if(str1.length != str2.length) {System.out.println("those are not identical"); System.exit(0);}
		
		while(i<str1.length)
		{
			if(str1[i]!= str2[i]) {
				System.out.println("Those are not identical DNA");
				System.exit(0);
			}
			i++;
		}
		
		System.out.println("identical DNA");
		System.exit(0);
		
	}
}
