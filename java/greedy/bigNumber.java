import java.util.*;

class Solution {
    public String solution(String number, int k) {
        String answer = "";
        Stack<Character> numStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char digit : number.toCharArray()) {
            while (!numStack.isEmpty() && k > 0 && numStack.peek() < digit) {
                numStack.pop();
                k--;
            }
            numStack.push(digit);
        }
        while (k > 0) {
            numStack.pop();
            k--;
        }

        for (char c : numStack) {
            sb.append(c);
        }
        answer = sb.toString();
        return answer;
    }
}