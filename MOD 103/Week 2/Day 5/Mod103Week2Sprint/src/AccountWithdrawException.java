/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author John
 */
public class AccountWithdrawException extends Exception {

    private String message = "";
    
    public AccountWithdrawException() {
        this.message = "Amount less than minimum withdrawal accepted";
    }
    
    public String toString() {
        return message;
    }
    
}
