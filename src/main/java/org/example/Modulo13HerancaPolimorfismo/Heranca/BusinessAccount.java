package org.example.Modulo13HerancaPolimorfismo.Heranca;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public void loan(Double value){
        if (value > this.loanLimit) {
            System.out.println("The value of the loan exceeds the limit");
            return;
        }
        this.deposit(value);
        this.loanLimit -= value;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
}
