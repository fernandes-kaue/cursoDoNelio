package org.example.Modulo13HerancaPolimorfismo.Polimorfismo.ExercicioDeFixacao;

public class ImportedProduct extends Product{
    private Double customFees;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customFees) {
        super(name, price);
        this.customFees = customFees;
    }

    @Override
    public String priceTag() {
        return String.format("%.2f", super.getName() + " $ " + totalPrice() + " (Custom fee: $" + getCustomFees() + ")");
    }

    public Double totalPrice() {
        return super.getPrice() + customFees;
    }

    public Double getCustomFees() {
        return customFees;
    }

    public void setCustomFees(Double customFees) {
        this.customFees = customFees;
    }
}
