/*Nama: Sarah Teguh Kinanti Situmeang
  NIM : 24060122120032
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArmadaKendaraan {
    private List<Vehicle> armada = new ArrayList<>();

    public void tambahArmada(Collection<? extends Vehicle> koleksi) {
        armada.addAll(koleksi);
    }

    public List<Vehicle> getAllArmada() {
        return armada;
    }
}