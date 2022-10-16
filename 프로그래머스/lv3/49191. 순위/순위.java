class Solution {
   public int solution(int n, int[][] results) {

		int[][] graph = new int[n + 1][n + 1];

		for (int i = 0; i < results.length; i++) {
			graph[results[i][0]][results[i][1]] = 1;
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (graph[j][i] == 1 && graph[i][k] == 1) {
						graph[j][k] = 1;
					}
				}
			}
		}

		int answer = 0;
		for (int i = 1; i <= n; i++) {

			int cnt = 0;
			for (int j = 1; j <= n; j++) {
				if (graph[i][j] == 1 || graph[j][i] == 1) {
					cnt += 1;
				}
			}
			if (cnt == n - 1) {
				answer += 1;
			}
		}

		return answer;
	}
}
/*


1 ->   <- 3
     2 
  ->   ->
4        5

1 -> 2 -> 5
3 -> 2
4 -> 2


*/