import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        List<Integer> hindex = new ArrayList<>();
        for (int critation : citations) {
            hindex.add(critation);
        }
        hindex.sort(Comparator.reverseOrder());
        System.out.println(hindex);
        int[] reverseOrder = hindex.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < reverseOrder.length; i++) {
            if (i + 1 <= reverseOrder[i]) {
                answer = i + 1;
            }
        }
        return answer;
    }
}