import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Boj1620 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Map<String, String> keyMap = new HashMap<>();
        Map<String, String> valueMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String pokemon = br.readLine();
            keyMap.put(i + 1 + "", pokemon);
            valueMap.put(pokemon, i + 1 + "");
        }
        for (int o = 0; o < m; o++) {
            String problem = br.readLine();
            if (Character.isAlphabetic(problem.charAt(0))) {
                System.out.println(valueMap.get(problem));
            } else {
                System.out.println(keyMap.get(problem));
            }
        }
    }
}
