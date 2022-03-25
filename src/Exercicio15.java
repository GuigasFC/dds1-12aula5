import java.util.Scanner;

public class Exercicio15 {
    public  static  void  main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quanto você ganha por hora: " );
        System.out.print("Escreva o número de horas trabalhadas no mês: " );
        Double salarioMensal = scanner.nextDouble();
        int fatorInss = 8 / 100;
        int fatorImpostoDeRenda = 11 / 100;
        int fatorDoSindicato = 5 / 100;
        Double salarioLiquido = salarioMensal - fatorDoSindicato - fatorInss - fatorImpostoDeRenda;
        System.out.println("seu salário líquido é: " + salarioLiquido );
        scanner.close();

    }


}


