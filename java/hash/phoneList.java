import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Boolean> numberMap = new HashMap();
        for (String number : phone_book){
            numberMap.put(number, true);
        }
        for (String number : phone_book){
            for(int i = 0; i< number.length(); i++){
                String num = number.substring(0, i);
                if(numberMap.containsKey(num)){
                    answer = false;
                    return answer;
                } 
            }
        }

        return answer;
    }
}