import java.sql.*;
import javax.swing.JOptionPane;

public class schoolRegistrationSystem {
    public static void main(String[] args) throws Exception {
       String[] choices = {"Insert Table", "Read Stored Data", "Search for specific records", "Insert data", "Delete Records", "Exit Program"};

        while(true){
        int index = JOptionPane.showOptionDialog(null, "What would you like to do with this database?", 
        "Database Choices", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
         null, choices, choices[0]);

       switch(index){
            case 0 :
            String[] tablePar = {"Yes", "No"};
            index = JOptionPane.showOptionDialog(null, "Is there already a database for parents?", 
        "Table Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
         null, tablePar, tablePar[0]);
        
        switch (index){
            case 0:
                
                break;
             case 1:
             createTableParent();    
                 break;
            default:
            continue ;
        }

        String [] tableLearn = {"Yes", "No"};
            index = JOptionPane.showOptionDialog(null, "Is there already a database for learners?", 
        "Table Confirmation", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
         null, tableLearn, tableLearn[0]);

        switch (index) {
            case 0:
                
                break;
                case 1:
             createTableLeaner();  
                break;
             default:
            continue;
        } 
          
            break;
            case 1 :
            readChoice();
            break;

            case 2 : 
                searchChoice();
            break;

            case 3 :
            insertChoice();
            continue;

            case 4 :
            deleteChoice();
            continue;

            case 5 :
            JOptionPane.showMessageDialog(null, "Program successfully terminated.");
            System.exit(0);
            break;
            default :
            
            JOptionPane.showMessageDialog(null, "Program successfully terminated.");
            System.exit(0);

        }
        
    }
}
        private static void searchChoice(){
            String searchChoice[] = {"Parents","Leaners"};

      int index = JOptionPane.showOptionDialog(null, "Search for a record from Parent or Learner tables", "Search", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
      null, searchChoice, searchChoice[0]);
            String id="";

              switch (index) {
                  case 0:
                  id = JOptionPane.showInputDialog(null, "Enter the ID of the parent you want to search for:");

                  if (isNull(id) == true) {
                    return;
                }

                  searchParentID(id);
                      break;
                  case 1:
                  id = JOptionPane.showInputDialog(null, "Enter the ID of the learner you want to search for:");

                  if (isNull(id) == true) {
                    return;
                }

                  searchLearnerID(id);
                      break;
                  default:
                    return;
              }
  }

    private static void deleteChoice(){
      String username =  JOptionPane.showInputDialog(null, "Enter your admin Username:");
      if (isNull(username) == true) {
        return;
    }

      String password = JOptionPane.showInputDialog(null, "Enter your admin Password:");

    if (isNull(password) == true) {
        return;
    }
          if(isAdmin(username, password)){

              String deleteChoice[] = {"Parents","Leaners"};

      int index = JOptionPane.showOptionDialog(null, "Delete a record from Parent or Learner tables", "Delete", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
      null, deleteChoice, deleteChoice[0]);
            String id="";

              switch (index) {
                  case 0:
                  id = JOptionPane.showInputDialog(null, "Enter the ID of the parent you want to delete:");

                  if (isNull(id) == true) {
                    return;
                }

                  deleteParent(id);
                      break;
                  case 1:
                  id = JOptionPane.showInputDialog(null, "Enter the ID of the learner you want to delete:");

                  if (isNull(id) == true) {
                    return;
                }

                  deleteLearner(id);
                      break;
                  default:
                   return;
              }
          }
          else {
            JOptionPane.showMessageDialog(null, "Sorry, you don't have the required access to edit our data.");
          }
  }

private static void searchLearnerID(String idNum) {
    Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String sql = "SELECT COUNT(1) FROM learnerDetails WHERE(ID = " + idNum + ")";

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            if(result.next()){
                int res = result.getInt(1);
                if(res == 1){
                    sql = "SELECT * FROM learnerDetails WHERE(ID = " + idNum + ")";
                    stmt = conn.createStatement();
                    result = stmt.executeQuery(sql);

                    if(result.next()){
                        String idNo = result.getString("ID");
                        String name = result.getString("Names");
                        String surname = result.getString("Surname");
                        String dateOfBirth = result.getString("DateOfBirth");
                        String gender = result.getString("Gender");
                        String grade = result.getString("Grade");
                 
                        System.out.println("Student ID: " + idNo + "\r\n" + "Student Name: " + name + "\r\n" + "Student Surname: " + surname + "\r\n" + "Date of Birth: " + 
                        dateOfBirth + "\r\n" + "Gender: " + gender + "\r\n" + "Grade: " + grade + "\r\n");
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null, "The learner could not be found.");
                }
            }
                conn.close();   
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred.");
            ex.printStackTrace();
        }  
}
private static void deleteParent(String idNum){
    Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String sql = "SELECT COUNT(1) FROM parentDetails WHERE(ID = " + idNum + ")";

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            

            if(result.next()){
                int res = result.getInt(1);
                if(res == 1){
                    sql = "DELETE FROM parentDetails WHERE(ID = " + idNum + ")";
                    stmt = conn.createStatement();
                    int i = stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, String.valueOf(i) + " was deleted.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "The parent could not be found.");
                }
            }
                conn.close();
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "An error has occurred.");
                ex.printStackTrace();
            }  

}

private static void deleteLearner(String idNum){
    Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String sql = "SELECT COUNT(1) FROM learnerDetails WHERE(ID = " + idNum + ")";

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            

            if(result.next()){
                int res = result.getInt(1);
                if(res == 1){
                    sql = "DELETE FROM learnerDetails WHERE(ID = " + idNum + ")";
                    stmt = conn.createStatement();
                    int i = stmt.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, String.valueOf(i) + " was deleted.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "The learner could not be found.");
                }
            }
                conn.close();
            } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "An error has occurred.");
                ex.printStackTrace();
            }  

}
private static void searchParentID(String idNum) {
    Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String sql = "SELECT COUNT(1) FROM parentDetails WHERE(ID = " + idNum + ")";

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            

            if(result.next()){
                int res = result.getInt(1);
                if(res == 1){
                    sql = "SELECT * FROM parentDetails WHERE(ID = " + idNum + ")";
                    stmt = conn.createStatement();
                    ResultSet result2 = stmt.executeQuery(sql);

                    if(result2.next()){
                        String idNo = result2.getString("ID");
                        String name = result2.getString("Names");
                        String surname = result2.getString("Surname");
                        String contacts = result2.getString("ContactNum");
                        String address = result2.getString("Address");
                        String numChildren = result2.getString("NumOfChildren");
                         
                        System.out.println("Parent ID: " + idNo + "\r\n" + "Parent Name: " + name + "\r\n" + "Parent Surname: " + surname + "\r\n" + 
                        "Contact Number: " + contacts + "\r\n" + "Address: " + address + "\r\n" + "Number of Children Enrolled: " + numChildren + "\r\n");
                   
                    }
                }
                else {
                   JOptionPane.showMessageDialog(null, "The parent could not be found."); 
                }
            }
                conn.close();
           
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred.");
            ex.printStackTrace();
        }  
}

public static boolean isAdmin(String userNAME, String passWORD) {
    boolean answer = false;

     if(passWORD.equals("password") && userNAME.equals("username")){
            answer = true;
        }        

     return answer;
    }

public static void readChoice(){

        String readChoice[] = {"Parents","Leaners"};

        int index = JOptionPane.showOptionDialog(null, "Read from Parent or Learner tables", "Read", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
        null, readChoice, readChoice[0]);
       
        switch (index) {
            case 0:
                readOutParent();
                break;
            case 1:
                readOutLearner();
                break;
            default:
                return;
        }
}

    public static void insertChoice(){

        String username = JOptionPane.showInputDialog(null, "Enter your admin Username:");

        if (isNull(username) == true) {
            return;
        }
        String password = JOptionPane.showInputDialog(null, "Enter your admin Password:");

        
        
        if (isNull(password) == true) {
            return;
        }

            if(isAdmin(username, password)){

                String insertChoice[] = {"Parents","Leaners"};

        int index = JOptionPane.showOptionDialog(null, "Insert records in Parent or Learner table?", "Insert", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
        null, insertChoice, insertChoice[0]);

                switch (index) {
                    case 0:
                            readInParent();
                        break;
                    case 1:
                            readInLearner();
                        break;
                    default:
                    return;
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Sorry, you don't have the required access to edit our data.");
            }
    }

    static void createTableLeaner(){

        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String sql = "CREATE TABLE IF NOT EXISTS learnerDetails (" +
            "ID INT AUTO_INCREMENT NOT NULL, Names VARCHAR(100), Surname VARCHAR(100), DateOfBirth VARCHAR(100), Gender VARCHAR(6),"+
            " Grade VARCHAR(6), PRIMARY KEY(ID))";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            
            conn.close();
            JOptionPane.showMessageDialog(null, "The learnerDetails table has just been created!");    
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred.");
        }  
    }

    static void createTableParent(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String sql = "CREATE TABLE IF NOT EXISTS parentDetails (" +
                "ID INT AUTO_INCREMENT NOT NULL, Names VARCHAR(100), Surname VARCHAR(100), ContactNum VARCHAR(30), Address VARCHAR(100), "
                +"NumOfChildren INT, PRIMARY KEY(ID))";


            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

            conn.close();
            JOptionPane.showMessageDialog(null, "The parentDetails table has just been created!");   
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred.");
        }  
            
    }


    public static boolean isNull(String var) {
        if ((var == null) || (var != null && ("".equals(var)) )) {
            return true;
        }

        return false;
    }

    public static void readInLearner(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String name = JOptionPane.showInputDialog(null, "Enter Student Name");

            if (isNull(name) == true) {
                return;
            }

            String surname = JOptionPane.showInputDialog(null, "Enter Student Surname");

            if (isNull(surname) == true) {
                return;
            }
            
            String dob = JOptionPane.showInputDialog(null, "Enter Student Date of Birth");

            if (isNull(dob) == true) {
                return;
            }

            String gender = JOptionPane.showInputDialog(null, "Enter Student Gender");

            if (isNull(gender) == true) {
                return;
            }

            String grade = JOptionPane.showInputDialog(null, "Enter Student Grade");

            if (isNull(grade) == true) {
                return;
            }
           
            PreparedStatement stmt=conn.prepareStatement("INSERT INTO learnerDetails(Names, Surname, DateOfBirth, Gender, Grade) VALUES(?,?,?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, dob);
            stmt.setString(4, gender);
            stmt.setString(5, grade);
            
            int i=stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, i + " records inserted");
            conn.close();
             
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred");
            ex.printStackTrace();
        }

    }
    public static void readInParent(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String name = JOptionPane.showInputDialog(null, "Enter Parent Name");

            if (isNull(name) == true) {
                return;
            }

            String surname = JOptionPane.showInputDialog(null, "Enter Parent Surname"); 

            if (isNull(surname) == true) {
                return;
            }

            String contactNum = JOptionPane.showInputDialog(null, "Enter Parent Contact Number");

            if (isNull(contactNum) == true) {
                return;
            }

            String address = JOptionPane.showInputDialog(null, "Enter Parent Address");           

            if (isNull(address) == true) {
                return;
            }

            String numChildren = JOptionPane.showInputDialog(null, "Enter the Number of your Children currently in enrolled in our school");

            if (isNull(numChildren) == true) {
                return;
            }

            PreparedStatement stmt=conn.prepareStatement("INSERT INTO parentDetails(Names, Surname, ContactNum, Address, NumOfChildren) VALUES(?,?,?,?,?)");
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setString(3, contactNum);
            stmt.setString(4, address);
            stmt.setString(5, numChildren);
            
            int i=stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, i + " records inserted");
            conn.close();
             
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred");
            ex.printStackTrace();
        }

    }
   public static void readOutLearner(){
    Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");

            String sql = "SELECT COUNT(*) FROM learnerDetails";

            Statement stmt = conn.createStatement();
            ResultSet result = stmt.executeQuery(sql);

            if(result.next()){
                int res = result.getInt(1);
                if(res > 0){

            sql = "SELECT * FROM learnerDetails";

             stmt = conn.createStatement();
           
            result = stmt.executeQuery(sql);
             
            while (result.next()) {
                String idNo = result.getString("ID");
                String name = result.getString("Names");
                String surname = result.getString("Surname");
                String dateOfBirth = result.getString("DateOfBirth");
                String gender = result.getString("Gender");
                String grade = result.getString("Grade");
                 
                System.out.println("Student ID: " + idNo + "\r\n" + "Student Name: " + name + "\r\n" + "Student Surname: " + surname + "\r\n" + "Date of Birth: " + 
                dateOfBirth + "\r\n" + "Gender: " + gender + "\r\n" + "Grade: " + grade + "\r\n");
            }}
            else {
                JOptionPane.showMessageDialog(null, "No learner records where found.");
            }
        }
             conn.close();
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "An error has occurred");
            ex.printStackTrace();
        }

    } 

    public static void readOutParent(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/schoolregistrationsystem","root","root");
       
       
                   String sql = "SELECT COUNT(*) FROM learnerDetails";

                   Statement stmt = conn.createStatement();
                   ResultSet result = stmt.executeQuery(sql);
       
                   if(result.next()){
                       int res = result.getInt(1);
                       if(res > 0){

                   sql = "SELECT * FROM parentDetails";
                    
                  stmt = conn.createStatement();
        
                  result = stmt.executeQuery(sql);
                    
                   while (result.next()) {
                       String idNo = result.getString("ID");
                       String name = result.getString("Names");
                       String surname = result.getString("Surname");
                       String contacts = result.getString("ContactNum");
                       String address = result.getString("Address");
                       String numChildren = result.getString("NumOfChildren");
                        
                       System.out.println("Parent ID: " + idNo + "\r\n" + "Parent Name: " + name + "\r\n" + "Parent Surname: " + surname + "\r\n" + 
                       "Contact Number: " + contacts + "\r\n" + "Address: " + address + "\r\n" + "Number of Children Enrolled: " + numChildren + "\r\n");
                   }}
                   else {
                    JOptionPane.showMessageDialog(null, "No parent records where found.");
                }
                }
                    conn.close();
               } catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "An error has occurred");
                   ex.printStackTrace();
               }

           }

        }
