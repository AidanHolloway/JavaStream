/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod103_week1_day3_act1;

public class Mod103_Week1_Day3_Act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape sha = new Shape();
        Circle cir = new Circle();
        Triangle tri = new Triangle();
        Square sqr = new Square();
        
        sha.draw();
        cir.draw();
        tri.draw();
        sqr.draw();
        
        sha.erase();
        cir.erase();
        tri.erase();
        sqr.erase();
        
    }
    
}

    class Shape{
        public void draw() {
            System.out.println("a shape");
        }
        
        public void erase() {
            System.out.println("the shape");
        }
    }

    class Circle extends Shape{
        @Override
        public void draw() {
            System.out.println("a circle");
        }
        
        @Override
        public void erase() {
            System.out.println("the circle");
        }
        
    }

    class Square extends Shape{
        @Override
        public void draw() {
            System.out.println("a square");
        }
        
        @Override
        public void erase() {
            System.out.println("the square");
        }
    }
    class Triangle extends Shape{
        @Override
        public void draw() {
            System.out.println("a triangle");
        }
        
        @Override
        public void erase() {
            System.out.println("the triangle");
        }
    }