package Problem1;

public class HelloBiodome05 {
	
	public static boolean Caculate(int g, int h)
	{
		int x = g&1>>g<<2|h+g^h;
		if(x != 1) return false;
		
		x = g%2<<h>>g|1&0^0;
		if(x != 2) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		for(int h = 0; h<16; h++)
		{
			for(int g = 0; g < 16; g++)
			{
				if(Caculate(g,h)) {
					int result = (h*h+g)*(h<<h) + (g<<g);
					System.out.println("result : " + result);
					return; 
				}
			}
		}
		System.out.println("It couldn't find result");
	}
}
