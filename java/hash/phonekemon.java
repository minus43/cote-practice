import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int size = nums.length;
        Map<Integer, Integer> monsters = new HashMap();
        for (int num : nums){
            monsters.put(num, monsters.getOrDefault(num, 0)+1);
        }
        answer= size / 2 < monsters.keySet().size() ? size / 2 : monsters.keySet().size();
        return answer;
    }
}