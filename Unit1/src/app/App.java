package app;

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        String password = "dalvincooks33";
        int tries = 0;
        boolean secretMessageGiven = false;
        
        while (tries < 3) {
            if (secretMessageGiven == false) {
                System.out.println("Enter the password");
                String enteredpassword = input.nextLine();
                
                 if (enteredpassword.equals(password)) {
                     System.out.println("Access Granted");
                     System.out.println("Dont forget to eat your crust");
                     secretMessageGiven = true; }

                else {
                    System.out.println("Access Denied");
                    tries++;
                    System.out.println("You have " + (3 - tries) + " Attempts Remaining");
                }
            }
        }
    if (tries== 3) {
        System.out.println("Too many attempts");
    }

}

}


    
