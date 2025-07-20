import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int day = 1;
        List<Integer> result= new ArrayList<>();
        Queue<Integer> progressQueue = new LinkedList<>();
        Queue<Integer> speedQueue = new LinkedList<>();
        for(int progress: progresses){
            progressQueue.add(progress);
        }
        for(int speed: speeds){
            speedQueue.add(speed);
        }
        while(!progressQueue.isEmpty()){
            int endProgress = 0;
            while(!progressQueue.isEmpty() && progressQueue.peek()+day*speedQueue.peek() >= 100){
                progressQueue.poll();
                speedQueue.poll();
                endProgress++;
            }
            if(endProgress > 0){
                result.add(endProgress);
            } 
            day++;
        }
        answer = result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}