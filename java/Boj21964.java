import java.io.*;

public class Boj21964 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        System.out.println(s.substring(s.length() - 5, s.length()));
    }
}
