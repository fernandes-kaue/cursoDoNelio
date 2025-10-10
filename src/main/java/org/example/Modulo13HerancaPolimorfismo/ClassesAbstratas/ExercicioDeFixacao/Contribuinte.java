package org.example.Modulo13HerancaPolimorfismo.ClassesAbstratas.ExercicioDeFixacao;

public abstract class Contribuinte {
    public Contribuinte() {
    }

    public abstract Double getIR();
    public abstract Double getImposto();
    public abstract Double getTotalImposto();
}
