import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        Arrays.sort(routes, (a, b) -> a[1] - b[1]);
        int max = routes[0][1];
        answer++;
        for (int[] route : routes) {
            if (route[0] <= max & max <= route[1]) {
                continue;
            }
            max = route[1];
            answer++;
        }
        return answer;
    }
}