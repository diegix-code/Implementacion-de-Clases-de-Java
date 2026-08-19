/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example.product;

/**
 *
 * @author DIEGIX
 */
public class Main {
     public static void main(String[] args) {
        // Crear el primer objeto
        Product product1 = new Product();

        product1.setid("PRD001");
        product1.setname("Andres");
        product1.setprice(2000);
        product1.setstock(50);

        // Crear el segundo objeto
        Product product2 = new Product();

        product2.setid("PRD002");
        product2.setname("Laura");
        product2.setprice(3500);
        product2.setstock(80);

        // Modificar un atributo de cada objeto
        product1.setprice(1500);
        product2.setstock(40);

        // Imprimir con getters (dos atributos)
        System.out.println("=== Product 1 ===");
        System.out.println("name: " + product1.getname());
        System.out.println("stock: " + product1.getstock());

        System.out.println();

        System.out.println("=== Product 2 ===");
        System.out.println("name: " + product2.getname());
        System.out.println("price: " + product2.getprice());

        System.out.println();

        // Mostrar toda la información con toString()
        System.out.println("Información completa:");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
    
}
