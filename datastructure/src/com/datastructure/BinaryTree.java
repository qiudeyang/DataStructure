package com.datastructure;

/**
 * Created by qiudeyang on 06/07/16.
 */
/*
此文件研究二叉树的递归先序、中序、后序遍历
 */
public class BinaryTree {
    public void printNode(TreeNode<String> node) {
        System.out.print(node.getData() + " ");
    }

    class TreeNode<T> {
        private T data;
        private TreeNode<T> leftNode;
        private TreeNode<T> rightNode;

        public TreeNode(T data, TreeNode<T> leftNode, TreeNode<T> rightNode) {
            this.data = data;
            this.leftNode = leftNode;
            this.rightNode = rightNode;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public TreeNode<T> getLeftNode() {
            return leftNode;
        }

        public void setLeftNode(TreeNode<T> leftNode) {
            this.leftNode = leftNode;
        }

        public TreeNode<T> getRightNode() {
            return rightNode;
        }

        public void setRightNode(TreeNode<T> rightNode) {
            this.rightNode = rightNode;
        }

    }

    public TreeNode<String> init() {
        TreeNode<String> D = new TreeNode<String>("D", null, null);
        TreeNode<String> H = new TreeNode<String>("H", null, null);
        TreeNode<String> I = new TreeNode<String>("I", null, null);
        TreeNode<String> J = new TreeNode<String>("J", null, null);
        TreeNode<String> P = new TreeNode<String>("P", null, null);
        TreeNode<String> G = new TreeNode<String>("G", P, null);
        TreeNode<String> F = new TreeNode<String>("F", null, J);
        TreeNode<String> E = new TreeNode<String>("E", H, I);
        TreeNode<String> B = new TreeNode<String>("B", D, E);
        TreeNode<String> C = new TreeNode<String>("C", F, G);
        TreeNode<String> A = new TreeNode<String>("A", B, C);
        return null;
    }

    public void preIterator(TreeNode<String> node) {
        if (node == null) {
            System.out.println("空二叉树");
            System.exit(-1);
        }
        this.printNode(node);
        if (node.getLeftNode() != null) {
            this.preIterator(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            this.preIterator(node.getRightNode());
        }
    }

    public void midIterator(TreeNode<String> node) {
        if (node == null) {
            System.out.println("空二叉树");
            System.exit(-1);
        }
        if (node.getLeftNode() != null) {
            this.midIterator(node.getLeftNode());
        }
        this.printNode(node);
        if (node.getRightNode() != null) {
            this.midIterator(node.getRightNode());
        }
    }

    public void postIterator(TreeNode<String> node) {
        if (node == null) {
            System.out.println("空二叉树");
            System.exit(-1);
        }
        if (node.getLeftNode() != null) {
            this.postIterator(node.getLeftNode());
        }
        if (node.getRightNode() != null) {
            this.postIterator(node.getRightNode());
        }
        this.printNode(node);
    }

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        TreeNode<String> node = binaryTree.init();
        System.out.println("先序遍历的情况");
        binaryTree.preIterator(node);
        System.out.println("\n中序遍历的情况");
        binaryTree.midIterator(node);
        System.out.println("\n后序遍历的情况");
        binaryTree.postIterator(node);

    }
}
