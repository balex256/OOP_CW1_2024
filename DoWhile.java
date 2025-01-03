/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vu.wkdapp;

/**
 *
 * @author user
 */
public class DoWhile {
    public static void main(String [] args){
        int count =0;
        int max = 15;
        
        do {
            if(count%2==1){
                
            System.out.print(count + "," );
            }                        
            count++;
        }
        while(count <= max);
    }
    
}

