import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> bridge = new LinkedList<>();
        int time = 0;
        int totalWeight = 0;
        int index = 0;

        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        while (!bridge.isEmpty()) {
            time++;

            totalWeight -= bridge.poll();

            if (index < truck_weights.length) {
                if (totalWeight + truck_weights[index] <= weight) {
                    bridge.offer(truck_weights[index]);
                    totalWeight += truck_weights[index];
                    index++;
                } else {
                    bridge.offer(0);
                }

            }
        }

        answer = time;
        return answer;
    }
}
