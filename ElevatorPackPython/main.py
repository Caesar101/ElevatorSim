#Cesario Garcia
#Purpose: Creates an elevator simulation
#Date: 10/11/2024
#Prerequistes: ElevatorClass.py file

#import Elevator Class and its methods
from ElevatorClass import Elevator

#Define Top and Bottom and Current Floor, 
#can use user input to define
#but to simplify the simulation will predefine
TFloor = 3
BFloor = -2
CFloor = 0

#Telling User Choices and Initial Condition
print("You are on floor 0 (Ground Floor).")
print("Destinations range between -2 and 3 floors")

#Obtain Destination from user
val = input("Enter Destination For Elevator: ")
val = int(val)

#in case input of floor does not exist
#or that destination given is ground floor 0
while val < BFloor or val > TFloor or val == CFloor:
  print("Invalid floor, input valid floor")
  val = input("Enter Destination For Elevator: ")
  val = int(val)

#direction of elevator determined
if val >CFloor:
  print("Elevator is going up")
  Dir = "up"

elif val < CFloor:
  print("Elevator is going down")
  Dir = "down"

#create obj of elevator using class contructor
elev = Elevator(val, Dir, TFloor, BFloor,CFloor)
#calling the move method from class file
elev.Move()

#####End of main script
