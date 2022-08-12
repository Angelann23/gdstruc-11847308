package com.quiz6.Trees;

public class Tree {
    private Node root;


    public void insert(int value){
        if (root == null)
        {
            root = new Node(value);
        }
        else{
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if(root != null){
            root.traverseInOrder();
        }
    }

    public void reverseTraverseInOrder()
    {
        if(root != null){
            root.reverseTraverseInOrder();
        }
    }

    public Node get(int value){
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }
    public void getMax() {

        System.out.println("Maximum: " + root.getMax(root));

    }

    public void getMin() {

        System.out.println("Minimum: " + root.getMin(root));

    }
}
