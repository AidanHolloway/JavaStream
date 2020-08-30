/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
public class AccountSecurityException extends Exception {

    private String message = "";
    
    public AccountSecurityException() {
        this.message = "PIN mismatch";
    }
    
    public String toString() {
        return message;
    }
    
}
