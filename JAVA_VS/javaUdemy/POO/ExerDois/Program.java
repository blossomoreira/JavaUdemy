package javaUdemy.POO.ExerDois;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Employee pessoa = new Employee();
        System.out.println("Name: ");
        pessoa.name = sc.nextLine();
        System.out.println("Gross salary: ");
        pessoa.grossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        pessoa.tax = sc.nextDouble();
        System.out.println("Emproyee: " + pessoa.name + ", " + "$ " + pessoa.netSalary());
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        pessoa.IncreaseSalary(percentage);
        System.out.println("Update data: " + pessoa);
    }
}
