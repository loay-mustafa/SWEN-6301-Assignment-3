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
public class Car implements Vehicle
{
  @Override
  public Integer getNumberOfSeats()
  {
    return 5;
  }
 
  @Override
  public Integer getNumberOfWheels()
  {
    return 4;
  }
 
  @Override
  public String getVehicleType()
  {
    return "Car";
  }
 
  @Override
  public Integer getNumberOfDoors()
  {
    return 4;
  }
  
}