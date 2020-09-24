package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first name.");
        String firstname = input.nextLine();
        
        System.out.println("Please enter your last name.");
        String lastname = input.nextLine();
        
        System.out.println("What is your age.");
        String age = input.nextLine();
        
        System.out.println("What grade are you in?");
        String grade = input.nextLine();
        
        System.out.println("Enter your favorite color");
        String color = input.nextLine();
        System.out.println("Hello ," + firstname + " " + lastname + ". " + age + " " + grade + " " + color + " ");
    }









}