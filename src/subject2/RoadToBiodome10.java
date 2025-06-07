package subject2;

public class RoadToBiodome10 {

    static final int MAX_PLANTS = 101;
    static boolean[][] graph = new boolean[MAX_PLANTS][MAX_PLANTS];
    static boolean[] visited = new boolean[MAX_PLANTS];
    static boolean[] exists = new boolean[MAX_PLANTS];

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("입력 값이 없습니다.");
            return;
        }

        try {
            for (String arg : args) {
                String[] pair = arg.split(",");
                if (pair.length != 2) {
                    System.out.println("잘못된 입력 형식입니다.");
                    return;
                }

                int a = Integer.parseInt(pair[0]);
                int b = Integer.parseInt(pair[1]);

                if (a < 1 || a > 100 || b < 1 || b > 100) {
                    System.out.println("식물의 범위를 벗어난 숫자가 포함되어 있습니다.");
                    return;
                }

                graph[a][b] = true;
                graph[b][a] = true;
                exists[a] = true;
                exists[b] = true;
            }
        } catch (NumberFormatException e) {
            System.out.println("입력 값에 문자가 포함되어 있습니다.");
            return;
        }

        int groupCount = 0;
        for (int i = 1; i < MAX_PLANTS; i++) {
            if (exists[i] && !visited[i]) {
                dfs(i);
                groupCount++;
            }
        }

        System.out.println(groupCount);
    }

    static void dfs(int node) {
        visited[node] = true;
        for (int i = 1; i < MAX_PLANTS; i++) {
            if (graph[node][i] && !visited[i]) {
                dfs(i);
            }
        }
    }
}