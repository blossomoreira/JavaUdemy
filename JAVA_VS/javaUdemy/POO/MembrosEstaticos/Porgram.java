package javaUdemy.POO.MembrosEstaticos;

import java.util.Scanner;

import javaUdemy.POO.MembrosEstaticos.util.Calculator;

public class Porgram {
   
    /* Membro estático. */
        /* Usamos a palavra final para o valor não mudar. */
        /* Todos os nomes de constantes são em letra maiscula e com "_": "NET_SALARY"*/
   
        public static void main(String[] args) {
            
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");

        double radius = sc.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);

        System.out.printf("Circuference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", Calculator.PI);
        sc.close();
    }
}