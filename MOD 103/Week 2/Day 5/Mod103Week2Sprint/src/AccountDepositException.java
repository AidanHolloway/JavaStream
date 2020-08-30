/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
public class AccountDepositException extends Exception {

    private String message = "";
    
    public AccountDepositException() {
        this.message = "Negative deposit amount";
    }
    
    public String toString() {
        return message;
    }
    
}
