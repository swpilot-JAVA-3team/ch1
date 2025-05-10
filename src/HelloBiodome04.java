
public class HelloBiodome04 {
	
	private static final double P = 3.14;
	private static final double u = 0.415;
	static double t, humid, oxygen, id;
	
	public static boolean isSafe() {
		
		if (t < 10 || t> 27.5) {
			id = 0;
			return false;}
		if(40>=humid || humid>=60) {
			id = 1;
			return false;}
		if(19.5 > oxygen || oxygen >23.5 ) {
			id = 2;
			return false;}
		
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		if (args.length < 3) {
			System.out.println("enter again");
		}
		
		for (String tmp: args){
			int dotcnt = 0;
			
			for(int i = 0; i< tmp.length(); i++){
				char a = tmp.charAt(i);
				
				/*. check input is float*/
				if(a == '.') {
					dotcnt += 1;
					if (dotcnt > 1) {
						System.out.println("invalid type input");
						return ;
					}
					continue;
				}
				
				/*check char is number*/
				if(!Character.isDigit(a)) {
					System.out.println("invalid type input");
					return;
				}
				
			}
			
		}
		
		/*변수에 값넣기 */
		t = Double.parseDouble(args[0]); 
		humid = Double.parseDouble(args[1]); 
		oxygen = Double.parseDouble(args[2]);
		
		/*함수 써서 안정된 상태인지 체크*/
		
		if(!(isSafe())) /*not safe state*/
		{
			if(id ==0)
				System.out.println("temperature is not safe");
			else if(id == 1)
				System.out.println("humidity is not safe");
			else 
				System.out.println("Oxygen degree is not safe");
		}
		
		
		else {/*safe*/
			System.out.println("Tree of life is safe");
		}

	}
}
