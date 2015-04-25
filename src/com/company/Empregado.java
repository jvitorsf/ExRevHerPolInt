package com.company;

/**
 * Created by joaovitor on 4/24/15.
 */
public class Empregado  implements Pagamento {
    private String firstName;
    private String lastName;
    private String matricula;
    private double salario;

    // Construtor
    public Empregado(String first, String last, String mat, double sal){
        firstName = first;
        lastName = last;
        matricula = mat;
        salario = sal;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = (salario < 0.0) ? 0.0 : salario; // Valida salário
    }

    // Retorno string do objeto fatura
    public String toString(){
        return ("Numero matrícula: " + this.getFirstName() + " - " +
        this.getLastName() + " - " +this.getMatricula() + " - " +
        this.getSalario());
    }

    // Método requerido para executar o método da interface Pagamento
    public double getTotalPagamento(){
        return getSalario() * 10.0; // Calcula preço total
    }
}
