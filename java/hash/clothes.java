import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothMap = new HashMap();
        for (String[] cloth : clothes){
            clothMap.put(cloth[1], clothMap.getOrDefault(cloth[1], 0)+1);
        }
        for(Integer value: clothMap.values()){
            answer *=value+1;
        }
        answer -=1;
        return answer;
    }
}