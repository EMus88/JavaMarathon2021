package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node {
    private int value;
    private Node childL;
    private Node childR;
    private static List<Integer> list = new ArrayList<>();


    public int getValue() {
        return value;
    }

    public Node getChildL() {
        return childL;
    }

    public Node getChildR() {
        return childR;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setChildL(Node childL) {
        this.childL = childL;
    }

    public void setChildR(Node childR) {
        this.childR = childR;
    }


    public static void insertNode(int value, Node root) {
        Node newNode = new Node();
        newNode.setValue(value);
        Node currentNode = root;
        Node parentNode;
        while (true) {
            parentNode = currentNode;
            if (value == currentNode.getValue()) {
                return;
            } else if (value < currentNode.getValue()) {
                currentNode = currentNode.getChildL();
                if (currentNode == null) {
                    parentNode.setChildL(newNode);
                    return;
                }
            } else {
                currentNode = currentNode.getChildR();
                if (currentNode == null) {
                    parentNode.setChildR(newNode);
                    return;
                }
            }
        }
    }

    public static List dfs(Node root) {
        if (root.getChildL() != null) {
            dfs(root.getChildL());
        }
        if (root.getChildR() != null) {
            dfs(root.getChildR());
        }
        list.add(root.getValue());
        Collections.sort(list);
        return list;
    }

}


