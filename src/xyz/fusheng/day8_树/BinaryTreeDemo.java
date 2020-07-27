package xyz.fusheng.day8_树;

/**
 * @FileName: BinarySearchTreeDemo
 * @Author: code-fusheng
 * @Date: 2020/7/24 20:58
 * @version: 1.0
 * Description: 二叉查找树
 */

public class BinaryTreeDemo<Key extends Comparable<Key>, Value> {

    /**
     * 二叉树，指向根结点
     */
    private Node tree;

    /**
     * 二叉树维护的 node 结点对象
     */
    private static class Node {
        private int value;
        private Node left;
        private Node right;

        protected Node(int value, Node left, Node right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }


}
