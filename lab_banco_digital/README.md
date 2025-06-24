# 🏦 Projeto: Banco Digital com Java

> Simulação de um sistema bancário orientado a objetos, com múltiplos tipos de conta e regras de negócio aplicadas.

## 📌 Descrição

Este projeto foi desenvolvido como parte do laboratório prático do Bootcamp Santander – Backend com Java. O objetivo é simular operações de um **Banco Digital**, utilizando os pilares da Programação Orientada a Objetos (POO) para representar contas, clientes e regras bancárias.

O sistema permite:
- Criar um cliente e associá-lo a uma **Conta Corrente** e uma **Conta Poupança**;
- Realizar **depósitos**, **saques** e **transferências** entre contas;
- Aplicar **limite** de crédito na Conta Corrente com base em análise simulada;
- Exibir **extratos formatados** com saldo e limite.

---

## 🧱 Arquitetura e Estrutura

- `Cliente`: Representa o titular da conta.
- `Conta` (abstract): Classe base para contas bancárias, implementando a interface `IConta`.
- `ContaCorrente`: Estende `Conta` com lógica de limite de crédito.
- `ContaPoupanca`: Estende `Conta` com comportamento padrão de poupança.
- `Banco`: Gerencia o nome do banco e as contas existentes.
- `IConta`: Interface com os métodos `sacar`, `depositar`, `transferir` e `imprimirExtrato`.

---

## 🧠 Conceitos Aplicados

- ✔️ Abstração
- ✔️ Encapsulamento
- ✔️ Herança
- ✔️ Polimorfismo
- ✔️ Interface
- ✔️ Classes e Objetos
- ✔️ Entrada e saída com Scanner


