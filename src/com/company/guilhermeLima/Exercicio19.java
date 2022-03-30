package com.company.guilhermeLima;

import java.util.Scanner;

public class Exercicio19 {
        public  static  void  main(String [] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("qual o seu nome? " );
            String nome = scanner.nextLine();
            System.out.print("e seu sobrenome? " );
            String sobreNome = scanner.nextLine();
            System.out.print("e sua idade? " );
            Double idade = scanner.nextDouble();


            System.out.println("seu nome é: " + nome + " " + sobreNome);
            System.out.println("e você tem: " +  idade + " " + "anos de idade" );
            scanner.close();
        }
}
