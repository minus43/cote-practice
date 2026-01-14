// public class Solution {
//     public int solution1(int n) {
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             if (i % 2 == 1) {
//                 sum += i;
//             }
//         }
//         return sum;
//     }

//     public int solution2(int n) {
//         int k = (n + 1) / 2;
//         return k * k;
//     }

//     public int solution3(int n) {
//         if (n <= 0) {
//             return 0;
//         }

//         if (n % 2 == 1) {
//             return n + solution3(n - 2);
//         } else {
//             return solution3(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         int n = 10;

//         System.out.println(sol.solution1(n));
//         System.out.println(sol.solution2(n));
//         System.out.println(sol.solution3(n));
//     }
// }

// public class Solution {
//     public String solution(String input) {
//         StringBuilder sb = new StringBuilder();

//         for (int i = input.length() - 1; i >= 0; i--) {
//             sb.append(input.charAt(i));
//         }

//         return sb.toString();
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         System.out.println(sol.solution("hello"));
//     }
// }

// import java.util.*;

// public class Solution {
//     private Map<Integer, String> buildPaths(
//             Map<Integer, List<Integer>> tree,
//             int root) {
//         Map<Integer, String> pathMap = new HashMap<>();
//         Stack<Integer> nodeStack = new Stack<>();
//         Stack<String> pathStack = new Stack<>();

//         nodeStack.push(root);
//         pathStack.push(String.valueOf(root));

//         while (!nodeStack.isEmpty()) {
//             int node = nodeStack.pop();
//             String path = pathStack.pop();

//             pathMap.put(node, path);

//             if (tree.containsKey(node)) {
//                 for (int child : tree.get(node)) {
//                     nodeStack.push(child);
//                     pathStack.push(path + "-" + child);
//                 }
//             }
//         }
//         System.out.println(pathMap);
//         return pathMap;
//     }

//     public List<Integer> solution(
//             Map<Integer, List<Integer>> originalTree,
//             Map<Integer, List<Integer>> compareTree,
//             int root) {
//         Map<Integer, String> originalPaths = buildPaths(originalTree, root);
//         Map<Integer, String> comparePaths = buildPaths(compareTree, root);

//         List<Integer> result = new ArrayList<>();

//         for (int nodeId : originalPaths.keySet()) {
//             if (!originalPaths.get(nodeId)
//                     .equals(comparePaths.get(nodeId))) {
//                 result.add(nodeId);
//             }
//         }

//         Collections.sort(result);
//         return result;
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();

//         Map<Integer, List<Integer>> original = new HashMap<>();
//         original.put(1, Arrays.asList(2, 3));
//         original.put(3, Arrays.asList(4, 5, 6));

//         Map<Integer, List<Integer>> compare = new HashMap<>();
//         compare.put(1, Arrays.asList(2, 5));
//         compare.put(2, Arrays.asList(3));
//         compare.put(3, Arrays.asList(4));
//         compare.put(5, Arrays.asList(6));

//         System.out.println(sol.solution(original, compare, 1));
//     }
// }
