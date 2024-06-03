/*Nama: Sarah Teguh Kinanti Situmeang
  NIM : 24060122120032
 */

 class SeaPlane extends Airplane {
    public SeaPlane() {
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
        return "SeaPlane dapat take-off dan mendarat di perairan laut";
    }
}

