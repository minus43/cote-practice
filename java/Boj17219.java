import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Boj17219 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        List<String> result = new ArrayList<>();

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Map<String, String> sitePwMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] sitePw = br.readLine().split(" ");
            sitePwMap.put(sitePw[0], sitePw[1]);
        }
        for (int o = 0; o < m; o++) {
            result.add(sitePwMap.get(br.readLine()));
        }

        result.forEach(el -> System.out.println(el));
    }
}
