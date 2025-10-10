package org.example.Modulo13HerancaPolimorfismo.ClassesAbstratas.ExercicioDeFixacao;

public class PessoaJuridica extends Contribuinte {
    private Integer numeroDeFuncionarios;

    @Override
    public Double getIR() {
        if (numeroDeFuncionarios > 10) {
            return rendaAnual * 0.14;
        } else return rendaAnual * 0.16;
    }
}
