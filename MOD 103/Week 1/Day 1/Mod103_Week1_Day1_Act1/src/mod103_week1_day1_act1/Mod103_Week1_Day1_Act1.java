/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod103_week1_day1_act1;

public class Mod103_Week1_Day1_Act1 {

    /**
     * @param args the command line arguments
     */
   
    
    
    public static void main(String[] args) {
        Vehicle ve = new Vehicle();
        System.out.println(ve.word);
        
        Bicycle bi = new Bicycle();
        System.out.println(bi.word);
        
        PoweredVehicle po = new PoweredVehicle();
        System.out.println(po.word);
        
    }
}
class Vehicle{
        String word = "something";
    };
    
    class Bicycle extends Vehicle{

    };
    
    class PoweredVehicle extends Vehicle{
        
    }; 