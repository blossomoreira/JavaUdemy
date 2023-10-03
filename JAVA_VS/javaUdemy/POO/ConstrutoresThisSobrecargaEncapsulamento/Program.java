package javaUdemy.POO.ConstrutoresThisSobrecargaEncapsulamento;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter prodcut data:");
        
        System.out.println("Name: ");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        System.out.println("Quantity: ");
        int quantity = sc.nextInt();


        Product p = new Product("tv", 0, 0);

        p.setName("Vitoria");

        System.out.println(p);
    }
    
}
