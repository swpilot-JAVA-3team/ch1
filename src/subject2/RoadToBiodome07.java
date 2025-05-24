package subject2;
import java.util.HashMap;

public class RoadToBiodome07 {

	public static void main(String[] args) {
		String input = String.join(" ", args);
		
		String[] arr = input.replace("[", "").replace("]", "").replace("\"", "").split(",");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].trim();  // 공백 제거
            
            // 숫자 포함 여부 검사
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isDigit(arr[i].charAt(j))) {
                    System.out.println("입력에 숫자가 포함되어 있습니다: " + arr[i]);
                    return;
                }
            }
        }
		
        // 빈도 저장용 해시맵
        HashMap<String, Integer> map = new HashMap<>();
        for (String animal : arr) {
            map.put(animal, map.getOrDefault(animal, 0) + 1);
        }

        // 고유 동물 이름 배열
        String[] animals = new String[map.size()];
        int idx = 0;
        for (String key : map.keySet()) {
            animals[idx++] = key;
        }

        // 선택 정렬 (빈도 내림차순, 같으면 가나다순)
        selectionSort(animals, map);
        

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]);
            if (i != animals.length - 1) System.out.print(", ");
        }
    }
	
	// 선택 정렬
	public static void selectionSort(String[] animals, HashMap<String, Integer> map) {
	    for (int i = 0; i < animals.length - 1; i++) {
	        int maxIndex = i;
	        for (int j = i + 1; j < animals.length; j++) {
	            int count1 = map.get(animals[j]);
	            int count2 = map.get(animals[maxIndex]);
	            if (count1 > count2 || (count1 == count2 && animals[j].compareTo(animals[maxIndex]) < 0)) {    // 빈도는 같지만 이름이 더 앞서면
	                maxIndex = j;
	            }
	        }
	        String temp = animals[i];
	        animals[i] = animals[maxIndex];
	        animals[maxIndex] = temp;
	    }
	}
}
