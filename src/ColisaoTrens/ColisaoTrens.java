package ColisaoTrens;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ColisaoTrens {
    public static void run(){
        while (true) {

            try {

                Scanner sc = new Scanner(System.in);
                double s0A;
                double s0B;
                double vA;
                double vB;
                double tempo;
                double sFinal;

                //Input dos valores: (apenas inteiros)
                System.out.println("\nINSIRA APENAS VALORES INTEIROS");

                // Posição A
                while (true) {
                    System.out.println("Digite a posição inical do trem A, do KM 0 ao KM 10.000:");
                    s0A = sc.nextDouble();
                    if (0 <= s0A && s0A <= 10000 && s0A % 1 == 0) {
                        break;
                    }
                    System.out.println("Posição Invalida");
                }

                // Posição B
                while (true) {
                    System.out.println("Digite a posição inical do trem B, do KM 0 ao KM 10.000:");
                    s0B = sc.nextDouble();
                    if (0 <= s0B && s0B <= 10000 && s0B % 1 == 0) {
                        break;
                    }
                    System.out.println("Posição Invalida");
                }

                // Velocidade A
                while (true) {
                    System.out.println("Digite a velocidade do trem A,em KM/h, de 0 à 300:");
                    vA = sc.nextDouble();
                    if (0 <= vA && vA <= 300 && vA % 1 == 0) {
                        break;
                    }
                    System.out.println("Velocidade Invalida");
                }

                // Velocidade B
                while (true) {
                    System.out.println("Digite a velocidade do trem B,em KM/h, de 0 à -300:");
                    vB = sc.nextDouble();
                    if (-300 <= vB && vB <= 0 && vB % 1 == 0) {
                        break;
                    }
                    System.out.println("Velocidade Invalida");
                }

                // Verificando se os valores indicados fazem sentido:
                if (s0A > s0B) {
                    System.out.println("Por conta que o Trem A está depois do trem B, eles não se colidirão");
                } else if (vA == 0 && vB == 0) {
                    System.out.println("Como as duas velocidades são 0Km/h, nunca ocorrerá uma colisão entre esses trens");
                } else {

                    // Calculando o tempo em hora:
                    tempo = (s0A - s0B) / (vB - vA) ;

                    // Calculando a posição da colisão:
                    sFinal = (s0A + vA * tempo);

                    // convertendo o tempo de hora para segundo:
                    tempo = tempo * 3600;

                    // Calculando o tempo
                    int hora_inicial = 17;
                    int minuto_inicial = 0;
                    double hora_colisao = 0;
                    double minuto_colisao = 0;
                    double aux;


                    hora_colisao = hora_inicial + tempo/3600;
                    if (tempo%3600 != 0) {
                        aux = tempo - tempo/3600;
                        minuto_colisao = (minuto_inicial) + (aux/60);
                    }

                    System.out.printf("Ocorrerá uma colisão no KM: %.1f, após %.0f segundos <==> %.0f:%.0f", sFinal, tempo, hora_colisao,minuto_colisao);
                }
            } catch (InputMismatchException e) {
                System.out.println("Existe um caracter não reconhecido, tente novamente...");

            }finally {
                String continuar;
                while (true) {
                    Scanner sc = new Scanner(System.in);

                    System.out.println("\n\nDeseja continuar? [S/N]");
                    continuar = sc.next().toUpperCase();
                    if (continuar.equalsIgnoreCase("s")) {
                        break;
                    } else if (continuar.equalsIgnoreCase("n")) {
                        break;
                    } else {
                        System.out.println("Caracter Invalido, Tente novamente...");
                    }
                }
                if(continuar.equalsIgnoreCase("n")){
                    break;
                }

            }

        }
    }
}
