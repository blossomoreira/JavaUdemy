package javaUdemy.POO.ConstrutoresThisSobrecargaEncapsulamento;

public class Product {
    /*Construtores é uma operaçção especial da classe, que executa
     no momento da instanciação do objeto
    
     USOS COMUNS:
     Inicar valores dos atributos

     Permitir ou obrigar que o objeto receba dados / dependenciais no momento
     em que for instanciado

     Se um construtor customizado não for especificado, a classe disponibiza o construtor padrão;

     Product p = new product();

     É possivel especificar masi de um construtor na mesma classe (sobrecarga)
     */

     /*CLASSE PRODUCT*/

    private String name;
    private double price;
    private int quantity;

    public Product (){ /*cONSTRUTOR PADR˜AO */
    }

    public Product(String name, double price, int quantity){ 
        
        /* Criando um método comum. é parecido com um método 
         * Esses nomes nos parametros podem ser qualquer um. */
        this.name = name; 
        /* A palavra THIS é uma referencia ao própio objeto
        onde elas são usadas para diferenciar atributos de váriaveis locais
        e passar o própio objeto como argumento na chamada de um método
        ou construtor */
        this.price = price;
        this.quantity = quantity;
        
    }

    public Product (String name, double price){ /* Construtor sobrecarregado */
        this.name = name;
        this.price = price; 
    }

    public int getQuantity(){
        return quantity;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double totalValueInStock(){
        return price * quantity;
    }

    public void addProducts(int quantity){
        this.quantity+=quantity;

    }

    public void removeProduct(int quantity){
        this.quantity-=quantity;
    }

    public String toString(){
        return name
            + ", $ "
            + String.format("%.2f", price)
            + ", "
            + quantity
            + " units, Total: $ "
            + String.format("%.2f", totalValueInStock()); 
    }
    
}
