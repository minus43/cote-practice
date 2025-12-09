import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Boj14561 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String[] in = br.readLine().split(" ");
            String a = in[0];
            int n = Integer.parseInt(in[1]);

            String base = convertBase(a, n);
            sb.append(isPalindrome(base)).append("\n");
        }

        System.out.print(sb);
    }

    // 문자열 기반 나눗셈으로 a를 n진수 문자열로 변환
    public static String convertBase(String a, int n) {
        StringBuilder result = new StringBuilder();

        while (!isZero(a)) {
            int remainder = 0;
            StringBuilder next = new StringBuilder();
            boolean started = false;

            for (int i = 0; i < a.length(); i++) {
                int num = remainder * 10 + (a.charAt(i) - '0');
                int q = num / n;
                remainder = num % n;

                if (q != 0 || started) {
                    next.append((char)('0' + q));
                    started = true;
                }
            }

            // next가 비면 다음 숫자는 0
            a = next.length() == 0 ? "0" : next.toString();

            result.append((char)('0' + remainder));
        }

        return result.reverse().toString();
    }

    // 문자열이 "0" 또는 "000000"이면 true
    private static boolean isZero(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.charAt(i) != '0') return false;
        return true;
    }

    // 회문 검사
    public static int isPalindrome(String str) {
        int l = 0, r = str.length() - 1;
        while (l < r) {
            if (str.charAt(l) != str.charAt(r))
                return 0;
            l++;
            r--;
        }
        return 1;
    }
}
