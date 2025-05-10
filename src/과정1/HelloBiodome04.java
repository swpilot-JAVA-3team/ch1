package 과정1;

public class HelloBiodome04 {
	
	// 안정범위 확인 함수
	public static boolean check(int condition, double value)
	{
		// condition 1: temperature 2: moisture 3: oxygen
		
		// temp 확인
		if(condition==1)
		{
			if(value>=10&&value<27.5)
				return true;
			else
				return false;
		}
		
		// moi 확인
		if(condition==2)
		{
			if(value>40&&value<60)
				return true;
			else
				return false;
		}
		
		// oxy 확인
		if(condition==3)
		{
			if(value>=19.5&&value<=23.5)
				return true;
			else
				return false;
		}
		// 실수 발생
		else
			return false;
	}
	
	// 메인함수
	public static void main(String[] args)	
	{
		try
		{
			double tem = Double.parseDouble(args[0]); // 온도
			double moi = Double.parseDouble(args[1]); // 습도
			double oxy = Double.parseDouble(args[2]); // 산소

			
			if(!check(1,tem))
			{
				System.out.println("→ 온도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
				System.exit(0);
			}
			
			if(!check(2,moi))
			{
				System.out.println("→ 습도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
				System.exit(0);
			}
			
			if(!check(3,oxy))
			{
				System.out.println("→ 산소농도값이 정상 범위를 벗어났습니다. 확인이 필요합니다.");
				System.exit(0);
			}
			
			// 다 정상범위 일시
			System.out.println("-> 생명의 나무는 안정적인 상태입니다 :)");
			
		}catch(NumberFormatException e)
		{
			System.out.println("-> 입력된 값이 올바르지 않습니다.\n"+ "[온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
			System.exit(1);
		}
		
	}
	
	
}
