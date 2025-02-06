/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ushakeshravya
 */
public class Product {
    
    private String name;
    private int price;
    private int id;
    
    private ArrayList<Feature> features;

    private static int count = 0;
    
    public Product() {
        count++;
        id = count;
        
        features = new ArrayList<Feature> ();
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    // New method to get the list of features
    public List<Feature> getFeatures() {
        return features;
    }

    // Method to add a feature
    public void addFeature(Feature feature) {
        features.add(feature);
    }
    
    public Feature addNewFeature() {
        Feature feature = new Feature(this);
        features.add(feature);
        return feature;
    }

    
    @Override
    public String toString() {
        return name;
    }

}