package BT;

import java.util.Scanner;

public class nodebttree {

    static class Node {
        int data;
        Node right;
        Node left;

        public Node(int value) {
            data = value;
        }

        public Node() {

        }
    }

    public static int index = -1;

    public Node root = new Node();

    public static Node add(int arr[]) {
        index++;
        if (arr[index] == -1) {
            return null;

        }

        Node newc = new Node(arr[index]);
        newc.left = add(arr);
        newc.right = add(arr);

        return newc;

    }

    public static void pre(Node Heoad) {
        // Head Left Right
        if (Heoad == null) {
            return;
        }
        System.out.println(Heoad.data);
        pre(Heoad.left);

        pre(Heoad.right);

    }

    public static void main(String[] args) {
        int[] a = { 1, 2, -1, -1, 4, -1, -1 };

        pre(add(a));
    }

}