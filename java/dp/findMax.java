class Solution {
    public int solution(String[] arr) {
        // 1) 숫자/연산자 분리
        int n = (arr.length + 1) / 2; // 숫자 개수
        int[] nums = new int[n];
        char[] ops = new char[n - 1];
        for (int i = 0; i < arr.length; i++) {
            if ((i & 1) == 0)
                nums[i / 2] = Integer.parseInt(arr[i]); // 짝수: 숫자
            else
                ops[i / 2] = arr[i].charAt(0); // 홀수: 연산자
        }

        // 2) DP 테이블
        int[][] dpMax = new int[n][n];
        int[][] dpMin = new int[n][n];

        // 길이 1 초기화
        for (int i = 0; i < n; i++) {
            dpMax[i][i] = nums[i];
            dpMin[i][i] = nums[i];
        }

        // 3) 구간 길이 확장
        for (int len = 2; len <= n; len++) { // 구간 길이
            for (int i = 0; i + len - 1 < n; i++) { // 시작
                int j = i + len - 1; // 끝
                int maxVal = Integer.MIN_VALUE / 4;
                int minVal = Integer.MAX_VALUE / 4;

                for (int k = i; k < j; k++) { // 분할점 (ops[k]는 nums[k]와 nums[k+1] 사이)
                    char op = ops[k];
                    if (op == '+') {
                        maxVal = Math.max(maxVal, dpMax[i][k] + dpMax[k + 1][j]);
                        minVal = Math.min(minVal, dpMin[i][k] + dpMin[k + 1][j]);
                    } else { // '-'
                        maxVal = Math.max(maxVal, dpMax[i][k] - dpMin[k + 1][j]);
                        minVal = Math.min(minVal, dpMin[i][k] - dpMax[k + 1][j]);
                    }
                }
                dpMax[i][j] = maxVal;
                dpMin[i][j] = minVal;
            }
        }

        return dpMax[0][n - 1];
    }
}
