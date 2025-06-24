# ☕ Orientação a Objetos em Java – Projetos Práticos

> Conjunto de exercícios práticos desenvolvidos para reforçar os princípios da Programação Orientada a Objetos (POO) com Java.

## 📌 Descrição

Esta pasta contém uma coleção de pequenos projetos desenvolvidos como parte do meu aprendizado de Java, com foco em conceitos fundamentais da **Programação Orientada a Objetos (POO)**.

Cada projeto explora aspectos como encapsulamento, herança, abstração e polimorfismo, aplicados em simulações do mundo real, como contas bancárias, transações e cofres digitais.

---

## 💡 Projetos incluídos

### 🔸 `Desafio.java`
Simula a criação de uma **Conta Poupança** com leitura de dados via terminal e uso de herança entre classes:
- `ContaBancaria`: classe base.
- `ContaPoupanca`: classe filha com `taxaJuros`.
- Uso de `DecimalFormat` para formatação monetária.
  
✔️ *Conceitos:* Herança, sobrescrita de métodos (`override`), construtores, encapsulamento.

---

### 🔸 `MainContaBancaria.java`
Simula **operações bancárias básicas** (depósito e saque) com verificação de saldo:
- Criação de conta com saldo inicial.
- Métodos `depositar`, `sacar` e `imprimirSaldo`.

✔️ *Conceitos:* Encapsulamento, validação de dados, organização de métodos.

---

### 🔸 `RegistroDeTransacoesBancarias.java`
Controla **várias transações bancárias**, exibindo o saldo final e o histórico das operações:
- Usa `ArrayList<String>` para armazenar descrições.
- Loop com validação de tipo (`D` ou `S`).
  
✔️ *Conceitos:* Listas, controle de fluxo, estrutura de repetição, entrada de dados formatada.

---

### 🔸 `RegistroTransacoesComStream.java`
Versão otimizada com uso de **Streams e programação funcional**:
- Classe `Transacao` modela cada operação.
- Uso de `stream()`, `map()` e `collect()` para exibir transações.

✔️ *Conceitos:* POO + programação funcional em Java, lambdas, Stream API.

---

### 🔸 `Soma.java` (Sistema de Cofres)
Simula a criação e validação de **cofres digitais e físicos**:
- Classe abstrata `Cofre`.
- Subclasses `CofreDigital` e `CofreFisico`.
- Verificação de senha em tempo real.
  
✔️ *Conceitos:* Abstração, herança, polimorfismo, uso de `instanceof`, validação condicional.

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- IDE: VSCode ou IntelliJ IDEA
- Execução via terminal

