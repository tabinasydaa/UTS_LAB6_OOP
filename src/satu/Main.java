//class
class Book{
    //variabel
    String title;
    String author;
    int year;
    double price;

    //constructor
    //untuk membuat objek Book dengan nilai awal yang diberikan
    public Book(String title, String author, int year, double price){
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    //method getter untuk mendapatkan nilai
    //untuk mengambil nilai dari variabel yang dimiliki oleh objek Book
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    //method overloading untuk mengatur nilai
    //untuk mengubah nilai dari variabel yang dimiliki oleh objek Book
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //method overriding
    //mencetak informasi lengkap tentang buku (judul, penulis, tahun terbit, harga)
    @Override
    public String toString() {
        return title + " oleh " + author + ", terbit tahun " + year + ", dengan harga " + price;
    }
}

public class Main {
    public static void main(String[] args) {
        //membuat objek Book dengan menggunakan construtor
        Book book1 = new Book("Laskar Pelangi", "Andrea Hirata", 2005, 50000.0);

        System.out.println("Buku pertama: ");
        //mencetak informasi buku pertama menggunakan method toString() yang sudah di-overriding
        System.out.println(book1);

        //method setter untuk mengubah nilai
        //mengubah nilai judul, penulis, tahun terbit, dan harga buku pertama
        book1.setTitle("Tenggelamnya Kapal Van Der Wijck");
        book1.setAuthor("Hamka");
        book1.setYear(1939);
        book1.setPrice(45000.0);

        System.out.println("\nBuku pertama setelah diubah:");
        //mencetak informasi buku pertama setelah diubah menggunakan method toString() yang sudah di-overriding
        System.out.println(book1);
        System.out.println(book1);

        //membuat objek buku kedua, ketiga, dan keempat dengan nilai yang sudah ditentukan
        Book book2 = new Book("Bumi Manusia", "Pramoedya Ananta Toer ", 1980, 80000.0);
        Book book3 = new Book("Perahu Kertas", "Dee Lestar", 2008, 55000.0);
        Book book4 = new Book("Laut Bercerita", "Leila S. Chudori", 2012, 75000.0);

        //mencetak informasi buku kedua, ketiga, dan keempat menggunakan method toString() yang sudah di-overriding
        System.out.println("\nBuku Selanjutnya: ");
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
    }
}