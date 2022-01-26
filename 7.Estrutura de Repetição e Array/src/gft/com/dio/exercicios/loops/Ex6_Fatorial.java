package gft.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int Fatorial = scan.nextInt();

        int Multiplicacao = 1;

        System.out.print(Fatorial + "! = ");

        for (int i = Fatorial; i >= 1; i--) {
            Multiplicacao = Multiplicacao * i;
        }
        System.out.println(Multiplicacao);
    }
}
