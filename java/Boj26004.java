import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boj26004 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> letter = List.of('H', 'I', 'A', 'R', 'C');
        Map<Character, Integer> countMap = new HashMap<>();
        letter.forEach(el -> countMap.put(el, 0));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;

        String s = br.readLine();
        for (int i = 0; i < n; i++) {
            if (countMap.containsKey(s.charAt(i))) {
                countMap.put(s.charAt(i), countMap.get(s.charAt(i)) + 1);
            }
        }

        for (Map.Entry<Character, Integer> e : countMap.entrySet()) {
            if (letter.contains(e.getKey())) {
                min = Math.min(min, e.getValue());
            }
        }

        System.out.println(min);

    }
}
