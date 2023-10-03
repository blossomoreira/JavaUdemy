package javaUdemy.OutrosTopicos;

import java.util.Scanner;

public class funcoes {

    public static void main(String[] args) {
        /*Em POO as funções em classes recebem o nome de "métodos" */
        double y = 25.0;
        double x = Math.sqrt(y);
        System.out.println(x);

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);
        showResult(higher);


    }

    public static int max (int x, int y, int z) { /*static que ela possa ser ultilizada em outras classes */
        int aux;
        if (x > y && x > z){
            aux = x;
        }else if (y > z){
        aux = y;
        }else{
            aux = z;
        }
        return aux;
    }
    
    public static void showResult(int value){
        System.out.println(value);
    }
}
