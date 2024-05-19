package Nomor3;

public class Account {
    private String id;
    private String name;
    private int balance;

    //konstruktor untuk membuat akun dengan saldo awal 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    //konstruktor untuk membuat akun dengan saldo awal yang ditentukan
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    //metode untuk mendapatkan ID akun
    public String getID() {
        return id;
    }

    //metode untuk mendapatkan nama pemilik akun
    public String getName() {
        return name;
    }

    //metode untuk mendapatkan saldo akun
    public int getBalance() {
        return balance;
    }

    //metode untuk menambahkan saldo akun (kredit)
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    //metode untuk mengurangi saldo akun (debit)
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Jumlah melebihi saldo");
        }
        return balance;
    }

    //metode untuk mentransfer saldo ke akun lain
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Jumlah melebihi saldo");
        }
        return balance;
    }

    //metode untuk representasi String dari objek Account
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}

