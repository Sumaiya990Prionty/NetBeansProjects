/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;

import java.util.Arrays;

/**
 *
 * @author Black Widow
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    void bubbleSort(int m_days[])
    {
        for(int i=0;i<m_days.length;i++)
       {
          for(int j=0;j<m_days.length-i-1;j++)
          {
              if(m_days[j]>m_days[j+1])
                      {
                          int temp = m_days[j];
                          m_days[j] = m_days[j+1];
                          m_days [j+1]=temp;
                      }
              
          }
          
       }
    }
    void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
         
       int m_a[] ={6,5,8,9,7};
        JavaApplication18 ob = new JavaApplication18();
        ob.printArray(m_a);
        System.out.println("After Sort ");
        ob.bubbleSort(m_a);
        ob.printArray(m_a);
        
    }
     
     
       
    
}
