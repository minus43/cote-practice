import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj10774 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int j = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());

        int[] shirts = new int[j + 1];
        int count = 0;

        for (int i = 1; i <= j; i++) {
            String s = br.readLine();
            if (s.equals("S"))
                shirts[i] = 1;
            else if (s.equals("M"))
                shirts[i] = 2;
            else
                shirts[i] = 3;
        }

        for (int i = 0; i < a; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String size = st.nextToken();
            int num = Integer.parseInt(st.nextToken());

            int need;
            if (size.equals("S"))
                need = 1;
            else if (size.equals("M"))
                need = 2;
            else
                need = 3;

            if (shirts[num] >= need) {
                shirts[num] = 0;
                count++;
            }
        }

        System.out.println(count);
    }
}
