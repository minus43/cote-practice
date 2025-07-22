import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scovilles = new PriorityQueue<>();
        int target = 0;
        for (int one : scoville) {
            scovilles.offer(one);
        }
        while (scovilles.size() >= 2 && scovilles.peek() < K) {
            target = scovilles.poll() + scovilles.poll() * 2;
            scovilles.offer(target);
            answer++;
        }
        if (scovilles.peek() < K) {
            answer = -1;
        }
        return answer;
    }
}