package javaUdemy.POO.ExerDois;
public class Employee {
    String name;
    double grossSalary;
    double tax;
    public double netSalary(){
        return grossSalary - tax;
    }
    public double IncreaseSalary(double percentage){
        return grossSalary += grossSalary * percentage / 100.0;   
    }
    public String toString(){
        return name + ", $ " + netSalary();
    }
}
