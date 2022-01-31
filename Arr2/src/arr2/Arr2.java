/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arr2;

import java.util.Scanner;

/**
 *
 * @author Black Widow
 */
public class Arr2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        int i ;
        for(i=0;i<n;i++)
        {
           a[i] = sc.nextInt();
        }
        System.out.println("xxxxxx");
        for(i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
    
}
