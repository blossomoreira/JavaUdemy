package javaUdemy.EstruturaCondicional;

import java.util.Scanner;

public class AulaUm {
    
    /*OPERADORES LOGICOS*/
    /*

    && - E (todas as condições precisam ser verdadeiras)
    || - OU (pelo menos uma condição deve ser verdadeira)
    ! - NAO (inverte a condição. ela kjá é verdadeira)

     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        x = sc.nextInt();
        if (x > 10 || x > 15) {
            System.out.println("Oii");
        }else{

            System.out.println("oii");
        }   
    }
}
