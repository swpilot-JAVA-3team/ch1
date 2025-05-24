package Problem2;

import java.util.*;

public class RoadToBiodome07 {
	
	public static List<String> InputToList(String[] input) { //입력값-> 리스트형변환
		for(int i = 0; i<input.length; i++) {
			input[i] = input[i].replace("[", "").replace(",", "").replace("]", "").replace("\"", "");

		}
		List<String> animalList = new ArrayList<>(Arrays.asList(input));
		return animalList;
		
	}
	
	//public static List<String> sortAnimal(List<String> animalList, List<Int>){
		
	//}
	
	public static List<String> countAnimal(List<String> animalList) {
		List<String> result = new ArrayList<>();
		List<Integer> countlist = new ArrayList<>();
		
		for(int i  = 0; i<animalList.size();i++)
		{
			String x = animalList.get(i);
			if(result.contains(x)) { //It's exist already
				int x_index = result.indexOf(x);
				countlist.set(x_index, countlist.get(x_index)+1);
			}
			else{				 	//It's doesn't exist
				result.add(x);
				countlist.add(0);
			}
		}
		return result;
	}
	
	
	
	public static void main(String[] args) {
		if (args.length == 0) {
            System.out.println("please enter animal lists");
            return;
        }

        //입력처리
        String[] input = args;
        List<String> animalList;
        animalList = InputToList(input);
        
        System.out.println(animalList);
	}
}
