import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boj1018 {
    static int case1 = 0;
    static int case2 = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        List<String> original = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            original.add(br.readLine());
        }

        for (int ii = 0; ii + 8 <= n; ii++) {
            for (int oo = 0; oo + 8 <= m; oo++) {
                for (int i = ii; i < ii + 8; i++) {
                    sub.add(original.get(i).substring(oo, oo + 8));
                }
                result = Math.min(min(sub), result);
                sub.clear();
            }
        }
        System.out.println(result);
    }

    public static int min(List<String> arr) {
        case1 = 0;
        case2 = 0;
        for (int i = 0; i < 8; i++) {
            for (int o = 0; o < 8; o++) {
                char ch = arr.get(i).charAt(o);
                if (i % 2 == 0) {
                    if (o % 2 == 0) {
                        if (ch == 'W') {
                            case2++;
                        } else {
                            case1++;
                        }
                    } else {
                        if (ch == 'B') {
                            case2++;
                        } else {
                            case1++;
                        }
                    }
                } else {
                    if (o % 2 == 0) {
                        if (ch == 'W') {
                            case1++;
                        } else {
                            case2++;
                        }
                    } else {
                        if (ch == 'B') {
                            case1++;
                        } else {
                            case2++;
                        }
                    }
                }
            }
        }
        return Math.min(case2, case1);
    }

}
