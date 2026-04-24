package intro;

import java.util.Scanner;
public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // ESTRUTURAS CONDICIONAIS: IF, IF ELSE
        // OPERADOR TERNARIO TERNARIO: (CONDIÇÃO) ? VERDADEIRO : FALSO


        float salario = 0f;
        float porcentagem = 0f;

        Scanner scn = new Scanner(System.in);
        System.out.println("digite seu salario!");
        salario = scn.nextInt();

        if(salario<=34712f){
            porcentagem = salario * 0.0970f;
            System.out.println("valor a ser tributado é: "+porcentagem);

        } else if (salario > 34712f && salario<=68507f) {
            porcentagem = salario * 0.3735f;
            System.out.println("valor a ser tributado é: "+porcentagem);

        }else {
            porcentagem = salario * 0.4950f;
            System.out.println("valor a ser tributado é: "+porcentagem);

        }
    }
}
