import java.util.ArrayList;
import java.util.List;

public class Question9 {
    static class Node {
        int val;
        Node left, right;

        Node(int val) {
            this.val = val;
        }
    }

    public static List<String> binaryTreePaths(Node root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            dfs(root, "", paths);
        }
        return paths;
    }

    private static void dfs(Node node, String path, List<String> paths) {
        if (node != null) {
            path += node.val;
            if (node.left == null && node.right == null) {
                paths.add(path);
            } else {
                path += "->";
                dfs(node.left, path, paths);
                dfs(node.right, path, paths);
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);

        List<String> result = binaryTreePaths(root);
        System.out.println(result);
    }
}
