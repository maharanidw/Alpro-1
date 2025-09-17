package praktikumalpro;

import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        try (//        for (inisialisasi; kondisi; step nilai){
//        aksi
//    }
//          System.out.println("Ini adalah awal dari program");
//          System.out.println("loop pertama");
//          
//          for(int i = 1; i < 10; ){
//              System.out.println("for loop ke-" + i);
//              i++;
//          
//          }
//          System.out.println("loop kedua");
//          
//          for(int i = 9; i >= 4; i--){
//              System.out.println("for loop ke-" + i);
//          
//          }
//        while(kondisi) {
//            aksi
//        }
//          int nilaiAwal, nilaiAkhir, total;
//          
//          System.out.print("Masukan nilai awal = ");
//          Scanner input = new Scanner(System.in);
//          nilaiAwal = input.nextInt();
//          System.out.print("Masukan nilai akhir = ");
//          nilaiAkhir = input.nextInt();
//          
//          total = 0;
//          
//          while(nilaiAwal < nilaiAkhir) {
//              nilaiAwal++;
//              total = nilaiAwal + total;
//              System.out.println("Ditambah " + nilaiAwal + " Menjadi " + total);
//              
//          }
//
                Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih operasi yang ingin dilakukan:");
            System.out.println("1. Menghitung Luas Persegi Panjang");
            System.out.println("2. Menghitung Luas Persegi");
            System.out.println("3. Menghitung Volume Balok");
            System.out.println("4. Menghitung Volume Kubus");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1 -> {
                    System.out.print("Masukkan panjang: ");
                    double panjang = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebar = scanner.nextDouble();
                    double luasPersegiPanjang = panjang * lebar;
                    System.out.println("Luas Persegi Panjang: " + luasPersegiPanjang);
                }
                case 2 -> {
                    System.out.print("Masukkan sisi: ");
                    double sisi = scanner.nextDouble();
                    double luasPersegi = sisi * sisi;
                    System.out.println("Luas Persegi: " + luasPersegi);
                }
                case 3 -> {
                    System.out.print("Masukkan panjang: ");
                    double panjangBalok = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double lebarBalok = scanner.nextDouble();
                    System.out.print("Masukkan tinggi: ");
                    double tinggiBalok = scanner.nextDouble();
                    double volumeBalok = panjangBalok * lebarBalok * tinggiBalok;
                    System.out.println("Volume Balok: " + volumeBalok);
                }
                case 4 -> {
                    System.out.print("Masukkan sisi: ");
                    double sisiKubus = scanner.nextDouble();
                    double volumeKubus = sisiKubus * sisiKubus * sisiKubus;
                    System.out.println("Volume Kubus: " + volumeKubus);
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }
}

          
    

