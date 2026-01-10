import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Boj7587 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            Map<Set<Character>, List<String>> map = new HashMap<>();

            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                Set<Character> set = new HashSet<>();
                for (Character c : s.toCharArray()) {
                    set.add(c);
                }
                if (map.containsKey(set)) {
                    map.get(set).add(s);
                } else {

                    map.put(set, new ArrayList<>(List.of(s)));
                }
            }
            String s = "";
            int count = 0;
            for (List<String> list : map.values()) {
                if (count < list.size() - 1) {
                    s = list.get(0);
                    count = list.size() - 1;
                }
            }
            System.out.println(s + " " + count);
        }
    }
}
