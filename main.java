/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle;

/**
 *
 * @author loay
 */

class Main{
  
  public static void main(String[] args) {
    Vehicle mycar = new Car();  
    Vehicle myBus = new Bus();  
    Vehicle myMotorcycle = new Motorcycle();  
    int x=mycar.getNumberOfSeats();
    int y=myBus.getNumberOfSeats();
    int z=myMotorcycle.getNumberOfSeats();
    int w=4;  
     System.out.println("Vehicle Type is : "+mycar.getVehicleType());
          System.out.println("Number Of Seats in car is : "+mycar.getNumberOfSeats());
          System.out.println("Number Of Wheels car is : "+mycar.getNumberOfWheels());
          System.out.println("Number Of Doors car is : "+mycar.getNumberOfDoors());
          
     System.out.println("Vehicle Type is : "+myBus.getVehicleType());
        System.out.println("Number Of Seats in Bus is : "+myBus.getNumberOfSeats());
        System.out.println("Number Of Doors Bus is : "+myBus.getNumberOfDoors());
        System.out.println("get Number Of Wheels Bus is : "+myBus.getNumberOfWheels());
        
     System.out.println("Vehicle Type is : "+myMotorcycle.getVehicleType());
         System.out.println("Number Of Seats in Motorcycle is : "+myMotorcycle.getNumberOfSeats());   
         System.out.println("get Number Of Wheels Motorcycle is : "+myMotorcycle.getNumberOfWheels());     
         System.out.println("Number Of Doors Motorcycle is : "+myMotorcycle.getNumberOfDoors());
         Car car1= new Car();
         loadGenerator carload= new loadGenerator();   
         
 // stamp coupling - happens when using another class as the type of the method parameter﻿ 
    // next code is exapmle of stamp coupling : the class loadGenerator couple with calss car by function generate
    System.out.println("load Of car is : "+carload.generate(car1));
     
    
// data coupling - happens when a function has got too many parameters (more than 3)
       // the function allseat in class loadGenerator is example of data coupling
          
          System.out.println("number of Drivers : "+carload.allseat(x,y,z,w));
  
         
  }
}

  
  
