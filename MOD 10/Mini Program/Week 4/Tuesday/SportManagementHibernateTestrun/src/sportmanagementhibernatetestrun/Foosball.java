package sportmanagementhibernatetestrun;
// Generated Jul 21, 2020 12:13:49 PM by Hibernate Tools 4.3.1



/**
 * Foosball generated by hbm2java
 */
public class Foosball  implements java.io.Serializable {


     private Integer playerId;
     private String name;
     private Integer matches;
     private Integer age;
     private String location;

    public Foosball() {
    }

    public Foosball(String name, Integer matches, Integer age, String location) {
       this.name = name;
       this.matches = matches;
       this.age = age;
       this.location = location;
    }
   
    public Integer getPlayerId() {
        return this.playerId;
    }
    
    public void setPlayerId(Integer playerId) {
        this.playerId = playerId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getMatches() {
        return this.matches;
    }
    
    public void setMatches(Integer matches) {
        this.matches = matches;
    }
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getLocation() {
        return this.location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }




}


