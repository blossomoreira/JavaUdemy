package javaUdemy.POO.ProgramaTriangulo;

public class triangulo {
    /* CLASSE:
     * Métodos
     * Atributos
     * Construtores
     * Encapsulamento
     * Herança
     * Polimorfismo
     */
        public double a;
        public double b;
        public double c;

        public double calculando(){
            double u = (a + b + c) /2.0;
            return Math.sqrt(u * (u - a) * (u - b) * (u - c));
        }
    }
