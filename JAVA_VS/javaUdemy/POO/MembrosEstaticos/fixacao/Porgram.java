package javaUdemy.POO.MembrosEstaticos.fixacao;

import java.util.Scanner;

public class Porgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do dolar: ");
        double dolarPreco = sc.nextDouble();

        System.out.println("Quantos dolares serão convertidos: ");
        double dolarTrazido = sc.nextDouble();

        double v = CurrencyConverter.corvesao(dolarPreco, dolarTrazido);

        System.out.println("Valor em real: " + v);


    }
    
}
