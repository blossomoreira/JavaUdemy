package javaUdemy.POO.ProgramaTriangulo;
import java.util.Scanner;
public class program {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    triangulo x, y;
    x = new triangulo();
    y = new triangulo();
    System.out.println("");
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();
    double areaY = y.calculando();
    System.out.println("");
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();
    double areaX = y.calculando();
    }
}
