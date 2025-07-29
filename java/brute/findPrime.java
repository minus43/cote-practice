import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> numberSet = new HashSet<>();
    boolean[] visited;

    public int solution(String numbers) {
        int answer = 0;
        visited = new boolean[numbers.length()];
        dfs(numbers, "", 0);
        answer = numberSet.size();
        return answer;
    }

    public void dfs(String numbers, String current, int depth) {
        if (!current.equals("")) {
            if (isPrime(current)) {
                numberSet.add(Integer.parseInt(current));
            }
        }

        if (depth == numbers.length())
            return;

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i), depth + 1);
                visited[i] = false;
            }
        }
    }

    public boolean isPrime(String number) {
        int covertedNumber = Integer.parseInt(number);
        if (covertedNumber < 2) {
            return false;
        }

        int maxCount = (int) Math.sqrt(covertedNumber);
        for (int i = 2; i <= maxCount; i++) {
            if (covertedNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}