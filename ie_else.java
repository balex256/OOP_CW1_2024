/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.wkdapp;

/**
 *
 * @author user
 */
import java.util.*;
public class ie_else {
    public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        System.out.println("Enter the Marks for SST");
        double marks = save.nextDouble();
        
        //Using if else if and else
        
        if(marks >= 90){
            System.out.println("Grade is A+");
        }
        else if(marks >= 80){
            System.out.println("Grade is A");
        }
        else if(marks >= 70){
            System.out.println("Grade is B");
        }
        else if(marks >= 60){
            System.out.println("Grade is C");
        }
        else if(marks >= 50){
            System.out.println("Grade is D");
        }
        else {
            System.out.println("Grade is F");
        }
        
    }
    
}
