package javaUdemy.POO.ExerTres;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student pessoaDois = new Student();
        System.out.println("Insera o nome do aluno: ");
        pessoaDois.name = sc.nextLine();
        System.out.println("Digite a primeira nota");
        pessoaDois.gradeOne = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        pessoaDois.gradeTwo = sc.nextDouble();
        System.out.println("Digite a terceira nota");
        pessoaDois.gradeThree = sc.nextDouble();
        System.out.println("Nota final: \n");
        pessoaDois.finalGrade();    
    }


    
    
}
