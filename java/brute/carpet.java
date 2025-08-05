class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int surface = brown + yellow;
        int maxHeight = (int) Math.ceil(Math.sqrt(surface));
        for (int i = 3; i <= maxHeight; i++) {
            int height = i;
            int countBrown = brown;
            int countYellow = yellow;
            if (surface % height != 0) {
                continue;
            }
            int width = surface / height;
            if (height > width) {
                continue;
            }
            System.out.println(width + "" + height);
            for (int o = 0; o < height; o++) {
                if (o == 0 | o == height - 1) {
                    countBrown -= width;
                } else {
                    countBrown -= 2;
                    countYellow -= width;
                    countYellow += 2;
                }
            }
            if (countBrown == 0 & countYellow == 0) {
                answer = new int[] { width, height };
            }
        }
        return answer;
    }
}