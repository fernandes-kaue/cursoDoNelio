package org.example.Modulo13HerancaPolimorfismo.Heranca;

/**
 * Conta empresarial com funcionalidade adicional de empréstimo com limite.
 *
 * @author Kaue
 * @since 2025-08-30
 * @version 1.0
 */
public class BusinessAccount extends Account{
    private Double loanLimit;

    /** Construtor padrão. */
    public BusinessAccount() {
        super();
    }

    /**
     * Constrói uma conta empresarial com limite de empréstimo.
     * @param number número da conta
     * @param holder titular
     * @param balance saldo inicial
     * @param loanLimit limite de empréstimo disponível
     */
    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    // é possível chamar a implementação da superclasse
    // utilizando a palavra-chave super
    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
        balance -= 2;
    }

    /**
     * Realiza um empréstimo, creditando o valor ao saldo caso não ultrapasse o limite disponível.
     * @param value valor solicitado
     */
    public void loan(Double value){
        if (value > this.loanLimit) {
            System.out.println("The value of the loan exceeds the limit");
            return;
        }
        this.deposit(value);
        this.loanLimit -= value;
    }

    /**
     * Obtém o limite de empréstimo disponível.
     * @return limite disponível
     */
    public Double getLoanLimit() {
        return loanLimit;
    }

    /**
     * Define o limite de empréstimo.
     * @param loanLimit novo limite
     */
    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
