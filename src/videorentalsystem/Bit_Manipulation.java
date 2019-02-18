/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videorentalsystem;

import java.util.Scanner;

/**
 *
 * @author Nitish Joshi
 */
public class Bit_Manipulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int set_bits = 0;
        int notset_bits = 0;
        System.out.println("Enter a binary number: ");
        String num = scan.next();
        
        char arr[] = num.toCharArray();
        for(int i = 0  ; i<arr.length ; i++)
        {
            if(arr[i] == '1')
            {
                set_bits++;
            }
            else
                notset_bits++;
        }
        System.out.println("No. of set bits is: "+set_bits);
        System.out.println("No. of not-set bits is: "+notset_bits);
    }
    
}
