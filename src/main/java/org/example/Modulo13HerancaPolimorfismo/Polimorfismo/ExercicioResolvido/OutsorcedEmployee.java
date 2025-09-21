package org.example.Modulo13HerancaPolimorfismo.Polimorfismo.ExercicioResolvido;

public class OutsorcedEmployee extends Employee{
    private Double additionalCharge;

    public OutsorcedEmployee(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    public OutsorcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + additionalCharge + (additionalCharge * 0.1);
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}
