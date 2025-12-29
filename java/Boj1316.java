import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Boj1316 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> map = new HashMap<>();
        int result = n;
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            for (int o = 0; o < s.length(); o++) {
                if (!map.containsKey(s.charAt(o))) {
                    map.put(s.charAt(o), o);
                } else {
                    if (o - map.get(s.charAt(o)) == 1) {
                        map.put(s.charAt(o), o);
                    } else {
                        result--;
                        break;
                    }
                }
            }
            map.clear();
        }
        System.out.println(result);
    }
}
