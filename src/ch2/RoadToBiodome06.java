package ch2;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome06 {
    public static void main(String[] args) {
        try {
            String input = String.join(",", args);
            String[] tokens = input.split(",");

            List<Integer> numbers = new ArrayList<>();
            for (String token : tokens) {
                numbers.add(Integer.parseInt(token.trim()));
            }

            numbers.sort(Integer::compareTo);
            double avg = 0.0;
            for(int i : numbers) avg += i;
            avg /= numbers.size();



        } catch (Exception e) {
            System.out.println("입력이 잘못되었습니다.");
            System.exit(1);
        }
    }
}
