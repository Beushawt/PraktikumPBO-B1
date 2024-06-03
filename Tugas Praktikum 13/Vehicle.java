/*Nama: Sarah Teguh Kinanti Situmeang
  NIM : 24060122120032
 */

public abstract class Vehicle {
    public abstract  double calcFuelEfficiency();
    public abstract double calcTripDistance();

    public String toString(){
        return this.getClass().getSimpleName();
    }
}