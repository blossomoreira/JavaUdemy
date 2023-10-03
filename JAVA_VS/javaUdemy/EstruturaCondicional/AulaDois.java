package javaUdemy.EstruturaCondicional;
import java.util.Scanner;
public class AulaDois {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int conta = 50;
        System.out.println("Quantos minutos você consumiu?");
        int minutos = sc.nextInt();
        if (minutos > 100){
            conta+= (minutos - 100) * 2;
            System.out.printf("valor da cota eh: %d ", conta);
        }else{
            System.out.printf("valor da cota eh: %d ", conta);
        }
    }
}