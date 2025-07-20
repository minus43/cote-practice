import java.util.*;

class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> number = new Stack<>();
        for(int num: arr){
            if(number.size() == 0) {
                number.push(num);
                continue;
            }
            if(number.peek() != num){
                number.push(num);
            }
        }
        answer = number.stream().mapToInt(i->i).toArray();

        return answer;
    }
}