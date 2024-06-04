interface IDiskon{
    public double hitungDiskon(int harga);
}

public class DiskonLambda{
    public static void main(String[] args) {
        IDiskon diskonMerdeka = new IDiskon() {
            public double hitungDiskon(int harga){
                return harga-(harga*0.3);
            }
        };
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);

        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };
        System.out.println("Diskon Merdeka: "+diskonMerdeka.hitungDiskon(45000));
        System.out.println("Diskon Lebaran: "+diskonLebaran.hitungDiskon(45000));
        System.out.println("Diskon Biasa: "+diskonBiasa.hitungDiskon(45000));
    }
}

/*untuk diskon lebaran fungsi lambda digunakan pada diskonLebaran untuk 
mengeksekusi baris sederhana dan langsung  mengeluarkan output 
sementara fungsi lambda diskonBiasa menggunakan return atau pengembalian 
output yang menggunakan sintaks yang kompleks dan rumit*/ 