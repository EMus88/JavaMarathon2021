package day18;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node();
        root.setValue(20);
        Node.insertNode(14,root);
        Node.insertNode(11,root);
        Node.insertNode(5,root);
        Node.insertNode(8,root);
        Node.insertNode(16,root);
        Node.insertNode(15,root);
        Node.insertNode(18,root);
        Node.insertNode(23,root);
        Node.insertNode(22,root);
        Node.insertNode(27,root);
        Node.insertNode(24,root);
        Node.insertNode(150,root);

        System.out.println(Node.dfs(root));

    }
}