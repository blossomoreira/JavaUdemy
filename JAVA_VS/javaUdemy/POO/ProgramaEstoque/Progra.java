package javaUdemy.POO.ProgramaEstoque;
import java.util.Scanner;

public class Progra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product produto = new Product();
        System.out.print("Name: ");
        produto.name = sc.nextLine();
        System.out.print("Price: ");
        produto.price = sc.nextDouble();
        System.out.print("Quantity: ");
        produto.quantity = sc.nextInt();
        System.out.println("*------------------------*");
        System.out.println(produto);
        System.out.println("*------------------------*");
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        produto.addProducts(quantity);
        System.out.println("*------------------------*");
        System.out.println("Update data: " + produto);
        System.out.println("*------------------------*");
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        produto.removeProducts(quantity);
        System.out.println("Update data: " + produto);
    }
}
