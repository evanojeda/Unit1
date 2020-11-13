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

                


}
