package subject2;

public class RoadToBiodome01 {
	public static void main(String[] args) {
		if (args.length == 0) {
            System.out.println("입력된 값이 없습니다.");
            return;
        }
		
		int[] numbers = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            String value = args[i];

            if (i == 0) {
                value = value.replace("[", "");
            }
            if (i == args.length - 1) {
                value = value.replace("]", "");
            }

            value = value.replace(",", "");

            try {
                numbers[i] = Integer.parseInt(value);
                if (numbers[i] < 0 || numbers[i] > 1000) {
                    System.out.println("입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    return;
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자가 아닌 값이 포함되어 있습니다: " + value);
                return;
            }
        }
        
        
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
        System.out.println("한 번만 등장하는 숫자가 없습니다.");
	}
}