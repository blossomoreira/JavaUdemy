package javaUdemy.POO;

import java.util.Scanner;

public class poointro {
    /*Classe, atributos e métodos*/
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        double xA, xB, xC, yA, yB, yC;
        double maior; 
        
        System.out.println("Digite the measuremnts ofr the triangle x");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        double p = (xA + xB + xC) /2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
 
        System.out.println("Digite the measuremnts ofr the triangle Y");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();
        double u = (yA + yB + yC) /2.0;
        double areaY = Math.sqrt(u * (u - yA) * (u - yB) * (u - yC));

        System.out.println("areaY"+areaY);
        System.out.println("areaX"+areaX);

        if (areaX > areaY){
            maior = areaX;
            System.out.println("o maior é: "+areaX);
        }else if (areaY > areaX){
            maior = areaY;
            System.out.println("o maior é: "+areaY);
        }

    }
}
