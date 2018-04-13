package com.company;
    public class Treenode {
        int value;
        Treenode left;
        Treenode right;

        public Treenode(int value, Treenode left, Treenode right) {
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

        public Treenode getLeft() {
            return left;
        }

        public void setLeft(Treenode left) {
            this.left = left;
        }

        public Treenode getRight() {
            return right;
        }

        public void setRight(Treenode right) {
            this.right = right;
        }
}
