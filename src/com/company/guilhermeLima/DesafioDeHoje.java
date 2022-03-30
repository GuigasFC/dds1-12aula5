package com.company.guilhermeLima;

import java.util.Scanner;

public class DesafioDeHoje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escreva o valor do produto: ");
        double valorDoProduto = scanner.nextDouble();
        System.out.print("Tipo de pagamento [1 = à vista / 2 = a prazo]: ");
        Integer tipoDePagamento = scanner.nextInt();
        Boolean pagamentoAVista = tipoDePagamento.equals(1);
        double juros = 0.0;
        if (!pagamentoAVista); {
        juros = 10.0; }
        double acrescimo = valorDoProduto * juros /100;
        Double valorTotal = acrescimo + valorDoProduto;
        System.out.println("Valor total é: " + valorTotal );






    }





}
