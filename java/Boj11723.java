import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Boj11723 {
    static Set<Integer> s = new HashSet<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");

            String command = input[0];
            int x = 0;
            if (input.length == 2) {
                x = Integer.parseInt(input[1]);
            }

            switch (command) {
                case "add":
                    s.add(x);
                    break;

                case "remove":
                    s.remove(x);
                    break;

                case "check":
                    sb.append(s.contains(x) ? 1 : 0).append("\n");
                    break;

                case "toggle":
                    if (s.contains(x))
                        s.remove(x);
                    else
                        s.add(x);
                    break;

                case "all":
                    s.clear();
                    for (int k = 1; k <= 20; k++)
                        s.add(k);
                    break;

                case "empty":
                    s.clear();
                    break;
            }
        }
        System.out.print(sb);
    }
}
