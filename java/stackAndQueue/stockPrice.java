import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = {};
        Stack<Integer> indexs = new Stack<>();
        int i = 0;
        int[] terms = new int[prices.length];

        indexs.push(i);
        for (i = 1; i < prices.length; i++) {
            while (!indexs.isEmpty() && prices[i] < prices[indexs.peek()]) {
                int index = indexs.pop();
                terms[index] = i - index;
            }
            indexs.push(i);
        }
        while (!indexs.isEmpty()) {
            int index = indexs.pop();
            terms[index] = i - index - 1;
        }
        answer = terms;
        return answer;
    }
}