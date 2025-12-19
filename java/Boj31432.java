import java.io.*;
import java.util.List;

public class Boj31432 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] ss = br.readLine().split(" ");

        System.out.println("YES");
        System.out.println(Integer.parseInt(ss[0] + ss[0] + ss[0]));
    }
}
