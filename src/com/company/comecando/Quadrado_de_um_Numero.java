package com.company.comecando;

import java.util.Scanner;

public class Quadrado_de_um_Numero {
        public  static  void  main(String [] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Digite um numero:  ");
            Double n1 = scanner.nextDouble();
            Double numero1 = n1 * n1;
            System.out.println("seu numero elevado ao quadrado e: " + numero1);
            scanner.close();
        }
}
