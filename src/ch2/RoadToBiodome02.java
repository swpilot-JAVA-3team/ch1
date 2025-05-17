package ch2;

public class RoadToBiodome02 {
    static char[] stack= new char[1000000];
    static int top = -1;

    public static void main(String[] args) {
        try{
            String str = args[0];
            str += " ";
            for (int i = 1; i < args.length; i++) {
                str += args[i];
                str += " ";
            }
            System.out.println(str);
            System.out.printf("->");

            for(int i = 0; i < str.length(); i++){
                push(str.charAt(i));
            }
            for(int i = 0; i < str.length(); i++){
                System.out.printf("%c", pop());
            }

        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("올바른 문장을 입력해주세요.");
            System.exit(1);
        }

    }

    public static void push(char c){
        top++;
        stack[top] = c;
    }

    public static char pop(){
        if (isEmpty()){
            System.out.println("stack is empty.");
            System.exit(1);
        }
        int temp = top;
        top--;
        return stack[temp];
    }

    public static boolean isEmpty(){
        if (top == -1) return true;
        else return false;
    }

    public static char peek(){
        if (isEmpty()){
            System.out.println("stack is empty.");
            System.exit(1);
        }
        return stack[top];
    }
}
