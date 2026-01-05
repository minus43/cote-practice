import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj15721 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int sign = Integer.parseInt(br.readLine());

        String prefix = "뻔 데기 뻔 데기 ";

        List<Integer> bbun = new ArrayList<>();
        List<Integer> daegi = new ArrayList<>();

        int count = 1;
        int person = 0;
        while (true) {
            String s = prefix;
            for (int i = 0; i < count + 1; i++) {
                s += "뻔 ";
            }

            for (int i = 0; i < count + 1; i++) {
                s += "데기 ";
            }
            StringTokenizer st = new StringTokenizer(s);
            while (st.hasMoreTokens()) {
                String token = st.nextToken();
                if (person >= a) {
                    person = person % a;
                }
                if (token.equals("뻔")) {
                    bbun.add(person);
                } else if (token.equals("데기")) {
                    
                    daegi.add(person);
                }
                person++;
            }
            if (sign == 0 && bbun.size() >= t) {
                System.out.println(bbun.get(t - 1));
                break;
            } else if (sign == 1 && daegi.size() >= t) {
                System.out.println(daegi.get(t - 1));
                break;
            }

            count++;
        }
    }
}
