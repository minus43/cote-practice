import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        List<Integer> origin = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for (int[] command : commands) {
            origin.clear();
            int i = command[0] - 1;
            int j = command[1] - 1;
            int k = command[2] - 1;
            for (int o = i; o <= j; o++) {
                origin.add(array[o]);
            }
            origin.sort((a, b) -> a - b);
            result.add(origin.get(k));
        }
        answer = result.stream().mapToInt(i -> i).toArray();
        return answer;
    }
}