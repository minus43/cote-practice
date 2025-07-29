import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] result = { stu1(answers), stu2(answers), stu3(answers) };
        List<Integer> winner = new ArrayList<>();
        int maxScore = Arrays.stream(result).max().getAsInt();
        for (int i = 0; i < result.length; i++) {
            if (result[i] == maxScore) {
                winner.add(i + 1);
            }
        }
        answer = winner.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public int stu1(int[] answer) {
        int score = 0;
        for (int i = 0; i < answer.length; i++) {
            int updateI = i % 5;
            updateI++;
            if (answer[i] == updateI) {
                score++;
            }
        }
        return score;
    }

    public int stu2(int[] answer) {
        int score = 0;
        int[] pattern = { 1, 3, 4, 5 };
        for (int i = 0; i < answer.length; i++) {
            int updateI = i % 8;
            updateI++;
            if (updateI % 2 == 1) {
                updateI = 2;
            } else {
                updateI = pattern[(updateI / 2) - 1];
            }
            if (answer[i] == updateI) {
                score++;
            }
        }
        return score;
    }

    public int stu3(int[] answer) {
        int score = 0;
        int[] pattern = { 3, 1, 2, 4, 5 };
        for (int i = 0; i < answer.length; i++) {
            int updateI = i % 10;
            updateI = pattern[updateI / 2];
            if (answer[i] == updateI) {
                score++;
            }
        }
        return score;
    }
}