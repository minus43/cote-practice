import java.io.*;

public class Boj29863 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sleepTime = Integer.parseInt(br.readLine());
        int awakeTime = Integer.parseInt(br.readLine());
        int result = 0;
        if (sleepTime >= 20 && sleepTime <= 23) {
            result = (24 - sleepTime) + awakeTime;
        } else {
            result = awakeTime - sleepTime;
        }
        System.out.println(result);
    }
}
