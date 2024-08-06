package EliminarMetade;

import java.util.ArrayList;
import java.util.Random;

public class EliminarMetade {

    public static void run() {
        // Creating the list
        ArrayList<String> listaDeNomes = new ArrayList<>();

        // Inserting data into the list
        listaDeNomes.add("Allana Coqueiro");
        listaDeNomes.add("Ângelo Prado");
        listaDeNomes.add("Caio Tawfiq");
        listaDeNomes.add("Carlos Eduardo");
        listaDeNomes.add("Diego Alencar");
        listaDeNomes.add("Diego Castan");
        listaDeNomes.add("Eduarda Rabelo");
        listaDeNomes.add("Esther da Cunha");
        listaDeNomes.add("Felipe Meira");
        listaDeNomes.add("Gabriel Bonaretti");
        listaDeNomes.add("Giovana Radaeli");
        listaDeNomes.add("Giovanna Fiuza");
        listaDeNomes.add("Giovana Vieira");
        listaDeNomes.add("Henrique Brito");
        listaDeNomes.add("Julia Guiraldeli");
        listaDeNomes.add("Laura Pigosso");
        listaDeNomes.add("Lucas Baccelli");
        listaDeNomes.add("Nicole Siqueira");

        listaDeNomes.add("Cauê dos Santos");

        Random rnd = new Random();

        int tamanhoLista;

        // Defyning how many itens will be drawn
        // if the legth of the list is even, half of the names will be drawn,
        // otherwise half +1 of the names will be drawn
        if (listaDeNomes.size() % 2 == 0) {
            tamanhoLista = listaDeNomes.size() / 2;
        } else {
            tamanhoLista = listaDeNomes.size() / 2 + 1;
        }

        // adding the names into an other list
        int auxInt;
        for (int i = 0; i < tamanhoLista; i++) {
            auxInt = rnd.nextInt(listaDeNomes.size());
            listaDeNomes.remove(auxInt);
        }


        // Printing the result as a table:
        int count = 0;
        for (String nome : listaDeNomes) {
            int tamanhoPalavra = nome.length();
            if (count != 3) {
                System.out.print(nome);
                count++;

                for (int i = 0; i < 20 - tamanhoPalavra; i++) {
                    System.out.print(" ");
                }

            } else {
                System.out.println(nome);
                count = 0;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}