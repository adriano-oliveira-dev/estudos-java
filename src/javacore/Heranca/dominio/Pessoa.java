package javacore.Heranca.dominio;

public class Pessoa {
    private String nome;
    private  int idade;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome,String cpf, int idade, Endereco endereco) {
        this.nome = nome;
        this.cpf =cpf;
        this.idade = idade;
        this.endereco = endereco;
    }


    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Idade: "+this.idade);
        System.out.println("Endereço: "+this.endereco.getRua()+", CEP: "+this.endereco.getCep());

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
