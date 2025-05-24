package subject2;

public class RoadToBiodome04 {

	public static void main(String[] args) {
    	if (args.length == 0) {
            System.out.println("입력된 값이 올바르지 않습니다.");
            return;
        }
    	
    	for (int i = 0; i < args.length; i++) {
            if (i == 0) {
                args[0] = args[0].replace("[", "");
            }

            if (i == args.length - 1) {
                args[i] = args[i].replace("]", "");
            }

            args[i] = args[i].replace(",", "");
    	}

        int n = args.length;
        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
        	arr[i] = Double.parseDouble(args[i]);
        }

        selectionSort(arr);

        double average = calculateAverage(arr);
        double median = calculateMedian(arr);

        System.out.println("평균값 : " + average + ", 중앙값 : " + median);
    }

    // 선택 정렬 함수
    public static void selectionSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            double temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    // 평균값 계산 함수
    public static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        return sum / arr.length;
    }

    // 중앙값 계산 함수
    public static double calculateMedian(double[] arr) {
        int n = arr.length;
        if (n % 2 == 1) {
            return arr[n / 2];
        } else {
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        }
    }
}