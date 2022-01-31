/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package light1;

import java.util.Scanner;

/**
 *
 * @author Black Widow
 */
public class Light1 {

    /**
     * @param args the command line arguments
     */
     long distance (int lightspeed,long seconds)
    {   Scanner in = new Scanner(System.in); 
        long days=in.nextInt();
         seconds = days*24*60;
        long d = lightspeed*seconds;
         System.out.println(d);
         return 0;
    }
      
    
    public static void main(String[] args) {
        // TODO code application logic here
        
    
    Light1 b = new Light1();
    b.distance(186000, 1000);
    int a ,l;
     Scanner j = new Scanner(System.in);
     a = j.nextInt();
     l = j.nextInt();
       /** System.out.print(a);  
        System.out.print(">");
        System.out.print(l );**/
        System.out.println( "%f>%f"+(a>l));
     
    }
    
}
