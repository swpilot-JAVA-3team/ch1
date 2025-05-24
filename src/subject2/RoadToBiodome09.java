package subject2;
import java.util.Queue;
import java.util.LinkedList;

public class RoadToBiodome09 {
	public static void main(String[] args) {
		if (args.length <= 1) {
            System.out.println("2차원 배열이어야 합니다.");
            return;
        }
		
		int N = args.length;
        int M = args[0].length();
        int[][] map = new int[N][M];
		
		for (int i = 0; i < N; i++) {
	        if (args[i].length() != M) {
	            System.out.println("입력된 행의 길이가 일치하지 않습니다.");
	            return;
	        }

	        for (int j = 0; j < M; j++) {
	            char c = args[i].charAt(j);
	            if (c == '0') {
	                map[i][j] = 0;
	            } else if (c == '1') {
	                map[i][j] = 1;
	            } else {
	                System.out.println("입력값은 0 또는 1이어야 합니다 : " + c);
	                return;
	            }
	        }
	    }
		

		System.out.println("(2차원 배열 출력)");
		for (int i = 0; i<args.length; i++) {
			for (int j = 0; j<args[i].length(); j++) {
				System.out.print(args[i].charAt(j) + " ");
			}
			System.out.println();
		}
		
		
		System.out.println();
		int result = BFS(map);
        System.out.println("→ " + result);
	}
	
	private static int BFS(int[][] map) {
		int[] start = {0, 0};
		int[] end = {map.length - 1, map[0].length - 1};
		int[][] vectors = {{1,0}, {-1,0}, {0,1}, {0,-1}};  // 방향 벡터
		Queue<int[]> queue = new LinkedList<>();
		
		map[start[0]][start[1]] = 1;  // 방문 표시 및 거리 초기화
        queue.offer(start);  // 삽입할 값
        
        while(!queue.isEmpty()){
            int[] cur = queue.poll();  // 반환 값
            int x = cur[0];
            int y = cur[1];

            for(int[] vector : vectors){
                int nx = x + vector[0];
                int ny = y + vector[1];
                //map의 범위를 벗어나는 경우
                if(nx < 0 || nx >= map.length || ny < 0 || ny >= map[0].length){
                    continue;
                }
                // (벽) or 이미 방문한 곳
                if(map[nx][ny] != 1){
                    continue;
                }
                map[nx][ny] = map[x][y] + 1;
                //갈 수 있는 경우, 해당 위치 좌표를 다시 queue에 넣음
                queue.offer(new int[]{nx, ny});   // 삽입할 값
            }
	    
        }
        
        if (map[end[0]][end[1]] == 1) return -1; // 경로를 찾지 못하면 -1 반환
        
        return map[end[0]][end[1]] - 1;
	}
}