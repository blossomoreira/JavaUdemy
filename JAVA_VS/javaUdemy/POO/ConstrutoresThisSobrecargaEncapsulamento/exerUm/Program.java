package javaUdemy.POO.ConstrutoresThisSobrecargaEncapsulamento.exerUm;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Account account; /* instanciando o construtor aqui */

        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Numero da conta: ");
            int number = sc.nextInt();

            System.out.println("Nome: ");
            sc.nextLine(); /*para o next int n sugar e deixar de executar o nextline */
            String name = sc.nextLine();

            System.out.println("Deposito inicial (n/y)?");
            char r = sc.next().charAt(0);

            if (r == 'y'){
                System.out.println("Valor do deposito inicial: ");
                double inicialDeposit = sc.nextDouble();
                account = new Account(number, name, inicialDeposit); /* instanciando contrutor 
                                                                        sobrecarrgeado */
            } else{
                account = new Account(number, name); /* instanciando construtor com dois valores */
            }
            
            System.out.println("Deposito");
            double depositValue = sc.nextDouble();
            account.deposito(depositValue);

            System.out.println("Saque: ");
            double saqueValue = sc.nextDouble();
            account.saque(saqueValue);

            System.out.println("uptade account data:");
            System.out.println(account);
            
        }
        

    }
    
}
