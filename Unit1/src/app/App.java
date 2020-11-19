package app;

import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        int targetNum = 72;
        boolean isFinished = false;

        while (isFinished == false) {
        

             System.out.println("Guess a number between 0 and 100");
             int guess = input.nextInt();
             input.nextLine();

             if (guess == targetNum) {
                 System.out.println("Correct");
                 isFinished = true;

             }

             else if (guess < targetNum) {
                 System.out.println("Low");

             }

             else {
                 System.out.println("High");


             }
            }

        }

    
    
    
    
    
        


}

}


    
