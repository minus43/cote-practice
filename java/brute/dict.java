import java.util.*;

class Solution {
    List<String> dict = new ArrayList<>();
    char[] letters = { 'A', 'E', 'I', 'O', 'U' };

    public int solution(String word) {
        dfs("", 0);
        return dict.indexOf(word) + 1;
    }

    private void dfs(String current, int depth) {
        if (depth > 5)
            return;
        if (!current.isEmpty())
            dict.add(current);

        for (char c : letters) {
            dfs(current + c, depth + 1);
        }
    }
}
