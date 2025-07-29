class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int min = 0;
        for(int[] size : sizes){
            if(size[0]> max){
                max = size[0];
            }
            if(size[1]> max){
                max = size[1];
            }
        }
        for(int[] size: sizes){
            int sizeMin = size[0] < size[1] ? size[0] : size[1];
            if(sizeMin> min){
                min = sizeMin;
            }
        }
        answer = max * min;

        return answer;
    }
}