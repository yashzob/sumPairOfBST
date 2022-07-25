/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.greatlearning.service.sumpairofbst;

import java.util.Scanner;

/**
 *
 * @author DELL
 */


public class SumPairOfBST {

    public static void main(String[] args) {
        bst a=new bst();
        Node root=null;
        root = a.insert(root, 8);
        root = a.insert(root, 3);
        root = a.insert(root, 6);
        root = a.insert(root, 10);
        root = a.insert(root, 4);
        root = a.insert(root, 7);
        root = a.insert(root, 1);
        root = a.insert(root, 14);
        root = a.insert(root, 13);
        System.out.println("hello"+root.left.right.right.data);
        
        //int[] BSTarray =inorder(root); 
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the target sum");
        int target = sc.nextInt();
        int[] array = new int[9];
        int index =0 ;
         int[] inorderArray = a.inorder(root, array, index);
        for(int i=0; i<inorderArray.length;i++){
            System.out.println(inorderArray[i]);
        }
        
        
    }

}
