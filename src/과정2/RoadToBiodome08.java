package 과정2;

public class RoadToBiodome08 {
	
	static int MAX = 100;
	static int Queue[] = new int[MAX];
	static int front = 0; static int rear = 0;
	
	public static void main(String[] args)
	{
		for(int i=0;i<args.length;i++)
		{
			int value = Integer.parseInt(args[i]);
			enqueue(value);
		}
		System.out.println("모든 요청이 처리되었습니다.");
	}
	
	public static void enqueue(int n)
	{
		if(rear>MAX)
		{
			System.out.println("Queue is full");
		}
		Queue[rear++] = n;
		System.out.printf("자원 %d를 제공했습니다.\n",n);
	}
	public static int isEmpty()
	{
		if(front==rear)
		{
			return 1;
		}
		return 0;
	}
	
	public static int dequeue()
	{
		if(isEmpty()==1)
		{
			System.out.println("Queue is empty");
		}
		return Queue[front++];
	}
	
	public static void peak()
	{
		System.out.println(Queue[front]);
	}
}
