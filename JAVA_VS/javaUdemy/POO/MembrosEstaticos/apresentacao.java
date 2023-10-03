package javaUdemy.POO.MembrosEstaticos;

public class apresentacao {
    /*
     * MEMEBROS ESTÁTICOS
     * também são chamados de mebros de classe (em oposição a membros e instacia)
     * São mebros que afzen sentido independentemente de objetos paras serem chamados a partir do própio nome da classe.
     * 
     * APLICAÇÃO COMUM:
     * Classes utilitárias e declaração de constantes
     * 
     * Uma classe que possui somente membros estátitos, pode ser uma classe estática também. Esta classe poderá ser instanciada.
     */
    public static void main(String[] args) {
        double mate = Math.sqrt(2.0); /*Aqui chamando um membro estático*/
        /* x = new Triangle();
         * x.area() : aqui estou chamando um método por um objeto. coisa que não
         * acontece o membros estático que é chamado diretamente
         * 
         * Cada objeto eu tenho um comportamente diferente, mas o membro estático
         * é sempre o mesmo resultado
          */
    }
    
}
