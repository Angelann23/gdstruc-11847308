package com.quiz6.Trees;

public class Node {
    private int data;
    private Node rightChild;
    private Node leftChild;

    private int leftMax, rightMax;
    private int leftMin, rightMin;
    private int max, min;
    public Node get(int value){
        if(value == data){
            return this;
        }

        if (value < data){
            if (leftChild != null){
                return leftChild.get(value);
            }
        }
        else{
            if (rightChild != null){
                return rightChild.get(value);
            }
        }

        return null;
    }

    public Node(int _data)
    {
        this.data = _data;
    }

    public void insert(int value)
    {
        if (value == data) // DUPLICATE DATA, RETURN
        {
            return;
        }

        if (value < data)  // LEFT CHILD
        {
            if (leftChild == null)
            {
                leftChild = new Node(value);
            }
            else
            {
                leftChild.insert(value);
            }
        }
        else
        {
            if (rightChild == null)
            {
                rightChild = new Node(value);
            }
            else
            {
                rightChild.insert(value);
            }

        }

    }

    public void traverseInOrder(){
        if (leftChild != null) {
            leftChild.traverseInOrder();
        }
        System.out.println("DATA: " + data);

        if (rightChild != null)
        {
            rightChild.traverseInOrder();
        }

    }

    public int getMax(Node temp) {
        max = temp.data;

        if(temp.leftChild != null) {
            leftMax = getMax(temp.leftChild);
            max = Math.max(max, leftMax);
        }

        if(temp.rightChild != null) {
            rightMax = getMax(temp.rightChild);
            max = Math.max(max, rightMax);
        }

        return max;
    }

    public int getMin(Node temp) {
        min = temp.data;

        if(temp.rightChild != null) {
            rightMin = getMin(temp.rightChild);
            min = Math.min(min, rightMin);
        }

        if(temp.leftChild != null) {
            leftMin = getMin(temp.leftChild);
            min = Math.min(min, leftMin);
        }

        return min;
    }

    public void reverseTraverseInOrder() {
        if(rightChild != null) {
            rightChild.reverseTraverseInOrder();
        }
        System.out.println("Data: " + data);

        if (leftChild != null) {
            leftChild.reverseTraverseInOrder();
        }
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;

    }


}
