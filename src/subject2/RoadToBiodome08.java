package subject2;

public class RoadToBiodome08 {

	static int MAX_SIZE = 100;
    static int[] queue = new int[MAX_SIZE];
    static int front = 0;
    static int rear = 0;

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("오류: 자원 요청 입력이 없습니다.");
            return;
        }

        try {
            for (String arg : args) {
                int value = Integer.parseInt(arg);
                enqueue(value);
            }

            while (!isEmpty()) {
                int resource = dequeue();
                System.out.println("자원 " + resource + "을 제공했습니다.");
            }

            System.out.println("모든 요청이 처리되었습니다.");

        } catch (NumberFormatException e) {
            System.out.println("숫자가 아닌 값이 포함되어 있습니다.");
        } 
    }


    static void enqueue(int value) {
        if (rear >= MAX_SIZE) {
        	System.out.print("큐가 가득찼습니다.");
            System.exit(1);
        }
        queue[rear++] = value;
    }


    static int dequeue() {
        if (isEmpty()) {
            System.out.print("큐가 비었습니다.");
            System.exit(1);
        }
        return queue[front++];
    }


    static int peek() {
        if (isEmpty()) {
        	System.out.print("큐가 비었습니다.");
            System.exit(1);
        }
        return queue[front];
    }


    static boolean isEmpty() {
        return front == rear;
    }
}