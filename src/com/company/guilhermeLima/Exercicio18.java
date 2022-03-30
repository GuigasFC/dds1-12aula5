package com.company.guilhermeLima;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do arquivo em MB: ");
        double tamanhoDoArquivo = scanner.nextDouble();
        System.out.print("Digite a velocidade do link de internet em Mbps: ");
        double velocidadeDoLinkDeInternet = scanner.nextDouble();
        Byte fatorDeConversaoEmSegundos = 8;
        double velocidadeDoLinkDeInternetEmSegundos = velocidadeDoLinkDeInternet / fatorDeConversaoEmSegundos;
        double tempoAproximadoDeDownloadEmSegundos = tamanhoDoArquivo / velocidadeDoLinkDeInternetEmSegundos;
        Byte fatorDeConversaoEmMinutos = 60;
        double tempoAproximadoDeDownloadEmMinutos = tempoAproximadoDeDownloadEmSegundos / fatorDeConversaoEmMinutos;
        System.out.print("O tempo aproximado de Download é de: " + tempoAproximadoDeDownloadEmMinutos + " " + "megabytes por minutos.");
        scanner.close();
    }
}
