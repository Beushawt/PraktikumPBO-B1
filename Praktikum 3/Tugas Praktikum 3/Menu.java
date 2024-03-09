public class Menu {
    private String nama;
    private double harga;
    private int stok;

    public Menu(String nama, double harga, int stok){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public double getHarga(){
        return harga;
    }

    public void setHarga(double harga){
        this.harga = harga;
    }

    public int getStok(){
        return stok;
    }

    public void setStock(int stok){
        this.stok = stok;
    }

    public void kurangiStok(int jumlah) throws JumlahPesananMelebihiStokException {
        if (jumlah > stok) {
            throw new JumlahPesananMelebihiStokException("Jumlah pesanan melebihi stok yang tersedia.");
        }
        stok -= jumlah;
    }
}
