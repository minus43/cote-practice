import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj10102 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        String vote = br.readLine().trim();
        int a = 0;
        int b = 0;
        for (int i = 0; i < v; i++) {
            if (vote.charAt(i) == 'A') {
                a++;
            } else {
                b++;
            }
        }

        if (a > b) {
            System.out.println("A");
        } else if (b > a) {
            System.out.println("B");
        } else {
            System.out.println("Tie");
        }
    }

}
