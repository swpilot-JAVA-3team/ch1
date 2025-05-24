문제 1 시간 복잡도
for(int i  = 0; i<input.size();i++)
		{
			int x = input.get(i);
			if(result.contains(x)) { //num exist already
				int x_index = result.indexOf(x);
				countlist.set(x_index, countlist.get(x_index)+1);
			}
			else{				 	//num doesn't exist
				result.add(x);
				countlist.add(0);
			}
		}
			
		//print
		for(int i = 0; i<result.size(); i++) {
			if(countlist.get(i)==0) {
				System.out.print(result.get(i)+ " ");
			}
		}
		
문제 1에서 시간복잡도를 좌우하는 코드 부분은 리스트를 한번 순회하면서 각 숫자가 몇번 등장하는지 세는 for문이다. 이 부분의 시간 복잡도는 O(n)이다. 


문제 2 시간 복잡도
for(String input : args) {
			for(int i = 0; i<input.length();i++) {
				charStack.add(input.charAt(i));
			}
			charStack.add(' ');
		}
		
		charStack.remove(charStack.size()-1);
		while(!charStack.isEmpty()) {
			Character lastc = charStack.remove(charStack.size()-1);
			System.out.print(lastc);
		}
		
문제 2에서 시간 복잡도를 좌우하는 코드 부분은 스택에 값들을 하나씩 차곡차곡 넣고 다시 한번더 스택의 크기 만큼 순회하며 하나씩 pop하는 반복문 부분이다. 시간 복잡도는 O(n)에 가깝다. 