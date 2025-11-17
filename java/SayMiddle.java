import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class SayMiddle {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            if (max.isEmpty() || num <= max.peek()) {
                max.offer(num);
            } else {
                min.offer(num);
            }

            if (max.size() > min.size() + 1) {
                min.offer(max.poll());
            } else if (min.size() > max.size()) {
                max.offer(min.poll());
            }

            System.out.println(max.peek());
        }
    }
}
