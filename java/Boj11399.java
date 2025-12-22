import java.io.*;
import java.util.PriorityQueue;
import java.util.Queue;

public class Boj11399 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int result = 0;
        int total = 0;

        Queue<Integer> people = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            people.add(Integer.parseInt(input[i]));
        }
        while (!people.isEmpty()) {
            result += people.poll();
            total += result;
        }
        System.out.println(total);
    }
}
