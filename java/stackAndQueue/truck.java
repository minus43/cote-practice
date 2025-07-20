import java.util.LinkedList;
import java.util.Queue;

class Solution {

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int bridgeWeight = 0;
        Queue<Integer> waitQueue = new LinkedList<>();
        Queue<Integer> bridgeQueue = new LinkedList<>();
        for (int truck : truck_weights) {
            waitQueue.add(truck);
        }
        while (!waitQueue.isEmpty()) {
            if(bridgeWeight< weight){
                
            }
        }

        return answer;
    }
}
