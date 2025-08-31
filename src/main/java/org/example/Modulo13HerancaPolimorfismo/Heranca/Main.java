package org.example.Modulo13HerancaPolimorfismo.Heranca;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1004, "Alex", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1005, "Maria", 0.0, 500.0);

        /*
        UPCASTING
        funciona pois a classe BusinessAccount herda de Account,
        sendo esta uma relação do tipo "é-um"
         */
        Account acc1 = businessAccount;
        Account acc2 = new BusinessAccount(1006, "789", 0.0, 500.0);
        Account acc3 = new SavingsAccount(1007, "012", 0.0, 0.1);

        /*
        DOWNCASTING


         */
        // não funcionaria
        // BusinessAccount bacc = acc2;

        // funcionaria
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        // instanciacao de subclasse...?
        // não funcionaria pois ambas são subclasses
        // nesses casos o compilador não sabe disso
        // e não iria acusar erro
        // BusinessAccount acc5 = (BusinessAccount) acc3;

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan successful");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc6 = (SavingsAccount) acc3;
            acc6.updateBalance();
            System.out.println("Balance updated");
        }


    }
}
