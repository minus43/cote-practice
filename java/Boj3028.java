import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boj3028 {
    static List<Integer> arr = new ArrayList<>(List.of(1, 0, 0));

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a();
            } else if (s.charAt(i) == 'B') {
                b();
            } else if (s.charAt(i) == 'C') {
                c();
            }
        }
        System.out.println(arr.indexOf(1) + 1);

    }

    public static void a() {
        int temp = arr.get(0);
        arr.set(0, arr.get(1));
        arr.set(1, temp);
    }

    public static void b() {
        int temp = arr.get(1);
        arr.set(1, arr.get(2));
        arr.set(2, temp);
    }

    public static void c() {
        int temp = arr.get(0);
        arr.set(0, arr.get(2));
        arr.set(2, temp);
    }

}
