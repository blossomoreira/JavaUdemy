package javaUdemy.POO.MembrosEstaticos.fixacao;
public class CurrencyConverter {
    public static double IOF = 0.06;
    public static double corvesao(double dolarPreco, double dolarTrazido){



        double valorReal = (dolarPreco * dolarTrazido) + (IOF - dolarPreco * dolarTrazido);

        return valorReal;
    }
}
