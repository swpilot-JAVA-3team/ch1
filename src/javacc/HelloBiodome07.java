package javacc;

public class HelloBiodome07 {

	public static void main(String[] args) {
		if (args.length == 0 || args[0].trim().isEmpty()) {
            System.out.println("염기서열이 입력되지 않았습니다.");
            System.exit(1);
        }

        //String input = args[0].toUpperCase();
		//input = String.join(args[0], args[1]);
		//input = input.replace(" ", "");
        String input = String.join("", args).toUpperCase();

        if (input.isEmpty()) {
            System.out.println("염기서열이 입력되지 않았습니다.");
            System.exit(1);
        }

        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != 'C' && c != 'Y' && c != 'J' && c != 'E' && c != 'H') {
                System.out.println("염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다. 확인하고 다시 입력해주세요");
                System.exit(1);
            }
        }
        
        String result = compress(input);
        System.out.println(result);
    }
	
	
	public static String compress(String input) {
	    String result = "";

	    char alphabet = input.charAt(0);
	    int count = 1;

	    for (int i = 1; i < input.length(); i++) {
	        char next = input.charAt(i);
	        if (next == alphabet) {
	            count++;
	        } else {
	            result += alphabet + String.valueOf(count);
	            alphabet = next;
	            count = 1;
	        }
	    }

	    result += alphabet + String.valueOf(count);
	    return result;    
	}
}