import java.io.*;

public class Boj10823 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int result = 0;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) != ',') {
                    sb.append(line.charAt(i));
                } else {
                    result += Integer.parseInt(sb.toString());
                    sb.setLength(0);
                }
            }
        }
        result += Integer.parseInt(sb.toString());
        System.out.println(result);
    }
}
