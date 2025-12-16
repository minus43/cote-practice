import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Boj30617 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int fun = 0;
        Stack<Integer> left = new Stack<>();
        Stack<Integer> right = new Stack<>();

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            if (!left.isEmpty() && !right.isEmpty()) {
                if (l != 0 && left.peek() == l) {
                    fun++;
                }

                if (r != 0 && right.peek() == r) {
                    fun++;
                }
            }

            if (l * r != 0 && l == r) {
                fun++;
            }
            left.add(l);
            right.add(r);
        }
        System.out.println(fun);

    }
}
