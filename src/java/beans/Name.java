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
public class Name implements Serializable{
    private String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }

    
}
