/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5;

/**
 *
 * @author ASUS GAMING PC
 */
public class MountainTruck extends Truck{
    //the MountainTruck subclass adds one field
    public int seatHeight;
    // MountainTruck subclass has one constructor
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
        super(startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    // the mountaintruck subclass adds one methof
    public void setHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] args) {
        System.out.println("Mulai berjalan");
        MountainTruck pengenbeli = new MountainTruck(0,0,0,0);
        System.out.println("gear = "+pengenbeli.gear);
        System.out.println("speed = "+pengenbeli.speed);
        pengenbeli.setGear(2);
        System.out.println("gear = "+pengenbeli.gear);
        System.out.println("speed = "+pengenbeli.speed);
        pengenbeli.speedup(2);
        System.out.println("gear = "+pengenbeli.gear);
        System.out.println("speed = "+pengenbeli.speed);
       
    }
}
