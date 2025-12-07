import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Boj17010 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        List<String> result = new ArrayList<>();

        for(int i=0; i< l; i++){
            String[] input = br.readLine().split(" ");
            StringBuilder sb = new StringBuilder();
            for(int o=0; o<Integer.parseInt(input[0]); o++){
                sb.append(input[1]);
            }
            result.add(sb.toString());
        }
        result.forEach((el) -> System.out.println(el));
    }
    
}
