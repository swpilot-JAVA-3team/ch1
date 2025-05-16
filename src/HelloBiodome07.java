public class HelloBiodome07 {
    public static void main(String[] args) {
        try {
            String dna = args[0];
            System.out.printf("%s", dna);
            for (int i = 1; i < args.length; i++) {
                System.out.printf(" %s", args[i]);
                dna += args[i];
            }
            System.out.printf("\n->");
            System.out.println(gene(dna));
        }
             catch(ArrayIndexOutOfBoundsException e){
                 System.out.println("->염기서열이 입력되지 않았습니다.");
                 System.exit(1);
            }
    }

    public static String gene(String dna){
        String result = "";
        if (dna.charAt(0) == 'C' | dna.charAt(0) == 'J' | dna.charAt(0) == 'H' | dna.charAt(0) == 'E' | dna.charAt(0) == 'Y'){
            result += dna.charAt(0);
        }
        else{
            System.out.println("염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다.");
            System.exit(1);
        }

        char pre = dna.charAt(0);
        int cnt = 1;

        for (int i = 1; i < dna.length(); i++){
            switch (dna.charAt(i)){
                case 'C':
                    if (pre == 'C') cnt++;
                    else{
                        result += String.format("%d", cnt);
                        cnt = 1;
                        result += 'C';
                        pre = 'C';
                    }
                    break;
                case 'Y':
                    if (pre == 'Y') cnt++;
                    else{
                        result += String.format("%d", cnt);
                        cnt = 1;
                        result += 'Y';
                        pre = 'Y';
                    }
                    break;
                case 'J':
                    if (pre == 'J') cnt++;
                    else{
                        result += String.format("%d", cnt);
                        cnt = 1;
                        result += 'J';
                        pre = 'J';
                    }
                    break;
                case 'E':
                    if (pre == 'E') cnt++;
                    else{
                        result += String.format("%d", cnt);
                        cnt = 1;
                        result += 'E';
                        pre = 'E';
                    }
                    break;
                case 'H':
                    if (pre == 'H') cnt++;
                    else{
                        result += String.format("%d", cnt);
                        cnt = 1;
                        result += 'H';
                        pre = 'H';
                    }
                    break;
                default:
                    System.out.println("염기서열은 C, J, H, E, Y 다섯가지로만 입력됩니다.");
                    System.exit(1);
            }
        }
        result += String.format("%d", cnt);
        return result;
    }
}
