package javaUdemy.POO.ConstrutoresThisSobrecargaEncapsulamento.exerUm;

public class Account {

    private int numeroConta;
    private String nameTitular;
    private double saldo;


    public Account(int numeroConta, String nameTitular) {
        this.numeroConta = numeroConta;
        this.nameTitular = nameTitular;
    }

    public Account(int numeroConta, String nameTitular, double inicialDeposit) {
        this.numeroConta = numeroConta;
        this.nameTitular = nameTitular;
        deposito(inicialDeposit);
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public String getNameTitular() {
        return nameTitular;
    }
    public void setNameTitular(String nameTitular) {
        this.nameTitular = nameTitular;
    }


    public double getsaldo() {
        return saldo;
    }




    /* METODOS */

    public void deposito(double valor) {
        saldo+=valor;
    }

    public void saque(double valor) {
        saldo-=valor+5;
    }

    public String toString() {
        return "Account [numeroConta=" + numeroConta + ", nameTitular=" + nameTitular + ", saldo=" + saldo + "]";
    }


    
    

    
}
