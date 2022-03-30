package com.company.guilhermeLima;

import java.util.Scanner;

public class Exercicio20 {
        public  static  void  main(String [] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Digite um numero: ");
            Double numero = scanner.nextDouble();
            Double numeroElevado = numero * numero;
            System.out.println("seu numero elevado ao quadrado é: " + numeroElevado);
            scanner.close();
        }
}
