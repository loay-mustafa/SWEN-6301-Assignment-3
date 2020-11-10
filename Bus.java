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
public class Bus implements Vehicle
{
 
  @Override
  public Integer getNumberOfSeats()
  {
    return 35;
  }
 
  @Override
  public Integer getNumberOfWheels()
  {
    return 6;
  }
 
  @Override
  public String getVehicleType()
  {
    return "Bus";
  }
 
  @Override
  public Integer getNumberOfDoors()
  {
    return 2;
  }
}