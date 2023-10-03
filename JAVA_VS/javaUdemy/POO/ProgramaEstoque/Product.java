package javaUdemy.POO.ProgramaEstoque;
public class Product {
    public String name;
    public double price;
    public int quantity;
    public double totalValueInStock(){
        return price * quantity;
    }
    public void addProducts(int quantity){
        this.quantity+=quantity;   /*Usamos this para falar que 
                                    queremso acessar o 
                                    atributo e não o argumento */
    }
    public void removeProducts(int quantity){
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
