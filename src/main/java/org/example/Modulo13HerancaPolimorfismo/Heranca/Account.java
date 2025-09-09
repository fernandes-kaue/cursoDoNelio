package org.example.Modulo13HerancaPolimorfismo.Heranca;

/**
 * Classe base de conta bancária demonstrando encapsulamento e herança.
 * Fornece operações básicas de depósito e saque.
 *
 * @author Kaue
 * @since 2025-08-30
 * @version 1.0
 */
public class Account {
    private Integer number;
    private String holder;
    // protected permite que outras classes do mesmo pacote acessem o atributo
    protected Double balance;

    /**
     * Construtor padrão.
     */
    public Account() {
    }

    /**
     * Constrói uma conta com número, titular e saldo inicial.
     * @param number número da conta
     * @param holder nome do titular
     * @param balance saldo inicial
     */
    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    /**
     * Obtém o número da conta.
     * @return número
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Define o número da conta.
     * @param number número
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Obtém o titular da conta.
     * @return titular
     */
    public String getHolder() {
        return holder;
    }

    /**
     * Define o titular da conta.
     * @param holder titular
     */
    public void setHolder(String holder) {
        this.holder = holder;
    }

    /**
     * Obtém o saldo atual.
     * @return saldo
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Realiza um saque, debitando o valor informado do saldo.
     * @param value valor a sacar
     */
    public void withdraw(Double value) {
        this.balance -= value;
    }

    /**
     * Realiza um depósito, creditando o valor informado ao saldo.
     * @param value valor a depositar
     */
    public void deposit(Double value) {
        this.balance += value;
    }
    // meu almoço é mt curtooo :((
}
