/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportmanagementhibernatetestrun;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Aidan
 */
public class SportManagementHibernateTestrun {

    /**
     * @param args the command line arguments
     */
    private static SessionFactory factory;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        factory = new Configuration().configure().buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = null;

try {
   tx = session.beginTransaction();
   // do some work
    List sportsList = session.createQuery("FROM sportmanagementhibernatetestrun.SportsClub").list(); 
  List playerList = session.createQuery("FROM sportmanagementhibernatetestrun.Foosball").list();
    Iterator iterator2 = playerList.iterator();
   for(Iterator iterator = sportsList.iterator(); iterator.hasNext();){
            SportsClub sportclub = (SportsClub) iterator.next(); 
            Foosball player = (Foosball) iterator2.next();
            
            System.out.print("  Player Name: " + player.getName()); 
            System.out.print("  Location: " + player.getLocation()); 
                       
            System.out.print("  Player Age: " + sportclub.getAge());
            System.out.print("  Number of Wins: " + sportclub.getNumberOfWins()); 
            System.out.println("  Type of Sport: " + sportclub.getTypeOfSports()); 
   }
  
  tx.commit();
}

catch (Exception e) {
   if (tx!=null) tx.rollback();
   e.printStackTrace(); 
} finally {
   session.close();
}
    }
}
