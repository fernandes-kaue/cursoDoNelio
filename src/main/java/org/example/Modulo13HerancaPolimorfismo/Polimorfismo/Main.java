package org.example.Modulo13HerancaPolimorfismo.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        Account x = new Account(1004, "Alex", 1000.0);
        Account y = new SavingsAccount(1005, "Maria", 1000.0, 0.01);

        // o withdraw de X retira uma taxa de 5 reais por ser conta corrente -> Account
        x.withdraw(50.0);
        // o withdraw de Y não retira taxa, por ser uma poupança -> SavingsAccount
        y.withdraw(50.0);

        // polimorfismo

        System.out.println(x.getBalance());
        System.out.println(y.getBalance());
    }
}
