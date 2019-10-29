/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author ASUS GAMING PC
 */
public class DemoOverride {
    public static void main(String[] args) {
        B erak = new B();
        erak.setA(50);
        erak.setB(150);
        //memanggil method pada kelas B
        erak.tampilkanNilai();
    }
}
