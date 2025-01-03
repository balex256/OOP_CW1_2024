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
public class SwitchStatement {
    public static void main(String [] args){
        Scanner save = new Scanner(System.in);
        
        System.out.println("Welcome To MTN Mobile Money. \n \t\t Select MoMo Services\n 1. Send Money.\n 2. Airtime/Internet.\n 3. WIthdraw Money.\n 4. Payments.");
        int option = save.nextInt();
        switch(option){
            case 1 : 
                System.out.println("Selected Send Money.");
                System.out.println("Enter Phone Number for the Receiver.");
                String phone = save.next();
                System.out.println("Enter Money to Send.");
                int amount = save.nextInt();
                System.out.println("Confirm with your  PIN.");
                int pin = save.nextInt();
                if(pin ==12345){
                    System.out.println("Successfuly Sent " + amount + " to " + phone);
                }
                else{
                    System.out.println("Wrong PIN, Try again.");
                }
             break;
             
            case 2 :
                System.out.println("Selected Airtime / Internet.");
                
             break;
             
            case 3 :
                System.out.println("Selected Withdraw Money."); 
                System.out.println("Enter Money to withdraw.");
                int withdraw = save.nextInt();
                System.out.println("Confirm with your  PIN.");
                int pin2 = save.nextInt();
                if(pin2 ==12345){
                    int amount2 = 500000;
                    int balance = amount2 - withdraw;
                    System.out.println(withdraw + " was Successfully withdrawn, you ccurent balnce  is " + balance );
                }
                else{
                    System.out.println("Wrong PIN, Try again.");
                }
             break;
             
            case 4:
                System.out.println("Selected Payments");
                break;
            default :
                System.out.println("Entered Wrong Option.");
                    
        }
        
    }
    
}
