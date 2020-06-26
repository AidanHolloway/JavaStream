import java.sql.*;
import java.util.Scanner;

public class learnerInputStoring {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you a learner or parent?");
        
        String answer = input.nextLine();

        if((answer.toLowerCase()).equals("learner")){
           readInLearner();
        readOutLearner(); 
        }
        else if((answer.toLowerCase()).equals("parent")){
            readInParent();
        readOutParent();
        }
       else{
           System.out.println("Sorry, this was designed for learners and parents.");
       }
       input.close();
}

    public static void readInLearner(){
        String databaseURL = "jdbc:ucanaccess://C:\\Users\\Aidan\\Desktop\\CAPACITI LMS\\Module 9\\Week 4\\Sprint\\learnerParentDetailCapture\\learnerParentDetails.accdb";
        try {
            Connection con = DriverManager.getConnection(databaseURL);

            Scanner input = new Scanner(System.in);
            System.out.println("Enter Student Name");

            String name = input.nextLine();

            System.out.println("Enter Student Surname");

            String surname = input.nextLine();
            
            System.out.println("Enter Student Date of Birth");

            String dob = input.nextLine();
            
            System.out.println("Enter Student Gender");

            String gender = input.nextLine();
            
            System.out.println("Enter Student Grade");

            String grade = input.nextLine();
        
            input.close();
           
            PreparedStatement stmt=con.prepareStatement("INSERT INTO learnerDetails(Names, Surname, DateOfBirth, Gender, Grade) VALUES(?,?,?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, dob);
            stmt.setString(4, gender);
            stmt.setString(5, grade);
            
            int i=stmt.executeUpdate();
    System.out.println(i+" records inserted");
            con.close();
             
        } catch (SQLException ex) {
            System.out.println("SQL error");
            ex.printStackTrace();
        }

    }
    public static void readInParent(){
        String databaseURL = "jdbc:ucanaccess://C:\\Users\\Aidan\\Desktop\\CAPACITI LMS\\Module 9\\Week 4\\Sprint\\learnerParentDetailCapture\\learnerParentDetails.accdb";
        try {
            Connection con = DriverManager.getConnection(databaseURL);

            Scanner input = new Scanner(System.in);
            System.out.println("Enter Parent Name");

            String name = input.nextLine();

            System.out.println("Enter Parent Surname");

            String surname = input.nextLine();
            
            System.out.println("Enter Parent Contact Number");

            String contactNum = input.nextLine();
            
            System.out.println("Enter Parent Address");

            String address = input.nextLine();
            
            System.out.println("Enter the Number of your Children currently in enrolled in our school");

            String numChildren = input.nextLine();
        
            input.close();
           
            PreparedStatement stmt=con.prepareStatement("INSERT INTO parentDetails(Names, Surname, ContactNum, Address, NumOfChildren) VALUES(?,?,?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, contactNum);
            stmt.setString(4, address);
            stmt.setString(5, numChildren);
            
            int i=stmt.executeUpdate();
        System.out.println(i+" records inserted");
            con.close();
             
        } catch (SQLException ex) {
            System.out.println("SQL error");
            ex.printStackTrace();
        }

    }
   public static void readOutLearner(){
    String databaseURL = "jdbc:ucanaccess://C:\\Users\\Aidan\\Desktop\\CAPACITI LMS\\Module 9\\Week 4\\Sprint\\learnerParentDetailCapture\\learnerParentDetails.accdb";
        try {
            Connection con = DriverManager.getConnection(databaseURL);

            String sql;

            sql = "SELECT * FROM learnerDetails";
             
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                String name = result.getString("Names");
                String surname = result.getString("Surname");
                String dateOfBirth = result.getString("DateOfBirth");
                String gender = result.getString("Gender");
                String grade = result.getString("Grade");
                 
                System.out.println("Student Name: " + name + "\r\n" + "Student Surname: " + surname + "\r\n" + "Date of Birth: " + 
                dateOfBirth + "\r\n" + "Gender: " + gender + "\r\n" + "Grade: " + grade + "\r\n");
            }
             con.close();
        } catch (SQLException ex) {
            System.out.println("SQL error");
            ex.printStackTrace();
        }


    } 

    public static void readOutParent(){
        String databaseURL = "jdbc:ucanaccess://C:\\Users\\Aidan\\Desktop\\CAPACITI LMS\\Module 9\\Week 4\\Sprint\\learnerParentDetailCapture\\learnerParentDetails.accdb";
               try {
                   Connection con = DriverManager.getConnection(databaseURL);
       
                   String sql;
       
                   sql = "SELECT * FROM parentDetails";
                    
                   Statement statement = con.createStatement();
                   ResultSet result = statement.executeQuery(sql);
                    
                   while (result.next()) {
                       String name = result.getString("Names");
                       String surname = result.getString("Surname");
                       String contacts = result.getString("ContactNum");
                       String address = result.getString("Address");
                       String numChildren = result.getString("NumOfChildren");
                        
                       System.out.println("Parent Name: " + name + "\r\n Parent Surname: " + surname + "\r\n Contact Number: " + contacts + "\r\n Address: " + address + "\r\n Number of Children Enrolled: " + numChildren + "\r\n");
                   }
                    con.close();
               } catch (SQLException ex) {
                   System.out.println("SQL error");
                   ex.printStackTrace();
               }
       
       
           } 

}
