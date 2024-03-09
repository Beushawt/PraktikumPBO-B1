public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket){
    int tiketTersedia = 100;
    assert (jumlahTiket > 0):"Jumlah pemesanan harus lebih dari 0";
    assert (jumlahTiket <= tiketTersedia):"Jumlah pemesanan tidak boleh melebihi tiket yang tersedia";
    System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }
    public static void isEWallet(int EWallet){
        assert (EWallet >= 1 && EWallet <= 4) : "Plihan e-walled tidak valid";
        assert (!getEWallet(EWallet).isEmpty()):  "Indeks e-wallet tidak valid";
        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }

	private static String getEWallet(int index) {
		switch (index) {
			case 1:
       		return "OVO";
			case 2:
       		return "GoPay";
			case 3:
       		return "DANA";
			case 4:
       		return "LinkAja";
			default:
       		return "";
		}
    }
}   
