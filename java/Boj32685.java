import java.io.*;

public class Boj32685 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = "";
        for (int i = 0; i < 3; i++) {
            String num = Long.toBinaryString(Long.parseLong(br.readLine()));
            binary += lsb(num);
        }
        System.out.println(lsb(Long.toString(Long.parseLong(binary, 2))));
    }

    public static String lsb(String num) {
        if (num.length() < 4) {
            return String.format("%4s", num).replace(' ', '0');
        } else {
            return num.substring(num.length() - 4, num.length());
        }
    }
}
