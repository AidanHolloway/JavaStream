/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod103_week1_day2_act2;

public class Mod103_Week1_Day2_Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String input = "I hope this works";
        Backwards reverse = new Backwards(input);
        System.out.println("Length: " + reverse.length());
        System.out.println("Char at 2: " + reverse.charAt(2));
        System.out.println("SubSequence (1-6): " + reverse.subSequence(1, 6));
        System.out.println("To String: " + reverse.toString());
        

    }

}

interface PersonMove {

    void walk();

    void run();
}

class PersonMovement implements PersonMove {

    public void walk() {
        System.out.println("walk!");
    }

    public void run() {
        System.out.println("run!");
    }
}

class Backwards implements CharSequence {

    private String name;

    public Backwards(String charSeq) {

        this.name = charSeq;

        char[] charArr = name.toCharArray();
        char[] reverseArr = charArr.clone();
        int rev = charArr.length - 1;
        for (int count = 0; count < charArr.length; count++) {
            reverseArr[rev] = charArr[count];
            rev--;
        }
        this.name = new String(reverseArr);
    }

    @Override
    public int length() {
        return name.length();
    }

    @Override
    public char charAt(int index) {
        return name.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return name.subSequence(start, end);
    }

    @Override
    public String toString() {
        return name;
    }

}
