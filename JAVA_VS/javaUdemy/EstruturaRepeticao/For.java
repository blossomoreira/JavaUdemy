package javaUdemy.EstruturaRepeticao;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {

        /* 
        
        for (inicio ; condição; incremento){
            comando 1
            comando 2
        } 

        * incio = executa somente na primeira vez
        * condição = V - executa e volta F - pula fora
        * incremento = executa toda vez depois de voltar
        
        */

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int soma = 0;
        for (int i=0; i<x; i++) {
            int n = sc.nextInt();
            soma+=n;
        }
        System.out.println(soma);
        sc.close();

    }
    
}
