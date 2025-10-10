package org.example.Modulo13HerancaPolimorfismo.ClassesAbstratas.ExercicioDeFixacao;

public class PessoaFisica extends Contribuinte {
    private Double gastosComSaude;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public Double getIR() {
        if (rendaAnual < 20000) {
            return rendaAnual * 0.15;
        } else {
            return rendaAnual * 0.25;
        }
    }

    public Double getImposto() {
        if (gastosComSaude != null && gastosComSaude != 0) {
            return gastosComSaude * 0.5;
        }
        return 0.0;
    }

    public Double getTotalImposto() {
        return getIR() + getImposto();
    }
}
