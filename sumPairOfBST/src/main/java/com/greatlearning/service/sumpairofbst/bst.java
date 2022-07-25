/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.greatlearning.service.sumpairofbst;

/**
 *
 * @author DELL
 */
public class bst {

    public Node insert(Node node, int val) {
        if (node == null) {
            return createNewNode(val);
        }
        if (val < node.data) {
            node.left = insert(node.left, val);

        } else if (val > node.data) {
            node.right = insert(node.right, val);
        }
        return node;
    }

    public int[] inorder(Node node,int[] array,int index ) { 
        if (node != null) {
            inorder(node.left,array,index);
            array[index++]= node.data;
            inorder(node.right,array,index);
        }   
        return array;
        
    }

    private Node createNewNode(int val) {
        Node a = new Node();
        a.data = val;
        a.left = null;
        a.right = null;
        return a;
    }

}
