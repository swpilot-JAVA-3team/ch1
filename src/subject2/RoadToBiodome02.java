package subject2;

public class RoadToBiodome02 {

	static char[] stack;
    static int top;

    public static void main(String[] args) {
        String input = String.join(" ", args);

        if (input.trim().isEmpty()) {
            System.out.println("올바른 문장을 입력해주세요.");
            return;
        }

        int n = input.length();
        stack = new char[n];
        top = -1;

        for (char ch : input.toCharArray()) {
            push(ch);
        }

        char[] reversed = new char[n];
        int idx = 0;
        while (!isEmpty()) {
            reversed[idx] = pop();
            idx++;
        }

        System.out.println(reversed);
    }

    public static void push(char ch) {
    	top++;
        stack[top] = ch;
    }

    public static char pop() {
        if (isEmpty()) {
        	System.out.print("스택이 비어있습니다.");
            System.exit(1);
        }
        char t = stack[top];
        top--;
        return t;
    }

    public static int peek() {
        if (isEmpty()) {
        	System.out.print("스택이 비어있습니다.");
            System.exit(1);
        }
        return stack[top];
    }

    public static boolean isEmpty() {
        return top == -1;
    }
}