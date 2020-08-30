/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
public class AccountBalanceException extends Exception {

    private String message = "";
    
    public AccountBalanceException() {
        this.message = "Overdraft not allowed";
    }
    
    public String toString() {
        return message;
    }
    
}
