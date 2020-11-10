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
public class Motorcycle implements Vehicle
{
  @Override
  public Integer getNumberOfSeats()
  {
    return 1;
  }
 
  @Override
  public Integer getNumberOfWheels()
  {
    return 2;
  }
 
  @Override
  public String getVehicleType()
  {
    return "Motorcycle";
  }
 
  @Override
  public Integer getNumberOfDoors()
  {
    return null;
  }
}