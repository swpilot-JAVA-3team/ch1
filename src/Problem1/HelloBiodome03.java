package Problem1;

public class HelloBiodome03 {
	
	private static final double P = 3.14;
	private static final double u = 0.415;
	static double t, humid, oxygen;
	
	public static boolean isSqrt(double num)
	{
		double a;
		num = num* num;
		a = humid - num;
		if ( -0.1 < a && a < 0.1)
		{
			return true;
		}
		else 
			return false;
	}
	
	public static double BLOsqrt(double num) {
		double aprox = 1, x;
		
		
		while(!isSqrt(aprox))
		{
			aprox = (aprox + (num/aprox))/2;
			
		}
		
		return aprox; 
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
		
		
		t = Double.parseDouble(args[0]); 
		humid = Double.parseDouble(args[1]); 
		oxygen = Double.parseDouble(args[2]);
		
		/*바빌로니아 제곱근 계산*/
		double sqrt_h = BLOsqrt(humid);
		//double sqrt_h = Math.sqrt(humid);
		
		double x  = sqrt_h - t; double H;
		
		if(x<0) x = -x;
		
		H = (u*x) + (oxygen/(P*P));
		
		System.out.println(H);
	}
}
