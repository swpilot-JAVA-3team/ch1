# 시간복잡도 개념과 필요성
- 입력값과 연산 수행 시간의 상관관를 나타내 척도
- 어떤 알고리즘이 더 효율적인지 판별하기 위해 필요하다

# 1번 코드 시간복잡도
<pre><code>
List<Integer> nums = new ArrayList<>();

            for(int i = 0; i < args.length; i++) {
                if (Integer.parseInt(args[i]) < 0 | Integer.parseInt(args[i]) > 1000) {
                    System.out.println("-> 입력된 값의 범위가 올바르지 않습니다. 0에서 1000까지의 값을 입력해주세요.");
                    System.exit(1);
                }
                else {
                    nums.add(Integer.parseInt(args[i]));
                }
            }
            System.out.println(nums);
            System.out.println("-> " + findnum(nums));
</code></pre>
<pre><code>
public static int findnum (List<Integer> nums) {
        int[] cnt = new int[1000];
        for(Integer num : nums) {
            cnt[num]++;
        }

        for (int i = 0; i < 1000; i++) {
            if (cnt[i] == 1) {
                return i;
            }
        }

        return -1;
    }
</code></pre>

- 시간복잡도 : O(N)

# 2번 코드 시간복잡도
<pre><code>
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
</code></pre>

- 시간복잡도 O(N<sup>2</sup>)

# 병목현상 분석 및 최적화 방안
- 2번 코드에서 문자열 결합을 StringBuilder를 사용한다, 스택의 크기를 제한한다.  