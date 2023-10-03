package javaUdemy.POO.MembrosEstaticos.util;

public class Calculator {
    
    public static final double PI = 3.14159; 

    public static double circumference(double radius){
        return 2.0 * PI * radius;
    }
    public static double volume(double radius){
        return 4.0 * PI * radius * radius * radius / 3;
    }

    /* Você não pode chamar um métoo que não é estático,
    dentro de um que é estático */

    /* Sem o static, teriamos que criar um objeto e chamar os métodos
     * 
     * calc.volume();
     * 
     */
}
