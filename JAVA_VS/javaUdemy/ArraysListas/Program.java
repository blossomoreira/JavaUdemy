package javaUdemy.ArraysListas;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int x = sc.nextInt();
         
        Product[] vect = new Product[x]; /* Vetor de classe */

        for (int i=0; i<vect.length; i++){ /* lendo produtos */
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(price, name); /* guardando eles na posição */
        }
        
        double sum = 0;

        for (int i=0; i<x; i++){
            sum+=vect[i].getPrice(); /* pegando apenas os valores do vetor */
        }

        double avg = sum/x;
        System.out.println(avg);
    }
}
