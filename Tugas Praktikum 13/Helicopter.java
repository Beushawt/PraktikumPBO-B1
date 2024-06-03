/*Nama: Sarah Teguh Kinanti Situmeang
  NIM : 24060122120032
 */

 class Helicopter extends Airplane {
    public Helicopter() {
        super();
    }

    @Override
    public double calcFuelEfficiency() {
        return 0;
    }

    @Override
    public double calcTripDistance() {
        return 0;
    }

    @Override
    public String toString() {
        return "Helicopter hanya memerlukan landasan kecil";
    }
}

