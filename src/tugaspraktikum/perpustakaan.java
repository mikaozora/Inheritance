/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class perpustakaan extends Guru {
    private String perpus;
    private String karyawan;
    private int jumlah;
    Scanner mahal = new Scanner(System.in);
    Scanner murah = new Scanner(System.in);
    Scanner ahal = new Scanner(System.in);
    public perpustakaan(String perpus, String karyawan, int jumlah,String nama, String matpel){
        super.guru(nama, matpel);
        System.out.print("Nama buku adalah ");
        this.perpus = perpus = murah.nextLine();
        System.out.print("Nama karyawan adalah ");
        this.karyawan = karyawan = mahal.nextLine();
        System.out.print("Jumlah buku adalah ");
        this.jumlah = jumlah = ahal.nextInt();
    }
    public void data(){
        System.out.println("========================");
        System.out.println("Nama buku adalah "+this.perpus);
        System.out.println("Jumlah buku adalah "+this.jumlah);
        System.out.println("Nama Karyawan adalah "+this.karyawan);
        super.data();
    }
}
