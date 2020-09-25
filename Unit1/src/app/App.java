package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
<<<<<<< HEAD
        int count = 0;
        String color = "blue";
        boolean sport = true;

    while (count < 10) {
            
        System.out.println("The count is " + count);
        count = count + 1;
        }
        
        System.out.println("count finished");
    
    while (color == "blue"){
       System.out.println("The color is " + color);
       color = "purple";
    
    }

        System.out.println("Color finished");
    
    while (sport == true)
        System.out.println("The statment is " + sport);
        sport = "false";

    System.out.println("sport finished");



}
=======
      

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





>>>>>>> 92eaed87ffa38a8a1e2c2c54e8581bbe455ee415




<<<<<<< HEAD






}
=======
}
>>>>>>> 92eaed87ffa38a8a1e2c2c54e8581bbe455ee415
