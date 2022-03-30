package com.company.guilhermeLima;

import java.util.Scanner;
public class Exercicio15 {
    public  static  void  main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        // variáveis fixas ou constantes ou números fixos
        double taxaInss = 0.08;
        double taxaImpostoDeRenda = 0.11;
        double taxaSindicato = 0.05;

        //perguntas
        System.out.print("Quanto você ganha por hora: " );
        double salarioHora = scanner.nextDouble();
        System.out.print("Escreva o número de horas trabalhadas no mês: " );
        double horasPorMes = scanner.nextDouble();

        //contas
        double salarioMensal = salarioHora * horasPorMes;
        double valorInss = salarioMensal * taxaInss;
        double valorImpostoDeRenda = salarioMensal * taxaImpostoDeRenda;
        double valorSindicato = salarioMensal * taxaSindicato;
        double salarioLiquido = salarioMensal - (valorSindicato+valorInss+valorImpostoDeRenda);
        double impostosTotais = valorSindicato+valorInss+valorImpostoDeRenda;

        //respostas
        System.out.println("seu salario bruto é: " + salarioMensal);
        System.out.println("O valor do inss é: " + valorInss);
        System.out.println("O valor do imposto de renda é: " + valorImpostoDeRenda);
        System.out.println("O valor do sindicato é: " + valorSindicato);
        System.out.println("O valor de todos os impostos é: " + impostosTotais);
        System.out.println("seu salário líquido é: " + salarioLiquido );
        scanner.close();
    }
}


