package Problem1;

public class HelloBiodome02 {
	public static void main(String[] args) {
		
		if (args.length < 3) {
			System.out.println("enter again");
		}
		
		else
		{	
			/*숫자인지 확인*/
			for (String tmp: args){
				
				
				for(int i = 0; i< tmp.length(); i++){
					if(!Character.isDigit(tmp.charAt(i))) {
						System.out.println("invalid type input");
						return;
					}
				}

			}
			int solar, wind, earth;
			
			solar = Integer.parseInt(args[0]); 
			wind = Integer.parseInt(args[1]); 
			earth = Integer.parseInt(args[2]); 
			
			int sum = solar + wind + earth;
			
			if(sum > 30000) {
				sum = 30000;
			}
			System.out.println("total energy:" + sum);
		}
	}
}
