package javaUdemy.ArraysListas.Listas.exerUm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javaUdemy.POO.ExerDois.Employee;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many employees will be registred? ");
        int ne = sc.nextInt();

        List<Employee> Employees = new ArrayList<>();

        for (int i=0; i<ne; i++){
            System.out.println("Employee #"+(i+1)+":");

            System.out.println("Id: ");
            int id = sc.nextInt();

            System.out.println("Name: ");
            String name = sc.nextLine();

            System.out.println("Id: ");
            double salaries = sc.nextDouble();

            
            Employees.add(new Employee());
        }
    }
}
