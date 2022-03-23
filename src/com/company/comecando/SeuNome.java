package com.company.comecando;

import java.util.Scanner;

public class SeuNome {
        public  static  void  main(String [] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("qual o seu nome?" );
            String nome1 = scanner.nextLine();
            System.out.println("e seu sobrenome?" );
            String nome2 = scanner.nextLine();
            System.out.print("e o terceiro?" );
            String nome3 = scanner.nextLine();
            System.out.println("e sua idade?" );
            Double idade = scanner.nextDouble();


            System.out.println("seu nome e:" +  nome1 + nome2 + nome3);
            System.out.println("e tem :" +  idade + " anos de idade" );
            scanner.close();
        }
}
