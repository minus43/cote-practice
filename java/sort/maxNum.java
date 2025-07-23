import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        List<String> maxinum = new ArrayList<>();
        for (int number : numbers) {
            maxinum.add(String.valueOf(number));
        }
        maxinum.sort((a, b) -> (b + a).compareTo(a + b));
        if (maxinum.get(0).equals("0")) {
            return "0";
        }
        StringBuilder result = new StringBuilder();
        maxinum.forEach((each) -> result.append(each));
        answer = result.toString();
        return answer;
    }
}