package javaUdemy.POO.ExerUm;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle renatngulo = new Rectangle();
        System.out.println("Enter rectangle width and height: ");
        renatngulo.height = sc.nextDouble();
        renatngulo.width = sc.nextDouble();
        System.out.println(renatngulo);
    }
}
