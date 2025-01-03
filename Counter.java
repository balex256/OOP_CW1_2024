
package vu.wkdapp;
import java.util.Scanner;

public class Counter {
    public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        
        System.out.println("Enter the Number of Counts");
        int count = save.nextInt();
        
        
        System.out.println("Enter the  Maximum Value");
        int max = save.nextInt();

        
        while(count <= max){
            if(count%2 ==1){                
             System.out.println(count);
             
            }
            count++;
        }
    
    }
}