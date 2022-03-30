package com.company.guilhermeLima;

import java.util.Scanner;

public  class CalcularIndiceMassaCorporal {
public  static  void  main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Calculo do Indice de Massa Corporal");
    System.out.print("Digite seu peso (em KG):  ");
    Double peso = scanner.nextDouble();
    System.out.print("Digite sua altura (em metros):");
    Double altura = scanner.nextDouble();
    Double alturaAoQuadrado = altura * altura;
    Double IndiceMassaCorporal = peso / alturaAoQuadrado;
    System.out.println("seu IMC e: " + IndiceMassaCorporal);
    scanner.close();
}

}

