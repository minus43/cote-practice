import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj1991 {

    static Map<String, Node> map = new HashMap<>();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String parent = st.nextToken();
            String left = st.nextToken();
            String right = st.nextToken();

            Node cur = map.computeIfAbsent(parent, Node::new);

            if (!left.equals(".")) {
                cur.left = map.computeIfAbsent(left, Node::new);
            }
            if (!right.equals(".")) {
                cur.right = map.computeIfAbsent(right, Node::new);
            }

        }
        pre("A");
        System.out.println();
        mid("A");
        System.out.println();
        fre("A");
    }

    static class Node {
        String node;

        Node(String node) {
            this.node = node;
        }

        Node left;
        Node right;
    }

    public static void pre(String node) {
        Node cur = map.get(node);
        System.out.print(cur.node);
        if (cur.left != null) {
            pre(cur.left.node);
        }
        if (cur.right != null) {
            pre(cur.right.node);
        }
        return;
    }

    public static void mid(String node) {
        Node cur = map.get(node);
        if (cur.left != null) {
            mid(cur.left.node);
        }
        System.out.print(cur.node);
        if (cur.right != null) {
            mid(cur.right.node);
        }
        return;
    }

    public static void fre(String node) {
        Node cur = map.get(node);
        if (cur.left != null) {
            fre(cur.left.node);
        }
        if (cur.right != null) {
            fre(cur.right.node);
        }
        System.out.print(cur.node);
        return;
    }
}
