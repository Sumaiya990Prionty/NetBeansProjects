
package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    
    public static void main(String[] args) {
       char operator;
       double num1,num2;
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the operator : ");
        operator = input.next().charAt(0);
        System.out.println("Enter the Two Num : ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        input.close();
        switch(operator)
        {
            case '+':
                System.out.printf("%.1f+%.1f = %.1f", num1, num2,(num1+num2));
                break;
                 case '-':
                System.out.printf("%.1f-%.1f = %.1f", num1, num2,(num1-num2));
                break;
                 case '*':
                System.out.printf("%.1f*%.1f = %.1f", num1, num2,(num1*num2));
                break;
                 case '/':
                System.out.printf("%.1f/%.1f = %.1f", num1, num2,(num1/num2));
                break;
                 default:
                     System.out.printf("Invalid Case ");
                     
        }
        
    }
    
}
 
