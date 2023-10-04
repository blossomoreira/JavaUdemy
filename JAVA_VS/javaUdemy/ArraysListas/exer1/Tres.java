package javaUdemy.ArraysListas.exer1;

import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Quantas pessoas?");
        int np = sc.nextInt();

        String[] nomes = new String[np];
        int[] idades = new int[np];
        double[] alturas = new double[np];

        for (int i=0; i<np; i++){
            System.out.println("Dados da"+(i+1)+"pessoa");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        }
    }


        
    