package javacore.Heranca.dominio;

public class Gerente02 extends Funcionario02{
    private String departamento;

    public Gerente02(String nome, String cpf, double salario, String departamento) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }

    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("Departamento: "+this.departamento);
    }

    public void calcularBonus(){
        super.calcularBonus();
        double bonusGerente = this.salario * 0.2;
        System.out.println("Total bonus gerente: "+bonusGerente);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
