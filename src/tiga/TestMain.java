public class TestMain {
    public static void main(String[] args) {
        // Membuat objek akun a1 dengan saldo awal 88
        Account a1 = new Account("A101", "Ligma", 88);
        // Menampilkan representasi string dari objek a1
        System.out.println(a1);

        // Membuat objek akun a2 dengan saldo awal 0
        Account a2 = new Account("A102", "Deezma", 0);
        // Menampilkan representasi string dari objek a2
        System.out.println(a2);

        // Menampilkan ID, nama, dan saldo dari objek a1
        System.out.println("ID: " + a1.getID());
        System.out.println("Name: " + a1.getName());
        System.out.println("Balance: " + a1.getBalance());

        // Menambah saldo akun a1 sebesar 100
        a1.credit(100);
        System.out.println(a1);

        // Mengurangi saldo akun a1 sebesar 50
        a1.debit(50);
        System.out.println(a1);

        // Mengurangi saldo akun a1 sebesar 500 (melebihi saldo)
        a1.debit(500);
        System.out.println(a1);

        // Mentransfer saldo dari akun a1 ke akun a2 sebesar 100
        a1.transferTo(a2, 100);
        System.out.println(a1);
        System.out.println(a2);
    }
}