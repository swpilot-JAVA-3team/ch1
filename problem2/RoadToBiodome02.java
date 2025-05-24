package no02;

import java.util.ArrayList;
import java.util.List;

public class RoadToBiodome02 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("입력된 메시지가 올바르지 않습니다. 다시 한번 확인해주세요.");
            return;
        }

        StringBuilder inputBuilder = new StringBuilder();
        for (String arg : args) {
            inputBuilder.append(arg).append(" ");
        }

        String input = inputBuilder.toString().trim();

        if (input.trim().isEmpty()) {
            System.out.println("올바른 문장을 입력해주세요.");
            return;
        }

        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            stack.add(input.charAt(i));
        }

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.print(stack.get(i));
        }

        System.out.println(); 
    }
}
