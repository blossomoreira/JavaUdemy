package javaUdemy.ArraysListas.exer1;

import java.util.Scanner;

public class Dois {

    public static void main(String[] args) {
        int soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o tatamnho do vetor");
        int n = sc.nextInt();

        int[] vect = new int[n];

        for (int i=0; i<vect.length; i++){
            System.out.println("Digite os valroes do vetor;");
            vect[i] = sc.nextInt();
        }

        System.out.println("VALORES: ");
        for (int i=0; i<vect.length; i++){
            System.out.println(vect[i]);
        }


        for (int i=0; i<vect.length; i++){
            soma +=vect[i];
        }
        System.out.println("SOMA" + soma );
        
        System.out.println("MEDIA" + soma/n);
    }
    
}
