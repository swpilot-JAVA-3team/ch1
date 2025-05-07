package day_0507;

import java.io.IOException;

public class HelloBiodome01 {
	public static void main(String[] args) throws IOException
	{
		if(args.length<1) {
			System.out.println("재입력 하세요!");
			System.exit(1);

		}
		
		String name = args[0];
		
		System.out.println("어서오세요 "+ name +" 님!");
		
		/* System.in
		 * 입력받기
		System.out.print("이름을 입력하십시오. :");
		
		byte buffer[] = new byte[1024];
		int byteRead = System.in.read(buffer);
		String name2 = new String(buffer,0,byteRead);
		System.out.println("어서오십시오. "+name+" 님.");
		 */
		
		
	}
}
