package javacore.Heranca.dominio;

public class Funcionario02 {
    protected String nome;
    protected String cpf;
    protected double salario;

    public Funcionario02(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }
    public void exibirInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Salario: R$"+this.salario);
    }

    public void calcularBonus(){
      double bonus = this.salario * 0.1;
        System.out.println("valor Bonus é: R$"+bonus);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
