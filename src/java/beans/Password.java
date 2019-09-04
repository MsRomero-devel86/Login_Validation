/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author Meghan
 */
public class Password implements Serializable{
    private String password; 

    public Password(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return password;
    }
    
}
