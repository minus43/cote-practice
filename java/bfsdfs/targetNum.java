class Solution {
    int count = 0;

    public int solution(int[] numbers, int target) {
        int answer = 0;
        bfs(0, numbers, 0, target);
        answer = count;
        return answer;
    }

    public void bfs(int index, int[] numbers, int current, int target) {
        if (index == numbers.length) {
            if (current == target)
                count++;
            return;
        }

        bfs(index + 1, numbers, current + numbers[index], target);
        bfs(index + 1, numbers, current - numbers[index], target);
    }
}