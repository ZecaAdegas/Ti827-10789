package introjava;

import java.util.Scanner;

public class Calculadora {
    public static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        do {
            System.out.println("Menu Calculadora");
            System.out.println("1 - Multiplicação");
            System.out.println("2 - Divisão");
            System.out.println("3 - Adição");
            System.out.println("4 - Subtração");
            System.out.println("5 - Raiz quadrada");
            System.out.println("6 - Expoente");
            System.out.println("7 - Sair");
            System.out.println("Escolha a opção pretendida");
            op = ler.nextInt();
            switch (op) {
                case 1:
                    multiplicar();
                    break;
                case 2:
                    dividir();
                    break;
                case 3:
                    adicionar();
                    break;
                case 4:
                    subtrair();
                    break;
                case 5:
                    raiz_quadrada();
                    break;
                case 6:
                    expoente();
                default:
                    System.out.println("Excolha uma opção válida");
                    break;
            }
        } while (op != 7);
    }

    private static void multiplicar() {
        float x1;
        float x2;
        float resultado;
        System.out.println("Insira o primeiro valor:");
        x1 = ler.nextFloat();
        System.out.println("Insira o segundo valor");
        x2 = ler.nextFloat();
        resultado = x1 * x2;
        System.out.println("O resultado da multiplicação é: " + resultado);
    }

    private static void dividir() {
        float x1;
        float x2;
        float resultado;
        System.out.println("Insira o primeiro valor:");
        x1 = ler.nextFloat();
        System.out.println("Insira o segundo valor");
        x2 = ler.nextFloat();
        resultado = x1 / x2;
        System.out.println("O resultado da divisão é: " + resultado);
    }

    private static void adicionar() {
        float x1;
        float x2;
        float resultado;
        System.out.println("Insira o primeiro valor:");
        x1 = ler.nextFloat();
        System.out.println("Insira o segundo valor");
        x2 = ler.nextFloat();
        resultado = x1 + x2;
        System.out.println("O resultado da adição é: " + resultado);
    }

    private static void subtrair() {
        float x1;
        float x2;
        float resultado;
        System.out.println("Insira o primeiro valor:");
        x1 = ler.nextFloat();
        System.out.println("Insira o segundo valor");
        x2 = ler.nextFloat();
        resultado = x1 - x2;
        System.out.println("O resultado da subtração é: " + resultado);
    }

    private static void raiz_quadrada() {
        double x1;
        double resultado;
        System.out.println("Insira o valor:");
        x1 = ler.nextFloat();
        resultado = (double) Math.sqrt(x1);
        System.out.println("A raiz quadrada é: " + resultado);
    }

    private static void expoente() {
        double x1;
        double x2;
        double resultado;
        System.out.println("Insira o primeiro valor:");
        x1 = ler.nextFloat();
        System.out.println("Insira o segundo valor");
        x2 = ler.nextFloat();
        resultado = Math.pow(x1, x2);
        System.out.println("O resultado é: " + resultado);
    }
}
