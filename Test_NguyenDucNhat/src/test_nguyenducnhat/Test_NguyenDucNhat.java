/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_nguyenducnhat;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DucNhat
 */
public class Test_NguyenDucNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ban muon nhap vao bao nhieu phan tu: ");
        Scanner sc = new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        for(int i=0;i<n;i++){
            System.out.println("Phan tu thu "+i+":");
            arr[i]= sc.nextLine();
        }
        int size = arr.length;
        if (size == 0){
          System.out.println(""); 
        }
        // The longest common prefix of an array containing 
        // only one element is that element itself.
        else if (size == 1){
          System.out.println(arr[0]);
        }
        else{
          // Sort the array
           Arrays.sort(arr);
           int length = arr[0].length();
           StringBuilder res = new StringBuilder();
           // Comapre the first and the last strings character
           // by character.
           for(int i = 0; i < length; i++){
             // If the characters match, append the character to the result.
             if(arr[0].charAt(i) == arr[size - 1].charAt(i)){
               res.append(arr[0].charAt(i));
             }
             // Else, stop the comparison.
             else{
               break;
             }
           }
           String result = res.toString();
           System.out.println(result);
        }
        
    }
    
}
