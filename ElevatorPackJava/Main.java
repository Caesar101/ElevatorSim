// Author: Cesario Garcia
// Purpose: Simulate operation of Elevator
// Prerequisites: Elevator.java

package ElevatorPackJava; 

//utilized open source resources
import java.io.*;
import java.util.Scanner;


// Elevator Sim

public class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
  

    Elevator e = new Elevator(); // create object of elevator
   

      //User is notified of open door and floor number in image
      e.openDoor();
    // Get user input for destination
    System.out.println("Which Floor: ");
    Scanner s = new Scanner(System.in);
    int dest = s.nextInt();
    //Use user input to call pressButton method
      e.pressButton(dest);
      e.moveElevator(); // elevator can now move to destination floor
    //Post move method, user is notified of their destination
    System.out.println("You Made it to Floor: " + e.currentFloor);
    
  }
}
