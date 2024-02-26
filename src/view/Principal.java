package view;

import controller.FatorialRecursivo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        FatorialRecursivo fatorialRecursivo = new FatorialRecursivo();

        System.out.println("Entre com o número a ser fatorado: ");

        double n = scan.nextInt();

        double resultado = fatorialRecursivo.calcFatorial(n);

        System.out.println("O fatorial de " + n + " é: " +resultado);

    }
}
