package com.bridgelabz.BST;
//Ability to create a BST by
//adding 56 and then
//adding 30 & 70 - Use INode to create My Binary
//Check if all are added with using size method in Binary Tree

public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;
        public TreeNode(int data){
            this.data = data;
        }
    }
    public void insert(int value){
        root = insert(root, value);
    }
    public TreeNode insert( TreeNode root, int value){
        if (root == null || root.data == value){
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data){
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    int size() {
        return size(root);
    }
    int size(TreeNode root) {
        if (root == null)
            return 0;//if tree is empty then return zero
        else
            return (size(root.left) + 1 + size(root.right));}
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(56); //root node
        tree.insert(30);
        tree.insert(22);
        tree.insert(40);
        tree.insert(11);
        tree.insert(3);
        tree.insert(16);
        tree.insert(70);
        tree.insert(60);
        tree.insert(95);
        tree.insert(65);
        tree.insert(63);
        tree.insert(67);
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("Size of the given tree is: " + tree.size());
    }
}
