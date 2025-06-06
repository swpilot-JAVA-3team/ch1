package 과정2;

public class RoadToBiodome09 {
	public static class offsets{
		int x;
		int y;
	}
	
	public static void main(String[] args)
	{
		offsets move[] = new offsets[4];
		for (int i = 0; i < 4; i++) {
            move[i] = new offsets();
        }

		move[0].x = 1; move[0].y = 0; // 동
		move[1].x = 0; move[1].y = -1; // 남
		move[2].x = -1; move[2].y = 0; // 서
		move[3].x = 0; move[3].y = 1; // 북
		
		int m = args.length;
		int n = args[0].length();
		
		boolean maze[][] = new boolean[n+2][m+2];
		
		for(int i=0;i<=m+1;i++)
		{
			for(int j=0;j<=n+1;j++)
			{
				if(i==0||j==0||i==m+1||j==m+1) // 벽두르기
				{
					maze[j][i] = false;
					continue;
				}
				
				if(args[i-1].charAt(j-1)=='1')
				{
					maze[j][i] = true; 
				}else
				{
					maze[j][i] = false;
				}
			}
		}
		
		for(int i=0;i<=m+1;i++)
		{
			for(int j=0;j<=n+1;j++)
			{
				if(maze[j][i])
				{
					System.out.print("1 ");
				}else {
					System.out.print("0 ");
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
	}
	
	
	
}
