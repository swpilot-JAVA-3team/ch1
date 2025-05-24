### 시간의 복잡도
김현수



# 시간 복잡도의 정의와 필요성
시간 복잡도는 알고리즘이 실행되는 데 걸리는 시간의 증가율을 입력 크기에 따라 수학적으로 표현한 것이다. 시간 복잡도는 성능 예측, 병목 구간 파악, 최적의 알고리즘 선택에 중요한 기준이 된다.
입력 크기가 커졌을 때 처리 시간이 기하급수적으로 증가하는 알고리즘은 대규모 데이터 처리에 부적합할 수 있으므로, 시간 복잡도를 줄이는 것이 중요하다.



# Big O 표기법의 개념과 상황별 예시
Big O 표기법 - 알고리즘의 최악 시간 복잡도

O(1)	    상수 시간		배열의 특정 인덱스 접근
O(log n)	로그 시간		이진 탐색
O(n)	 	선형 시간		배열 전체 순회
O(n²)		이중 루프 탐색	삽입 정렬, 선택 정렬, 버블 정렬
O(2^n)		지수 시간		재귀적 피보나치 계산


# 문제01 코드의 시간 복잡도 분석

for (int num1 : numbers) {
	int count = 0;
    for (int num2 : numbers) {
		if (num1 == num2) count++;
    }
    if (count == 1) {
    	System.out.println(num1);
        return;
    }
}

시간 복잡도 : O(n²)


# 문제02 코드의 시간 복잡도 분석

for (char ch : input.toCharArray()) {
	push(ch);
}

시간 복잡도 : O(n)


while (!isEmpty()) {
	reversed[idx] = pop();
	idx++;
}

시간 복잡도 : O(n)



# 병목 현상 분석 및 최적화 방안
[병목 현상 분석] 문제01의 이중 for문이 병목 현상의 원인이 될 수 있음.

[최적화 방안]
개선 전:
for (int num1 : numbers) {
	int count = 0;
    for (int num2 : numbers) {
		if (num1 == num2) count++;
    }
    if (count == 1) {
    	System.out.println(num1);
        return;
    }
}
-시간 복잡도 : O(n²)

개선 후 (HashMap 사용):
Map<Integer, Integer> countMap = new HashMap<>();
for (int num : numbers) {
	countMap.put(num, countMap.getOrDefault(num, 0) + 1);
}
for (int num : numbers) {
	if (countMap.get(num) == 1) {
		System.out.println(num);
		return;
	}
}
-시간 복잡도 : O(n)
