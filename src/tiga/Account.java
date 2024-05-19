public class Account {
    private String id; // ID akun
    private String name; // Nama pemilik akun
    private int balance = 0; // Saldo akun, default 0

    // Konstruktor untuk membuat objek akun dengan ID, nama, dan saldo awal
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Konstruktor untuk membuat objek akun dengan ID, nama, dan saldo awal
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter untuk mendapatkan ID akun
    public String getID() {
        return id;
    }

    // Getter untuk mendapatkan nama pemilik akun
    public String getName() {
        return name;
    }

    // Getter untuk mendapatkan saldo akun
    public int getBalance() {
        return balance;
    }

    // Metode untuk menambah saldo akun
    public void credit(int amount) {
        balance += amount;
    }

    // Metode untuk mengurangi saldo akun, dengan pengecekan saldo cukup
    public void debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Metode untuk mentransfer sejumlah saldo ke akun lain
    public void transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.credit(amount);
        } else {
            System.out.println("Amount exceeded balance");
        }
    }

    // Metode untuk menghasilkan representasi string dari objek akun
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}