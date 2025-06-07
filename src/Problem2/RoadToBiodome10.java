package Problem2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RoadToBiodome10 {
	
	static ArrayList<Integer> visited = new ArrayList<>();
	
	static int[][] inputToArray2(String[] input){
		//ArrayList<Integer>[] result = new ArrayList[input.length];
		//List<Integer> Total_plant_list = new ArrayList<>(); 
		int[][] result = new int[50][10];
		for (int i = 0; i < 50; i++) {
		    for (int j = 0; j < 10; j++) {
		        result[i][j] = -1;
		    }
		}
		
		String[] tmp;
		for(int i = 0; i<input.length; i++) {
			 tmp = input[i].split(",");
			 int a = Integer.parseInt(tmp[0]);
			 int b = Integer.parseInt(tmp[1]);
			 
			 if(result[0][0]==-1) { //젤 처음 값 들어올때
				 result[0][0] = a; result[0][1] = b;
				 result[1][0] = b; result[1][1] = a;
				 continue;
			 }
			 
			 for(int j = 0; j<50; j++) { //a 첫번째 수가 2차원 배열에 이미 잇는지 체크
				 if(result[j][0]==-1) { //없음
					 result[j][0] = a; result[j][1] = b;	 
					 break;
				 }
				 else if(result[j][0]==a) { //원래 존재
					 for(int x = 0; x<10; x++)
						 if(result[j][x]==-1) {
							 result[j][x] = b;
							 break;
						 }
				 }
			 }
			 for(int j = 0; j<50; j++) { //b에 대해서 똑같이
				 if(result[j][0]==-1) { //없음
					 result[j][0] = b; result[j][1] = a;	 
					 break;
				 }
				 else if(result[j][0]==b) { //원래 존재
					 for(int x = 0; x<10; x++)
						 if(result[j][x]==-1) {
							 result[j][x] = a;
							 break;
						 }
				 }
			 }
			 
		}
		
		return result;
	}
	static int find(int[][] matrix, int cur) {
		for(int i = 0; i<50; i++) {
			if(matrix[i][0]==cur)return i;
		}
		return -1;
	}
	
	static void DFS(int[][] matrix, int cur) {
			if(visited.contains(cur)) return;
			visited.add(cur);
			int idx = find(matrix,cur);
			if(idx==-1) return;
			
			for(int i=0; i<10; i++) {
				int x = matrix[idx][i];
				if(!visited.contains(x))
					DFS(matrix,x);
			}
	}
	
	public static void main(String[] args) {
		if(args.length<1) {
			System.out.println("input error");
			System.exit(1);
		}
		
		int[][] matrix = inputToArray2(args);
		
		int groupCnt =0;
		for(int i = 0 ; i<50;i++) {
			
			if(!visited.contains(matrix[i][0])) {
				DFS(matrix,matrix[i][0]);
				groupCnt++;
			}
			if(i ==-1) break;
			
		}
		System.out.println(groupCnt);
	}
}
