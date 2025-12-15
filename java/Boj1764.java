import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Boj1764 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        Set<String> hear = new HashSet<>();
        List<String> see = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            hear.add(br.readLine());
        }
        for (int o = 0; o < m; o++) {
            String target = br.readLine();
            if (hear.contains(target) && !see.contains(target)) {
                see.add(target);
                count++;
            }
        }
        Collections.sort(see);
        System.out.println(count);
        see.forEach(el -> System.out.println(el));
    }
}
