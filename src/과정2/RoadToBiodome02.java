package 과정2;

public class RoadToBiodome02 {
	static int MAX_STACK_SIZE = 10000000;
	static char stack[] = new char[MAX_STACK_SIZE];
	static int top = -1;
	
	public static char peek()
	{
		if(top>MAX_STACK_SIZE-1|| top<0)
		{
			return '!';
		}else {
			return stack[top];
		}
	}
	
	public static int isEmpty()
	{
		if(top < 0)
		{
			return 1;
		}else {
			return 0;
		}
	}
	
	
	public static void push(char x)
	{
		if(top > MAX_STACK_SIZE)
		{
			System.out.println("Stack is full");
			System.exit(1);
		}
		stack[++top] = x;
	}
	
	public static char pop()
	{
		if(isEmpty()==1)
		{
			return '!';
		}
		return stack[top--];
	}
	
	
	public static void main(String[] args)
	{
		try {
			String test = args[0];
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한번 확인해주세요.");
			System.exit(1);
		}
		int length = args.length;
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<args[i].length();j++)
			{
				push(args[i].charAt(j));
			}
			push(' ');
		}
		pop(); // 마지막 빈칸 제거
		char x;
		while((x=pop())!='!')
		{
			System.out.print(x);
		}
		
	}
	
	
	
}
