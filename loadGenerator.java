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
  class  loadGenerator{
    Car carload= new Car();
    public Integer generate(Car carload) {
        int d= (carload.getNumberOfSeats() * 100)-70;       
        return (int) (d);
    }
  
  public Integer allseat(int x,int y,int z,int w){
   int a= (x-4)+(y-33)+(z-1)+w;
   a=a*2;
      return a;
  }
  
  
  
  }



