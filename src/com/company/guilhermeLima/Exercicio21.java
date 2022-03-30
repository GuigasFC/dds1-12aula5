package com.company.guilhermeLima;
import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // criar o scanner
        System.out.print("Digite a sua nota: ");
        Double notaDoAluno = scanner.nextDouble(); // usando o scanner
        Boolean passouDeAno = notaDoAluno >= 70;
        if (passouDeAno) {
            System.out.println("Parabéns! Você passou de ano.");
        } else {
            System.out.println("Infelizmente, ficou de recuperação.");
            scanner.close();
    }   }

}