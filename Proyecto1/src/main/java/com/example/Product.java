/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.example;

/**
 *
 * @author DIEGIX
 */
public class Product {

    private String id;
    private String name;
    private double price;
    private int stock;
    
    //Getters//
    
    public String getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }
    public int getstock(){
        return stock;
    }
    //Setters//
    public void setid(String id){
        this.id = id;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setprice(double price){
        this.price = price;
    }
    public void setstock(int stock){
        this.stock = stock;
    }
    // Método toString()
    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                '}';
    }
}
