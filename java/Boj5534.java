import java.io.*;

public class Boj5534 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine().trim());

        String origin = br.readLine().trim();
        int count = 0;
        for (int i = 0; i < n; i++) {
            String sub = br.readLine().trim();
            if (sol(origin, sub)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean sol(String origin, String sub) {
        if (origin.equals(sub)) {
            return false;
        }
        int count = 0;
        int i = 0;
        for (int o = 0; o < sub.length(); o++) {
            if (origin.charAt(i) == sub.charAt(o)) {
                i++;
                count++;
            }
            if (i == origin.length()) {
                break;
            }
        }
        if (count != origin.length()) {
            return false;
        }
        return true;

    }
}
