package org.example.Modulo13HerancaPolimorfismo.ClassesAbstratas.ExercicioDeFixacao;

public abstract class Contribuinte {
    String nome;
    Double rendaAnual;

    public Contribuinte() {
    }

    public abstract Double getIR();

}
