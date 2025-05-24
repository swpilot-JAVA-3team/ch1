package ch2;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome04 {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < args.length; i++){
            input.add(Integer.parseInt(args[i]));
        }
        System.out.println(input);
        List<Integer> sorted = selectSort(input);

        Double avg = 0.0;
        for (int i : sorted)
            avg += i;
        avg = avg / sorted.size();

        Double middle = 0.0;

        if (sorted.size() % 2 == 0){

            middle = (double) (sorted.get(sorted.size() / 2) + sorted.get(sorted.size() / 2 - 1));
            middle = middle / 2;
            System.out.println("-> 평균값 : " + avg + ", 중앙값 : " + middle);
        }
        else{
            middle = (double) sorted.get(sorted.size() / 2);
            System.out.println("-> 평균값 : " + avg + ", 중앙값 : " + middle);
        }
    }

    public static List<Integer> selectSort(List<Integer> input){
        for (int i = 0; i < input.size() - 1; i++){
            int minidx = i;
            for (int j = i + 1; j < input.size(); j++){
                if (input.get(j) < input.get(minidx)){
                    minidx = j;
                }
            }
            int temp = input.get(i);
            input.set(i, input.get(minidx));
            input.set(minidx, temp);
        }

        return input;
    }
}