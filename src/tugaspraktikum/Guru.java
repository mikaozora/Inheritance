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
public class Guru {
    private String guru;
    private String matpel;
    Scanner mahal = new Scanner(System.in);
    Scanner mehong = new Scanner(System.in);
    public void guru(String nama, String matpel){
        System.out.print("Nama guru adalah ");
        this.guru = nama = mahal.nextLine();
        System.out.print("Mata pelajarannya adalah ");
        this.matpel = matpel = mehong.nextLine();
        
    }
    public void data(){
        System.out.println("Nama guru adalah "+this.guru);
        System.out.println("Mata pelajarannya adalah "+this.matpel);
    }
}
