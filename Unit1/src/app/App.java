package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner input = new Scanner(System.in);

         System.out.println("Please enter a number");
         int num1 = input.nextInt();
         input.nextLine();

         System.out.println("Please enter a larger number");
         int num2 = input.nextInt();
         input.nextLine();


     

        

            for (int i = num1; i < num2; i++){
                System.out.println(i);
               
               
         
        }
            
   
    }
}