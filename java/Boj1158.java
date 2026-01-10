import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj1158 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        String result = "<";
        while (true) {
            for (int i = 0; i < k - 1; i++) {
                queue.add(queue.poll());
            }
            result += queue.poll();
            if (queue.isEmpty()) {
                break;
            } else {
                result += ", ";
            }
        }
        System.out.println(result + ">");

    }
}
