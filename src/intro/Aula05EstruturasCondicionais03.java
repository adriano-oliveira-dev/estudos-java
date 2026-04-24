package intro;

import java.util.Scanner;
public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //dados os valores de 1 a 7, imprima se é dia util ou final de semana.
        //considerando 1 como domingo.

        byte dia =0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o dia da semana, ex: digite 1 para domingo.");
        dia = scn.nextByte();

        switch (dia){
            default:
                System.out.println("Opção invalida!");
            break;

            case 1:
                System.out.println("Domingo! Final de semana!");
            break;

            case 2:
                System.out.println(" Segunda! Dia util!");
            break;

            case 3:
                System.out.println("Terça! Dia Ultil");
            break;

            case 4:
                System.out.println("Quarta! Dia util!");
            break;

            case 5:
                System.out.println("Quinta! Dia util!");
            break;

            case 6:
                System.out.println(" Sexta! Quase lá, Mas ainda Dia util!");
            break;

            case 7:
                System.out.println("Sabado! Final de semana!");
            break;


        }



    }
}
