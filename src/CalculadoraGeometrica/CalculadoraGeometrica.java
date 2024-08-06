package CalculadoraGeometrica;

import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void run(){
        /**  Method to start the code
         * ask if the user wants 2d or 3d
         * */
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();

        int option;

        while (true) {
            menu.Principal();
            System.out.println("Digite um numero:");
            option = sc.nextInt();

            if (option == 0) {
                menu.FigPlano();
            } else if (option == 1) {
                menu.FigEspacial();
            } else if (option == 2) {
                break;
            } else {
                System.out.println("Entrada inválida");
            }
        }
    }
}
