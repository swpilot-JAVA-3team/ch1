package 과정1;

public class HelloBiodome05 {
	
	public static int calcul()
	{
		int g,h;
		for (g=0;g<16;g++)
		{
			for(h=0;h<16;h++)
			{
				if((g&1>>g<<2|h+g^h)==1&&(g%2<<h>>g|1&0^0)==2)
				{
					return ((h*h+g)*(h<<h)+(g<<g));
				}
			}
		}
		return 0;
	}
	public static void main(String[] args)
	{
		int result = calcul();
		System.out.println(result);
		
	}
}
