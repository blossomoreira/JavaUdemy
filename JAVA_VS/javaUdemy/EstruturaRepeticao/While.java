package javaUdemy.EstruturaRepeticao;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int somas = 0;
        while (x != 0){
            somas = somas + x;
            x = sc.nextInt();
        }
        System.out.println(somas);
    }
    
}
