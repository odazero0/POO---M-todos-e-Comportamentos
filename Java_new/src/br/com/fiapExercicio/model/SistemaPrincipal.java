package br.com.fiapExercicio.model;

import br.com.fiapExercicio2.main.ContaBancaria;

public class SistemaPrincipal {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("João", 1000);

        System.out.println("Dados inseridos");
        conta.exibirDados();

        System.out.println("Teste com os dados certos");
        conta.depositar(500);
        conta.sacar(200);

        System.out.println("Teste com os dados errados");
        conta.depositar(-100);
        conta.sacar(2000);

        System.out.println("dados tratados");
        conta.exibirDados();
    }
}