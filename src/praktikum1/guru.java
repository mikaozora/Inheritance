/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

import java.util.Scanner;

/**
 *
 * @author ASUS GAMING PC
 */
public class guru {
    Scanner kecil = new Scanner(System.in);
    Scanner besar = new Scanner(System.in);
    private String nama[];
    int n;
    public void lala(){
        for (int i = 1; i < n+1; i++) {
            System.out.print("Nama "+i+" = ");
            nama[i] = besar.next();
        }
    }
    public void cetak(){
        System.out.print("Jumlah guru yang diinginkan = ");
        n = kecil.nextInt();
    }
    public void tampilkansemua(){
        System.out.println("Nama guru yang anda inginkan adalah ");
    }
}
