/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factrecur;

import java.util.Scanner;

/**
 *
 * @author Black Widow
 */
public class FactRecur {
    static int factRecur(int num)
    {
        if (num==0)
            return 1;
        else
            return (num*factRecur(num-1));
    }

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int fact =0;
        Scanner in = new Scanner(System.in);
        System.out.println("Give a Positive number : ");
        int num = in.nextInt();
         fact = factRecur(num);
    
    System.out.println(fact);
    }
}
