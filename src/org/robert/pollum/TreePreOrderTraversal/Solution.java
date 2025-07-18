package org.robert.pollum.TreePreOrderTraversal;

import java.util.*;
import java.nio.charset.*;
import java.util.stream.*;;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            //Parse Input data
            byte[] inputData = System.in.readAllBytes();
            String input = new String(inputData, Charset.defaultCharset());
            List<String> inputList = Arrays.asList(input.lines().collect(Collectors.toList()).get(1).split("\s"));
            
            BinarySearchTree tree = new BinarySearchTree();

            for(int i = 0; i < inputList.size(); i++) {
                
                tree.insert(Integer.valueOf(inputList.get(i)));
            }
            System.out.print(tree.preOrder());
        } catch(Exception e) {
            System.out.println("Input broken");
        }
    }

}


class Node {
    int key;
    Node left, right;
    
    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node node;
    
    public BinarySearchTree() {
        node = null;
    }
    
    void insert(int value) {
        node = insertValue(node, value);
    }
    
    Node insertValue(Node currentNode, int value) {
        if(currentNode == null) {
            currentNode = new Node(value);
            return currentNode;
        }
        
        if(value < currentNode.key) {
            currentNode.left = insertValue(currentNode.left, value);
        } else if (value > currentNode.key) {
            currentNode.right = insertValue(currentNode.right, value);
        }
        
        return currentNode;
    }
    
    String preOrder() {
        return traverseInPreOrder(node);
    }
    
    String traverseInPreOrder(Node currentNode) {
        if(currentNode == null) {
            return "";
        } 
        return currentNode.key + " " + traverseInPreOrder(currentNode.left) + traverseInPreOrder(currentNode.right);
    }
}