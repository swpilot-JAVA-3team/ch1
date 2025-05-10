package 과정1;

public class HelloBiodome03 {
	static double pi = 3.14;
	
	// 바빌로니아 루트 계산
	 public static double calculateRoot(double num)
	 {
        double guess = num;
        double prevGuess;
        double precision = 0.000001; // 정확도 설정
        
        double proc;
        
        do {
            prevGuess = guess;
            guess = (guess + num / guess) / 2;
            
            proc = guess-prevGuess;
            if(proc<0)
            {
            	proc = -proc;
            }
        } while (proc > precision);

        return guess;
    }
	
	 // 중간 계산
	 public static double proc(double moi_root, double temp)
	 {
		 double proc1 = moi_root - temp;
		 if(proc1<0)
			{
				proc1 = -proc1;
			}
		 return proc1;
	 }
	 
	 // 건강 지수 계산 메소드
	 public static double health(double temp, double moi, double oxy)
	{
		double bio = 0.415; // 계수
		double H; // 건강지수
		
		double moi_root = calculateRoot(moi);
		
		double proc1 = proc(moi_root,temp);
		 
		double proc2 = oxy / pi / pi;
		
		H = bio * proc1 + proc2;
		return H;
	}
 
	// 메인 함수
	public static void main(String[] args)	
	{
		try
		{
			double tem = Double.parseDouble(args[0]); // 온도
			double moi = Double.parseDouble(args[1]); // 습도
			double oxy = Double.parseDouble(args[2]); // 산소
			
			double result = health(tem,moi,oxy);
			
			System.out.println("-> 생명지수 H = "+result);			
		}catch(NumberFormatException e)
		{
			System.out.println("-> 입력된 값이 올바르지 않습니다.\n"+ "[온도][습도][산소농도] 순서 대로 숫자 값을 입력해주세요");
			System.exit(1);
		}
	}
	
}
