import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        List<Integer> result = new ArrayList<>();

        Map<String, Integer> genreMap = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            genreMap.put(genres[i], genreMap.getOrDefault(genres[i], 0)+plays[i]);
        }
        List<String> sortedGenre= new ArrayList<>(genreMap.keySet());
        sortedGenre.sort((a,b) ->
            genreMap.get(b) - genreMap.get(a)
        );
        
        for(String genre: sortedGenre){
            List<Integer> sortedSong= new ArrayList<>();
            for(int i = 0; i< genres.length; i++){
                if(genres[i].equals(genre)){
                    sortedSong.add(i);
                }
            }
            sortedSong.sort((a,b)->{
                if (plays[b] != plays[a]) {
                    return plays[b] - plays[a]; 
                } else {
                     return a - b; 
                }
            });
            int[] songs={};
            songs=sortedSong.stream().mapToInt(i->i).toArray();
            result.add(songs[0]);
            if (songs.length > 1) {
                result.add(songs[1]);
            }
        }
        answer=result.stream().mapToInt(i->i).toArray();
        return answer;
    }
}