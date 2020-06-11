import java.util.Scanner;

public class Mod9Week1Day3Act2 {

    public static void main(String[] args) {
       
        System.out.println("Enter vaules for a 4 by 5 2d array (20 numbers). Enter the word Skip to have preselected numbers automatically be used.");
        
        Scanner option = new Scanner(System.in);
        
        
         double[][] arr = new double[4][5];
         
        if(!(((option.nextLine()).toLowerCase()).equals("skip"))){
           Scanner keyBoard = new Scanner(System.in);
           
            
            for(int col=0; col<5; col++){
                for(int row=0; row<4; row++){
                    arr[row][col] = keyBoard.nextDouble();
                }
            }
            
        }else{
           //double[][] arr = {{1, 5, 6, 9},{5, 7, 8, 5},{2.5, 8.0, 4.5, 7.5}, {6.9, 7.1, 6.5, 9.5},{2, 5, 7, 7}};
           //column 1
           arr[0][0] = 1;
           arr[1][0] = 5;
           arr[2][0] = 6;
           arr[3][0] = 9;
           
           //column 2
           arr[0][1] = 5;
           arr[1][1] = 7;
           arr[2][1] = 8;
           arr[3][1] = 5;
           
           //column 3
           arr[0][2] = 2.5;
           arr[1][2] = 8.0;
           arr[2][2] = 4.5;
           arr[3][2] = 7.5;
           
           //column 4
           arr[0][3] = 6.9;
           arr[1][3] = 7.1;
           arr[2][3] = 6.5;
           arr[3][3] = 9.5;
           
           //column 5
           arr[0][4] = 2;
           arr[1][4] = 5;
           arr[2][4] = 7;
           arr[3][4] = 7;
        }

       
        double totalCol;
        double total = 0.0;
        for(int col=0; col<5; col++){
       totalCol=0.0;
            for(int row=0; row<4; row++){
            
            totalCol+= arr[row][col];
        }
            System.out.println("Column "+(col+1)+" total = "+totalCol);
        total+=totalCol;
        }
        System.out.println("Total value of all columns combined = " + total);
        
    }
    
}
