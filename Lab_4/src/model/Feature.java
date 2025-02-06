/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ushakeshravya
 */
public class Feature {

    private Product owner;
    private String name;
    private Object value;

    public Feature(Product owner) {
        this.owner = owner;
    }

    public Feature(Product owner, String name, String value) {
        this.owner = owner;
        this.name = name;
        this.value = value;
    }
    
    public Feature() {
        this.owner = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    @Override
    public String toString(){
        return name;
    }

}




