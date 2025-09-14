package org.example.Modulo13HerancaPolimorfismo.Heranca;

/**
 * Conta poupança que atualiza o saldo com base em uma taxa de juros.
 *
 * @author Kaue
 * @since 2025-08-30
 * @version 1.0
 */
// para classes, a palavra final impede que a classe seja herdada
public final class SavingsAccount extends Account{
    private Double interestRate;

    /** Construtor padrão. */
    public SavingsAccount() {
        super();
    }

    /**
     * Constrói uma conta poupança com taxa de juros.
     * @param number número da conta
     * @param holder titular
     * @param balance saldo inicial
     * @param interestRate taxa de juros (ex.: 0.1 para 10%)
     */
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    // utiliza-se o @Override para se sobrepor/sobrescrever métodos
    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }

    /**
     * Obtém a taxa de juros.
     * @return taxa de juros
     */
    // final para métodos impede que o método seja sobrescrito
    public final Double getInterestRate() {
        return interestRate;
    }

    /**
     * Define a taxa de juros.
     * @param interestRate taxa de juros
     */
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    /**
     * Atualiza o saldo aplicando a taxa de juros vigente.
     */
    public void updateBalance() {
        balance += balance * interestRate;
    }
}
