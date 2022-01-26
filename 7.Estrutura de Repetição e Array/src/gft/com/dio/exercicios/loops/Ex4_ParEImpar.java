package gft.com.dio.exercicios.loops;

import java.util.Scanner;
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantidadeNumeros;
        int Numero;
        int quantidadePares = 0, quantidadeImpares = 0;
        System.out.println("Quantidades de Números: ");
        quantidadeNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            Numero = scan.nextInt();

            if (Numero % 2 == 0) quantidadePares++;
            else quantidadeImpares++;
            count++;
        } while (count < quantidadeNumeros);
        System.out.println("Quantidade Par: " + quantidadePares);
        System.out.println("Quantidade Ímpar: " + quantidadeImpares);
    }
}
