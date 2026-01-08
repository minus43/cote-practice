import java.io.*;
import java.util.StringTokenizer;


public class Boj27855 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer p1 = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(p1.nextToken()) * 3 + Integer.parseInt(p1.nextToken());

        StringTokenizer p2 = new StringTokenizer(br.readLine());
        int s2 = Integer.parseInt(p2.nextToken()) * 3 + Integer.parseInt(p2.nextToken());

        if (s1 == s2) {
            System.out.println("NO SCORE");
        } else if (s1 > s2) {
            System.out.println("1 " + (s1 - s2));
        } else {
            System.out.println("2 " + (s2 - s1));
        }
    }

}
