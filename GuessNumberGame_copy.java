/**
 * Auto Generated Java Class.
 * Found this. Most people seem to agree that using an extra method to check the numbers is pointless. Highest voted answer used the while(true) method.
 * http://stackoverflow.com/questions/22110876/creating-a-guessing-game
 */
import java.util.*;

public class GuessNumberGame {
  int computerValue, userValue, success, numberOfTries;
  
  public static void checkValue(int computerValue, int userValue){
        if (userValue == computerValue) {
          System.out.println("Congrats, you won! Your number of tries was: " + numberOfTries);
          break;
        } else if (userValue < computerValue) {
          System.out.println("Your value is too small.");
        } else if (userValue > computerValue) {
          System.out.println("Your guess was too high!");
        }
      }
  
  public static void main(String[] args) { 
//    int computerValue, userValue, success, numberOfTries;
    //Generate random number
    Scanner in = new Scanner(System.in);
    Random random = new Random();
    
    while(true) {
      int computerValue = random.nextInt(100)+1;
      int numberOfTries = 0;
      while (true) {
        System.out.println("Enter an integer between 1 and 100: ");
        int userValue = in.nextInt();
        numberOfTries++;
        
      }
    }
    checkValue(computerValue,userValue);
  }
  
  
    }

    
    
    
    //Ask user for input
//    System.out.println("I am thinking of a number between 0-100. Type your guess: ");
//    userValue = in.nextInt();
//    System.out.println("Your value is " + userValue);
    
    //If input is not within 1-100, tell them to input it again
    
    //If input is greater than random number, tell user it is too high and to try again
    
    //If input is less than random number, tell user it is to low and to try again
    
    //If input is correct, end the loop
   
    
//  }
  
  /* ADD YOUR CODE HERE */
  
//}