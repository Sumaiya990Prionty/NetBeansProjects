/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author Black Widow
 * 
 */
class Sum
    { 
        int add(int a,int b){
      System.out.println(a+b);
            return 0;
        }
        void name(String a)
       {
            System.out.println(a); 
           
       }
    }
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Sum b = new Sum();
        int l,k;
        Scanner in = new Scanner(System.in);
        l=in.nextInt();
        k = in.nextInt();
        b.add(l,k);
        b.name("Syeda");
    }
    
}
