import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = {};
        PriorityQueue<Integer> minQueue = new PriorityQueue<>();
        PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
        List<Integer> result = new ArrayList<>();
        for (String operationAndNum : operations) {
            String operation = operationAndNum.split(" ")[0];
            int num = Integer.parseInt(operationAndNum.split(" ")[1]);
            if (operation.equals("I")) {
                minQueue.offer(num);
                maxQueue.offer(num);
            } else if (operation.equals("D")) {
                if (num >= 0) {
                    if (!maxQueue.isEmpty()) {
                        int max = maxQueue.poll();
                        minQueue.remove(max);
                    }
                } else {
                    if (!minQueue.isEmpty()) {
                        int min = minQueue.poll();
                        maxQueue.remove(min);
                    }
                }
            }
        }
        if (minQueue.isEmpty()) {
            result.add(0);
            result.add(0);
        } else {
            result.add(maxQueue.poll());
            result.add(minQueue.poll());
        }
        answer = result.stream().mapToInt(i -> i).toArray();

        return answer;
    }
}