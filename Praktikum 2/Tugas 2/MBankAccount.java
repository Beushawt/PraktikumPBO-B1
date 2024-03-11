public class MBankAccount {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000) ;
        
        System.out.println("Saldo sebelum transaksi: " + account.getBalance());

        account.deposit(500);
        System.out.println("Deposit sejumlah 500.0 berhasil. Saldo saat ini: " + account.getBalance());
        account.withdraw(200);
        System.out.println("Deposit sejumlah 200.0 berhasil. Saldo saat ini: " + account.getBalance());
        System.out.println("Saldo setelah transaksi: " + account.getBalance());

    }
}