/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wanchana.cpe4235_home_work;

import java.util.Scanner;

/**
 *
 * @author wanchana
 */
public class EvenNumber {
    public static void main(String[] args) {
        int number,sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number : ");
        number = scan.nextInt();
        
        System.out.print("Even number are : ");
        for(int j=1;j<=number;j++){
            if(j%2 == 0){
                System.out.print(j + " ");
            }
            if(j%3 == 0){
                sum++;
            }
            
        }
        System.out.println();
        
        System.out.print("The number that devide by 3 are : ");
        for(int k=1;k<=number;k++){
            if(k%3 == 0){
                System.out.print(k + " ");
                
                
            }
            else{
                continue;
            }
        }
        System.out.println("\n" + sum);
    }
    
}