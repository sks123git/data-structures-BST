package com.binarysearchtree;
// Program for binary search tree
public class BinarySearchTree {

    public class Node {
        public int data;
        public Node left;
        public Node right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public Node root;
    // making root by default null
    public BinarySearchTree() {
        this.root = null;
    }
    public void add(int newData) {
        this.root = add(root, newData);
    }

    public Node add(Node root, int newData) {
        if (root == null) {
            root = new Node(newData);
            return root;
        }
        else if (root.data >= newData) {
            root.left = add(root.left, newData);
        } else {
            root.right = add(root.right, newData);
        }
        return root;
    }
    public boolean search(int data) {
        return search(this.root, data);
    }

    private boolean search(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return search(root.left, data);
        }
        return search(root.right, data);
    }
    public void preorder() {
        preorder(root);
        System.out.println();
    }

    public void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree();
        searchTree.add(56);
        searchTree.add(30);
        searchTree.add(70);
        searchTree.preorder();
        boolean b = searchTree.search(56);
        System.out.println(b?"found":"not found");

    }
}