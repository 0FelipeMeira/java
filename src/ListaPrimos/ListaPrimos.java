package ListaPrimos;

import java.util.Scanner;

public class ListaPrimos {
    public static void run() {
        // Criando o Scanner
        Scanner sc = new Scanner(System.in);

        // Pedindo Input
        System.out.println("Type a int number:");
        int number = sc.nextInt();
        int counter;

        // For para passar por todos os numeros, até o valor digitado
        for (int i = 1; i<=number ; i++){
            counter = 0;
            //For para dividir todos os valores com o valor atual do 'for' anterior
            for(int j = i; j>=1; j--){
                // se for divisivel, contador aumenta
                if (i%j==0){
                    counter++;
                }
            }
            // se ao final do loop, o numero só tem 2 divisores, ele é primo
            if (counter == 2 ){
                System.out.print(i+" ");
            }

        }

    }
}

