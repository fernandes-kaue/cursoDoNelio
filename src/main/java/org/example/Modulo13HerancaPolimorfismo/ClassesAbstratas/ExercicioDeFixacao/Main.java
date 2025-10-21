package org.example.Modulo13HerancaPolimorfismo.ClassesAbstratas.ExercicioDeFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Digite o número de contribuintes: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Contribuinte #" + i + ":");
            System.out.print("Pessoa física ou jurídica (f/j)? ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine(); // limpar buffer
            String nome = sc.nextLine();
            System.out.print("Renda anual: ");
            Double rendaAnual = sc.nextDouble();

            if (tipo == 'f' || tipo == 'F') {
                System.out.print("Gastos com saúde: ");
                Double gastosComSaude = sc.nextDouble();
                contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosComSaude));
            } else if (tipo == 'j' || tipo == 'J') {
                System.out.print("Número de funcionários: ");
                Integer numeroDeFuncionarios = sc.nextInt();
                PessoaJuridica pj = new PessoaJuridica(nome, rendaAnual, numeroDeFuncionarios);
                contribuintes.add(pj);
            }
        }

        System.out.println();
        System.out.println("IMPOSTOS PAGOS:");

        double totalImpostos = 0.0;
        for (Contribuinte c : contribuintes) {
            double imposto;
            if (c instanceof PessoaFisica) {
                imposto = ((PessoaFisica) c).getTotalImposto();
            } else {
                imposto = c.getIR();
            }
            System.out.printf("%s: $ %.2f%n", c.nome, imposto);
            totalImpostos += imposto;
        }

        System.out.println();
        System.out.printf("TOTAL DE IMPOSTOS: $ %.2f%n", totalImpostos);

        sc.close();
    }
}