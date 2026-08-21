# Projeto Conta Bancária

## Descrição

Este projeto foi desenvolvido para praticar conceitos de Programação Orientada a Objetos (POO), principalmente métodos, comportamentos, atributos e regras de negócio.

A classe `ContaBancaria` representa uma conta bancária do mundo real.

## Atributos

A classe possui dois atributos:

- `titular`: armazena o nome do dono da conta.
- `saldo`: armazena o valor disponível na conta.

## Métodos

### depositar()

O método `depositar()` adiciona um valor ao saldo da conta.

Existe uma regra de negócio que impede depósitos com valores menores ou iguais a zero.

Exemplo:

```java
conta.depositar(500);
