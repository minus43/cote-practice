import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj24325 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());
        List<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int money = (int) Math.floor(Double.parseDouble(input[1]) - Double.parseDouble(input[0]));
            int v = money / 50;
            money = money % 50;
            int w = money / 20;
            money = money % 20;
            int x = money / 10;
            money = money % 10;
            int y = money / 5;
            money = money % 5;
            int z = money / 1;
            result.add(v + "-$50, " + w + "-$20, " + x + "-$10, " + y + "-$5, " + z + "-$1");
        }
        result.forEach(el -> System.out.println(el));
    }
}
