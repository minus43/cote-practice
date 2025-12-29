import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Boj2161 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        while (queue.size() != 1) {
            System.out.print(queue.poll() + " ");
            queue.add(queue.poll());
        }
        System.out.print(queue.poll());
    }
}
