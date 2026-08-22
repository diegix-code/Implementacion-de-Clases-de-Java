/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.example;

/**
 *
 * @author DIEGIX
 */
public class Main {
     public static void main(String[] args) {
        // Crear el primer objeto
        Product product1 = new Product();

        product1.setId("PRD001");
        product1.setName("Andres");
        product1.setPrice(2000);
        product1.setStock(50);

        // Crear el segundo objeto
        Product product2 = new Product();

        product2.setId("PRD002");
        product2.setName("Laura");
        product2.setPrice(3500);
        product2.setStock(80);

        // Modificar un atributo de cada objeto
        product1.setPrice(1500);
        product2.setStock(40);

        // Imprimir con getters (dos atributos)
        System.out.println("=== Product 1 ===");
        System.out.println("name: " + product1.getName());
        System.out.println("stock: " + product1.getStock());

        System.out.println();

        System.out.println("=== Product 2 ===");
        System.out.println("name: " + product2.getName());
        System.out.println("price: " + product2.getPrice());

        System.out.println();

        // Mostrar toda la información con toString()
        System.out.println("Información completa:");
        System.out.println(product1.toString());
        System.out.println(product2.toString());
    }
    
}

