// Author: Cesario Garcia
// Purpose: This class is used to simulate the elevator
// Includes button pressing, elevator movement, and elevator status
package ElevatorPackJava; 

public class Elevator { // Elevator class
    //declare variables
    public int currentFloor;
    public int destinationFloor;
    private boolean isMoving;
    private boolean isDoorOpen;

    public Elevator() { // Constructor
        currentFloor = 1;
        destinationFloor = 1;
        isMoving = false;
        isDoorOpen = false;
    }

    public void pressButton(int floor) { // Button Pressing method 
        destinationFloor = floor;
        isMoving = true;
     
    }

    public void openDoor() { // Simulate Open Door image with notice to user
        isDoorOpen = true;
        System.out.println("          *" + currentFloor+"*"); // used to update floor number in image 
        System.out.println("_____             _____");
        System.out.println("-----|           |-----");
        System.out.println("-----|           |-----");
        System.out.println("-----|           |-----");
        System.out.println("-----|           |-----");
        System.out.println("-----|           |-----");
        System.out.println("-----|           |-----");
        System.out.println("-----|           |-----");
        System.out.println("-----|           |-----");
        System.out.println("-----|           |-----");
        System.out.println("   ");

        System.out.println("Door is open");
    }

    public void closeDoor() { //simulate image of closed door
        isDoorOpen = false;
         System.out.println("          *" + currentFloor +"*"); // used to update floor number in image 
        System.out.println("________________________");
        System.out.println("___________||___________");
        System.out.println("___________||___________");
        System.out.println("___________||___________");
        System.out.println("___________||___________");
        System.out.println("___________||___________");
        System.out.println("___________||___________");
        System.out.println("___________||___________");
        System.out.println("___________||___________");
        System.out.println("___________||___________");
        System.out.println("   ");

    }

    public void moveElevator() { // simulate movement of elevator
        
        closeDoor(); // door closes prior to moving
        System.out.println("Door is now closed, Elevator Moving");
        System.out.println("   ");
        
        if (isMoving) {
            int j = destinationFloor;
            if (currentFloor < destinationFloor) { //update floor +1
                for(int i = currentFloor; i < j; i++){
                currentFloor++;
                    closeDoor();// give image of closed door with updated floor number
                }
            } else if (currentFloor > destinationFloor) { //update floor -1
                for(int i=currentFloor; i> j; i--){
                currentFloor--;
                    closeDoor(); // give image of closed door with updated floor number
                }
                
            } else {
                isMoving = false;
            }
            }

        openDoor();// door opens after moving
        
    }

 
  
}
