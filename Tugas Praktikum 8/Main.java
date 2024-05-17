/* Nama : Sarah Teguh Kinanti Situmeang
   NIM  : 24060122120032
 */

 public class Main {
    public static void main(String[] args) {
    Ulat K = new Ulat();
    Data<Kupu> anu = new Data<>();

    anu.setIsi(K);
    anu.getIsi().gerak();

    anu.setIsi(new Kepompong());
    anu.getIsi().gerak();

    anu.setIsi(new KupuDewasa());
    anu.getIsi().gerak();
    }   
}
