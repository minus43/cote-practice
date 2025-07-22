import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int time = 0;
        int processEnd = 0;
        int totalTerm = 0;
        int count = jobs.length;
        PriorityQueue<Integer> processQueue = new PriorityQueue<>();

        while (count > 0) {
            for (int[] job : jobs) {
                if (job[0] <= time) {
                    processQueue.offer(job[1]);
                    totalTerm -= job[0];
                    job[0] = Integer.MAX_VALUE;
                }
            }

            if (processEnd == time) {
                if (!processQueue.isEmpty()) {
                    processEnd = time + processQueue.poll();
                    totalTerm += processEnd;
                    count--;
                } else {
                    processEnd++;
                }
            }

            time++;
        }

        answer = totalTerm / jobs.length;
        return answer;
    }
}
