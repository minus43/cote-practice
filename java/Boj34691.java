import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj34691 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> answer = new ArrayList<>();

        while (true) {
            String question = br.readLine();
            if (question.equals("end")) {
                break;
            } else if (question.equals("animal")) {
                answer.add("Panthera tigris");
            } else if (question.equals("tree")) {
                answer.add("Pinus densiflora");
            } else if (question.equals("flower")) {
                answer.add("Forsythia koreana");
            }
        }

        answer.forEach(el -> System.out.println(el));
    }
}
