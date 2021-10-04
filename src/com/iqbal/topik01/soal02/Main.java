package com.iqbal.topik01.soal02;

class Buku{
    String judul;
    String pengarang;
    double harga;

    Buku(String judul, String pengarang, double harga){
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    String getJudul() {
        return judul;
    }
    String getPengarang() {
        return pengarang;
    }
    double getHarga() {
        return harga;
    }

}
public class Main {
    public static void main(String[] args) {

        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 300000);
        Buku buku2 = new Buku("UML", "Ivar Jacobson", 400000);

        System.out.println(buku1.getJudul());
        System.out.println(buku1.getPengarang());
        System.out.println(buku1.getHarga());

        System.out.println(buku2.getJudul());
        System.out.println(buku2.getPengarang());
        System.out.println(buku2.getHarga());

    }
}
