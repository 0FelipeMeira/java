package CalculadoraGeometrica;

import java.util.Scanner;

public class Menu {
    void Principal(){
        System.out.println("Bem vindo à calculadora Geométrica");
        System.out.println("[0] - Formas planas");
        System.out.println("[1] - Formas espaciais");
        System.out.println("[2] - Sair");
    }

    void FigPlano(){
        Scanner sc = new Scanner(System.in);
        int option;
        int auxInt1;
        System.out.println("[0] - Quadrado");
        System.out.println("[1] - Circulo");
        System.out.println("[2] - Triangulo");
        System.out.println("[3] - Retangulo");
        System.out.println("[4] - Hexagono Regular");
        System.out.println("Digite uma opção:");
        option = sc.nextInt();
        switch (option){
            case 0:
                System.out.println("Digite o Lado do quadrado:");
                option = sc.nextInt();

                System.out.println( PlanoQuadrado.calcularArea(option) );
                System.out.println( PlanoQuadrado.calcularPerimetro(option) );
                break;
            case 1:
                System.out.println("Digite o raio do circulo:");
                option = sc.nextInt();

                System.out.println( PlanoCirculo.calcularArea(option) );
                System.out.println( PlanoCirculo.calcularPerimetro(option) );
                break;
            case 2:
                System.out.println("Digite o lado do triangulo:");
                option = sc.nextInt();

                System.out.println( PlanoTrianguloEquilatero.calcularArea(option) );
                System.out.println( PlanoTrianguloEquilatero.calcularPerimetro(option) );
                break;
            case 3:
                System.out.println("Digite o primeiro lado do retângulo:");
                option = sc.nextInt();

                System.out.println("Digite o segundo lado do retângulo:");
                auxInt1 = sc.nextInt();

                System.out.println( PlanoRetangulo.calcularArea(option, auxInt1) );
                System.out.println( PlanoRetangulo.calcularPerimetro(option, auxInt1) );
                break;
            case 4:
                System.out.println("Digite o lado do hexagono regular:");
                option = sc.nextInt();

                System.out.println( PlanoHexagonoRegular.calcularArea(option));
                System.out.println( PlanoHexagonoRegular.calcularPerimetro(option));
        }
    }

    void FigEspacial(){
        Scanner sc = new Scanner(System.in);
        int option;
        int auxInt1;
        int auxInt2;

        System.out.println("[0] - Cubo");
        System.out.println("[1] - Paralelepipedo");
        System.out.println("[2] - Piramide de base quadrada");
        System.out.println("[3] - Esfera");
        System.out.println("[4] - Cilindro");
        System.out.println("[5] - Cone");
        System.out.println("Digite uma opção:");
        option = sc.nextInt();
        switch (option) {
            case 0:
                System.out.println("Digite um dos Lados do Cubo:");
                option = sc.nextInt();

                System.out.println( EspCubo.calcularAreaSuperficial(option) );
                System.out.println( EspCubo.calcularVolume(option) );
                break;
            case 1:
                System.out.println("Digite o primeiro lado do Paralelepípedo:");
                option = sc.nextInt();

                System.out.println("Digite o segundo lado do Paralelepípedo:");
                auxInt1 = sc.nextInt();

                System.out.println("Digite o terceiro lado do Paralelepípedo:");
                auxInt2 = sc.nextInt();

                System.out.println( EspParalelepipedo.calcularAreaSuperficial(option, auxInt1, auxInt2) );
                System.out.println( EspParalelepipedo.calcularVolume(option, auxInt1, auxInt2) );
                break;
            case 2:
                System.out.println("Digite a altura da Piramide de Base Quadrada:");
                option = sc.nextInt();

                System.out.println("Digite o lado da Piramide de Base Quadrada:");
                auxInt1 = sc.nextInt();

                System.out.println( EspPiramideBaseQuadrada.calcularAreaSuperficial(option, auxInt1) );
                System.out.println( EspPiramideBaseQuadrada.calcularVolume(option, auxInt1) );
                break;
            case 3:
                System.out.println("Digite o raio da Esfera:");
                option = sc.nextInt();

                System.out.println( EspEsfera.calcularAreaSuperficial(option) );
                System.out.println( EspEsfera.calcularVolume(option) );
                break;
            case 4:
                System.out.println("Digite a altura do Cilindro:");
                option = sc.nextInt();

                System.out.println("Digite o raio da base do Cilindro:");
                auxInt1 = sc.nextInt();

                System.out.println( EspCilindro.calcularAreaSuperficial(option, auxInt1) );
                System.out.println( EspCilindro.calcularVolume(option, auxInt1) );
                break;
            case 5:
                System.out.println("Digite o raio do Cilindro:");
                option = sc.nextInt();

                System.out.println("Digite a altura do Cilindro:");
                auxInt1 = sc.nextInt();

                System.out.println( EspCilindro.calcularVolume(option,auxInt1) );
                System.out.println( EspCilindro.calcularAreaSuperficial(option,auxInt1) );
        }
    }
}
