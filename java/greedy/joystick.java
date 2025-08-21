import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int len = name.length();

        // 상하 조작
        for (int i = 0; i < len; i++) {
            answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
        }

        // 좌우 이동 조작 최소 계산
        int move = len - 1;

        for (int i = 0; i < len; i++) {
            int next = i + 1;

            while (next < len && name.charAt(next) == 'A') {
                next++;
            }

            // 1. 오른쪽 갔다가 ← 돌아가서 나머지
            int option1 = i + i + len - next;

            // 2. ← 먼저 갔다가 오른쪽으로 돌아오는 경우 (대칭 경로)
            int option2 = i + (len - next) * 2;

            move = Math.min(move, Math.min(option1, option2));
        }

        answer += move;
        return answer;
    }
}
