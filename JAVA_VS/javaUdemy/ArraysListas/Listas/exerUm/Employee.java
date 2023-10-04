package javaUdemy.ArraysListas.Listas.exerUm;

public class Employee {

    private Integer id;
    private String name;
    private Double salario;

    public Employee(Integer id, String name, double salario) {
        this.id = id;
        this.name = name;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalario() {
        return salario;
    }

    public void increaseSalary(double percentage){
        salario+=0.10;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salario=" + salario + "]";
    }
    
}
