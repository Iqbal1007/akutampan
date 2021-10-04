package com.iqbal.topik01.soal01;

class Barang{
    private final String idProduct;
    private final String nama;
    private double harga;

    Barang(String idProduct, String nama, double harga){
        this.idProduct = idProduct;
        this.nama = nama;
        this.harga = harga;
    }

    Barang(String idProduct, String nama){
        this.idProduct = idProduct;
        this.nama = nama;
    }

    void setHarga(double harga){
        this.harga = harga;
    }

    String getIdProduct(){
        return this.idProduct;
    }

    String getNama(){
        return this.nama;
    }

    double getHarga(){
        return harga;
    }

    void display(){
        System.out.println("Id Product : " + getIdProduct());
        System.out.println("Nama : " + getNama());
        System.out.println("Harga : " + getHarga() + "\n");
    }
}
public class Main {
    public static void main(String[] args) {

        Barang dataBarang1 = new Barang("BRG-001", "Tas Gucci");
        dataBarang1.setHarga(1200);
        dataBarang1.display();

        Barang dataBarang2 = new Barang("BRG-002", "Printer Epson L355");
        dataBarang2.setHarga(200);
        dataBarang2.display();

        Barang dataBarang3 = new Barang("BRG-003", "Koper", 150);
        dataBarang3.display();

        Barang dataBarang4 = new Barang("BRG-004", "Helm", 20);
        dataBarang4.display();

        double barang1 = dataBarang1.getHarga();
        double barang2 = dataBarang3.getHarga();
        double barang3 = dataBarang4.getHarga();
        double totalHarga = barang1 + barang2 + barang3;
        System.out.println("Total Harga = " + totalHarga);
    }
}

