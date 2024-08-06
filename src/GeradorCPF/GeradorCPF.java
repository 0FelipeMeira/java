package GeradorCPF;

import java.util.ArrayList;
import java.util.Scanner;

public class GeradorCPF {

    public static void run() {
        /** Método para calcular o digito de um CPF * */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> cpf = new ArrayList<Integer>();

        /* Pedindo a inserção do CPF*/
        System.out.println("Digite o CPF sem o os 2 ultimos digitos");
        String cpfString = sc.next();

        /* Convertendo o CPF para um Array de char*/
        char[] cpfCharArray = cpfString.toCharArray();

        /* Convertendo o CPF para um Array numérico*/
        for (char aux : cpfCharArray) {
            cpf.add(Character.getNumericValue(aux));
        }

        /* Calculando o primeiro digito */
        int soma = 0;
        int auxInt = 10;
        for (int i = 0; i < cpf.size(); i++) {
            soma += cpf.get(i) * auxInt;
            auxInt--;
        }

        int d1 = 11 - (soma % 11);
        if (d1 > 9) { d1 = 0; }
        System.out.println("d1: "+d1);
        cpf.add(d1);

        /* Calculando o segundo digito */
        soma = 0;
        int auxInt2 = 11;
        for (int i = 0; i < cpf.size(); i++) {
            soma += cpf.get(i) * auxInt2;
            auxInt2--;
        }

        int d2 = 11 - (soma % 11);
        if (d2 > 9) { d2 = 0; }
        cpf.add(d2);
        System.out.println("d2: "+d2);

        /* Exibindo CPF final */
        for (int i = 0; i < cpf.size(); i++) {
            if (i == 3 || i == 6) {
                System.out.print(".");
            } else if (i == 9) {
                System.out.print("-");
            }
            System.out.print(cpf.get(i));
        }
    }
}