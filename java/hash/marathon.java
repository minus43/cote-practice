import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> participantMap = new HashMap();
        Map<String, Integer> completionMap = new HashMap();
        for(String part : participant){
            if(participantMap.containsKey(part)){
                participantMap.put(part, participantMap.get(part)+1);
            } else{
                participantMap.put(part, 1);
            }
        }
        for (String comp : completion){
            participantMap.put(comp, participantMap.get(comp)-1);
        }
        
        for(String part: participant){
            if(participantMap.get(part) > 0){
                answer =part;
            }
        }
        
        return answer;
    }
}