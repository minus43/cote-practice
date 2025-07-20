import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> priorityQueue = new LinkedList<>();
        Queue<Integer> locationQueue = new LinkedList<>();
        for(int i=0; i<priorities.length; i++){
            priorityQueue.add(priorities[i]);
            locationQueue.add(i);
        }
        while(true){
            int p=priorityQueue.poll();
            int l=locationQueue.poll();
            if(!priorityQueue.isEmpty() && (priorityQueue.stream().mapToInt(i->i).max().getAsInt()>p)){
                priorityQueue.add(p);
                locationQueue.add(l);
            } else{
                answer++;
                if(l == location){
                    break;
                }
            }
        }
        return answer;
    }
}