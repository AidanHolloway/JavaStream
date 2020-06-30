import java.sql.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class foosballTableGenerator {
    public static void main(String[] args) throws Exception {
        while (true) {
        String[] transactions = {"Insert Table", "Read Stored Data", "Insert data", "Exit Program"};

        int index = JOptionPane.showOptionDialog(null, "What would you like to do with this database?", 
        "Database Choices", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
         null, transactions, transactions[0]);

       switch(index){
            case 0 :
            createTable();
            break;
            case 1 :
            readOut();
            break;
            case 2 :
            readIn();
            break;
            case 3 :
            JOptionPane.showMessageDialog(null, "Program successfully terminated.");
            System.exit(0);
            break;
            default :
            System.out.println("Please enter one of the given responses.");

        }

    }
}
    static void createTable(){

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/foosball","root","root");
            String sql = "CREATE TABLE Player (" +
                "PlayerId INT PRIMARY KEY NOT NULL UNIQUE, Name VARCHAR(100), Age INT, Matches INT)";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            
            conn.close();
            System.out.println("The table called Player has been generated.");    
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("An error has occurred.");
        }  
    }
    static void readOut(){

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/foosball","root","root");

            String sql = "SELECT * FROM Player";
             
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
             while (result.next()) {
                String name = result.getString("Name");
                int playerId = result.getInt("PlayerID");
                int age = result.getInt("Age");
                int matches = result.getInt("Matches");
                 
                System.out.println(" Player Name: " + name + "\r\n Player ID: " + playerId + "\r\n Age: " + 
                age + "\r\n Matches: " + matches + "\r\n");
             }
             conn.close();
         } catch (SQLException | ClassNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
         }
    }

    static void readIn(){

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/foosball","root","root");


            Scanner scan = new Scanner(System.in);
       System.out.println("Enter the player's name.");

       String name = scan.nextLine();
        
       System.out.println("Enter the player's age.");

       String age = scan.nextLine();

       System.out.println("Enter the player's amount of matches played.");

       String matches = scan.nextLine();

        String sql = "INSERT INTO Player (" +
        "Name, Age, Matches) VALUES ('"+ name +"','"+ age + "','" + matches + "')";

        Statement stmt=conn.createStatement();
                
                
        stmt.executeUpdate(sql);
        scan.close();  
        conn.close();
        JOptionPane.showMessageDialog(null, "The entered values have been added to the database.");
            } catch (SQLException | ClassNotFoundException e) {
                System.out.println("An error has occurred.");
                e.printStackTrace();
             }         
    
            }
        }