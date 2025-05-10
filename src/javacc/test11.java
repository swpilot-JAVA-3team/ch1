package javacc;


public class test11 {

	public static void main(String[] args) {
		if (args.length < 1)
		{
			System.out.println("재입력");
			System.exit(1);
		}
		
		String name = args[0];
		System.out.println("스프링와트에 오신 것을 환영합니다. " + name + "님!");
	}

}
