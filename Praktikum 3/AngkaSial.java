public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw  new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println(("hati-hati memasukkan angka!!!"));
        }
    }
}

/*pada baris 12 akan dieksekusi ketika mencoba 
angka 10 namun saat masuk ke try kedua yaitu angka 13 maka
baris 12 tidak akan dieksekusi melainkan langsung 
dilempar ke catch baris ke 23 dan mengeluarkan print out
yang ada di AngkaSialException lalu mengeksekusi catch
baris ke dua yang mengeluarkan "hati-hati memasukkan angka"*/