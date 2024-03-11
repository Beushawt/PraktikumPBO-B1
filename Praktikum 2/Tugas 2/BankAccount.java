public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        balance = initialBalance;
    }

    public void deposit(double jumlah){
        if (jumlah > 0){
            balance += jumlah;
        }else{
            System.out.println("Jumlah deposit harus lebih dari 0.");
        }
    }

    public void withdraw (double jumlah){
        if (jumlah > 0){
            if (jumlah <= balance){
                balance -= jumlah;
            }else{
                System.out.println("Saldo anda tidak mencukupi untuk melakukan penarikan uang.");
            }
        } else{
            System.out.println("Jumlah penarikan harus lebih dari 0.");
        }
    }

    public double getBalance(){
        return balance;
    }
}

