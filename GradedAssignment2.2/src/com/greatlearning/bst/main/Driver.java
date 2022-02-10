package com.greatlearning.bst.main;

import com.greatlearning.bst.service.Node;
import com.greatlearning.bst.service.Transaction;

class Driver{

   
    // Driver Code
    public static void main (String[] args)
    {
    	Transaction tree = new Transaction();
    	tree.node = new Node(50);
    	tree.node.left = new Node(30);
    	tree.node.right = new Node(60);
    	tree.node.left.left = new Node(10);
    	tree.node.right.left= new Node(55);
       
        
        int order = 0;
        tree.binaryToSkewed(tree.node, order);
        tree.rightSkewed(tree.headNode);
    }
}