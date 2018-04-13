package com.company;

public class OurTree {
    private Treenode root = null;
    private Treenode actual = null;
    private int size;

    private Treenode insertNode(Treenode node, int value) {
        if (node == null) {
            return new Treenode(value, null, null);
        }else {
            if  (node.getValue() > value){
                node.setLeft(insertNode(node.getLeft(), value));
                return node;
            }else if(node.getValue() < value){
                node.setRight(insertNode(node.getLeft(), value));
                return node;
            } else {
                return node;
            }
        }
    }

    public void insertNode(int value){
        if (root == null){
            root = new Treenode(value, null, null);
        } else {
            insertNode(root, value);
        }
    }
}
