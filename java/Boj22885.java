import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Boj22885 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> result = new ArrayList<>();

        int t = Integer.parseInt(br.readLine().trim());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int o = 0; o < n; o++) {
                arr[o] = Integer.parseInt(st.nextToken());
            }

            result.add("Case #" + (i + 1) + ": " + reverseSort(arr));
        }
        result.forEach(el -> System.out.println(el));
    }

    public static int reverseSort(int[] arr) {
        int result = 0;
        for (int p = 1; p < arr.length; p++) {
            int j = findMinIdx(arr, p);
            arr = reverse(arr, p, j);
            result += j - p + 1;
        }
        return result;
    }

    public static int findMinIdx(int[] arr, int start) {

        int min = Integer.MAX_VALUE;
        int idx = 0;
        for (int i = start - 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                idx = i;
            }
        }
        return idx + 1;
    }

    public static int[] reverse(int[] arr, int start, int end) {
        int left = start - 1;
        int right = end - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return arr;
    }

}
