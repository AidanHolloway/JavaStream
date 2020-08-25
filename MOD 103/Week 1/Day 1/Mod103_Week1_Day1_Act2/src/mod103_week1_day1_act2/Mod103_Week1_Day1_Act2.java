/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod103_week1_day1_act2;

import java.util.Scanner;

public class Mod103_Week1_Day1_Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanIt = new Scanner(System.in);
        
        System.out.println("Weighted item or counted item? Type either 'weight' or 'count'.");
        
        String choice = scanIt.next();
        
        
        
        if (choice.equalsIgnoreCase("weight")) {
            System.out.println("Enter weight(kg).");
            double mass = Double.valueOf(scanIt.next());
            
            weighedItem wei = new weighedItem(mass);
            System.out.println("R " + String.valueOf(wei.getPrice()));
        }
        
        if (choice.equalsIgnoreCase("count")) {
            System.out.println("Enter amount of items.");
            int count = Integer.valueOf(scanIt.next());
            
            countedItem counted = new countedItem(count);
            
            System.out.println("R " + String.valueOf(counted.getPrice()));
        }
        
    }
    
}

class purchaseItem{
    private String name;
    private double unitPrice;
    
    purchaseItem() {
        name = "no item";
        unitPrice = 0;
    }
    
    public double getPrice() {
        return this.unitPrice;
    }
    
}

class weighedItem extends purchaseItem{
    
    private double weight;
    
    public weighedItem(double weight) {
        super();
        this.weight = weight;
        
    }
    
    @Override
    public double getPrice() {
        return weight*super.getPrice();
    }
    
}

class countedItem extends purchaseItem{
    
    private int quantity; 
    
    public countedItem(int quantity) {
        super();
        this.quantity = quantity;
        
    }
    
    @Override
    public double getPrice() {
        return quantity*super.getPrice();
    }
    
}
