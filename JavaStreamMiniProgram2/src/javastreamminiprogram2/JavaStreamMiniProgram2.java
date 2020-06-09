/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastreamminiprogram2;

/**
 *
 * @author Aidan
 */
public class JavaStreamMiniProgram2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        welcome();
        multiply(5, 100);
        multiply(2, 3);
        multiply(6, 8);
        divide(20, 5);
        divide(100, 10);
        divide(66, 11);
    }
    
    public static void welcome(){
        System.out.println("Welcome to my calculator!");
    }
    
    public static void multiply(int a, int b){
        System.out.println(a*b);
    }
    
    public static void divide(int a, int b){
        System.out.println(a/b);
    }
    
}
