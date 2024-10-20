#Cesario Garcia
#Purpose: Creates an elevator class for main.py
#Date: 10/11/2024

#create Elevator class
class Elevator:
  def __init__(self, Dest, Dir,Top,Bot,Cur):#constructor
    self.Destination = Dest #destination from user
    self.CurrentFloor =Cur #current floor
    self.Direction = Dir#determined direction from main
    self.TopFloor = Top#top floor from main
    self.BottomFloor = Bot#bottom floor from main
    
  def Move(self):#define method to move elevator
  ####elevator moves up
    if self.Direction == "up":
      for i in range(self.Destination - self.CurrentFloor):          #updates current floor using for loop
        self.CurrentFloor += 1
        if self.CurrentFloor == self.Destination:  
          print("beep")
          print("Elevator is at destination")
          print("Doors are now open")
          print("Please Exit")
        else:
          print("beep")
  ####elevator moves down
    else:
      for i in range(self.CurrentFloor - self.Destination): 
        #updates current floor using for loop
        self.CurrentFloor -= 1
        if self.CurrentFloor == self.Destination: 
          print("beep")
          print("Elevator is at destination")
          print("Doors are now open")
          print("Please Exit")
        else:
          print("beep")


 