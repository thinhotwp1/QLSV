/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String choose = null;
        boolean exit = false;
        
        showMenu();
        while(true){
            choose = scanner.nextLine();
            switch(choose){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;    
                case "5":
                    break;    
                case "6":
                    break;
                case "0":
                    System.out.println("Bye Bye !!!");
                    exit = true;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }   
                if(exit){
                    break;
                }
                showMenu();    
        }
 
    }
    public static void showMenu(){
            System.out.println("----------MENU-----------");
            System.out.println("1. Add student.");
            System.out.println("2. Edit student by id.");  
            System.out.println("3. Delete student by id.");
            System.out.println("4. Sort student by gpa.");
            System.out.println("5. Sort student by name.");
            System.out.println("6. Show student.");
            System.out.println("0. Exit.");
            System.out.println("--------------------------");
            System.out.println("Please choose your choice:");
        }
}
