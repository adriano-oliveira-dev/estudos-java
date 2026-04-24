package javacore.classes.dominio;



public class Funcionario {
    private String nome;
    private  int idade;
    private double [] salarios;
    private double media;


    /*public void setSalario(double... salarios ){
        this.salario = salarios;
        double somaSa = 0;
        double div=0;
        for (double num : salarios) {
            somaSa = somaSa+salarios[(int)num];
            if(num == salarios.length){
                System.out.println("A média salarial é: "+somaSa/num);
            }

        }


    }*/

    public void dados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        for (double salario: salarios) {
            System.out.println("Salário: "+salario);
        }
        System.out.println("-------------------------------");
        imprimeInfos();

    }

    public void imprimeInfos(){
        //double soma =0;
        double media =0;

        //int i=0;
        /*for (double num : salarios) {
            soma = soma+salarios[i];
            i++;*/

        for (double salario: salarios) {
            media +=salario;



        }
        media /= salarios.length;
        System.out.println(media);

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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


}
