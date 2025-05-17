package 과정1;

public class HelloBiodome09 {
	public static void main(String[] args)
	{ 
		int n = 0;
		try {
			n = Integer.parseInt(args[0]);
			
		}catch(NumberFormatException e) {
			System.out.println("잘못된 입력입니다. 3~100 사이 숫자를 입력하세요");
			System.exit(1);
		}
		// 특수 문자가 있는 경우
		if(args.length>1) { 
			String x = args[1];
			
			for (int i=0;i<n;i++) // 총 줄수
			{
				for(int j=0;j<n-i;j++) // 빈칸 개수
				{
					System.out.print(" ");
				}
				for(int k=0;k<i;k++) { // 왼쪽 별 출력
					System.out.print("*");
				}
				System.out.print(x); // 특수 기호 출력
				for(int k=0;k<i;k++) { // 오른쪽 별 출력
					System.out.print("*");
				}
				System.out.println();
			}
		}else { //특수기호가 없는경우
			for (int i=0;i<n;i++) // 총 줄수
			{
				for(int j=0;j<n-i;j++) // 빈칸 개수
				{
					System.out.print(" ");
				}
				for(int k=0;k<i;k++) { // 왼쪽 별 출력
					System.out.print("*");
				}
				System.out.print("*"); // 중앙 별 출력
				for(int k=0;k<i;k++) { // 오른쪽 별 출력
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
		
	}	
		
}

