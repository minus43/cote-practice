import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj4696 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            double value = Double.parseDouble(br.readLine());
            if (value == 0) {
                break;
            }
            double man = 1;
            double wife = value;
            double sack = wife * value;
            double cat = sack * value;
            double kitten = cat * value;
            double result = man + wife + sack + cat + kitten;
            System.out.printf("%.2f%n", result);

        }
    }

}
