package javaUdemy.EstruturaRepeticao;
import java.util.Scanner;
public class DoWhile {
    /*
    O bloco de comandos executa pelo menos uma vez
    pois a condição é verificada no final
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char resp;
    do{
        
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 +32.0;
        System.out.printf("fahrenheit: %.1f%n", F);
        System.out.println("Deseja repetir? ");
        resp = sc.next().charAt(0);
        
    }while(resp != 'n');

}}
