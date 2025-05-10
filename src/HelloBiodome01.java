public class HelloBiodome01 {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("인자를 입력해주시길 바랍니다.");
            System.exit(1);
        }

        String name = args[0];


        System.out.println("\"" + name + "\"" + "님 swpilot-java-3team에 오신걸 환합니다.");
    }
}
