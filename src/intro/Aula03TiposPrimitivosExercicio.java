package intro;
/*

Prática!

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereço>, confirmo que recebi o salário de <salario>, na data <data>.

 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Adriano";
        String endereco = "Rua presidente café Filho, N 105-7, Bairro Santa Águeda, Cep: 59.570-000 ";
        float salario = 5000;
        String data = "27/11/2026";
        String relatorio = "Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data+".";

        //System.out.println("Eu "+nome+", morando no endereço "+endereco+", confirmo que recebi o salário de "+salario+", na data "+data+".");
        System.out.println(relatorio );


    }
}
