import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map participantMap = new HashMap<String, Integer>();
        Map completionMap = new HashMap<String, Integer>();
        for(String part : participant){
            if(participantMap.containsKey(part)){
                participantMap.put(part, (Integer)participantMap.get(part)+1);
            } else{
                participantMap.put(part, 1);
            }
        }
        for (String comp : completion){
            participantMap.put(comp, (Integer)participantMap.get(comp)-1);
        }
        
        for(String part: participant){
            if((Integer)participantMap.get(part) > 0){
                answer =part;
            }
        }
        
        return answer;
    }
}