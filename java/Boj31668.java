import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj31668 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        System.out.println((m / n) * k);
    }

}
