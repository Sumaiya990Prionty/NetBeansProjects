
package factorial;

import java.util.Scanner;

/**
 *
 * @author Black Widow
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int i,num,fact=1;
        System.out.println("Give a Positive number : ");
       Scanner in = new Scanner(System.in);
       num = in.nextInt();
       for(i=num;i>0;i--)
       {
          fact = fact*i; 
       }
        System.out.println(fact);
}
    
}
