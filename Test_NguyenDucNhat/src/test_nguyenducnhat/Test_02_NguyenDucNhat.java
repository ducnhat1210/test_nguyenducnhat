/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_nguyenducnhat;

import java.util.Scanner;

/**
 *
 * @author DucNhat
 */
public class Test_02_NguyenDucNhat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ban muon nhap vao bao nhieu phan tu: ");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Phan tu thu " + i + ":");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        int total=(n+1)*n/2;
       
        for(int i=0;i<n;i++){
            total=total-arr[i];
        }
        System.out.println(total);
    }

}
