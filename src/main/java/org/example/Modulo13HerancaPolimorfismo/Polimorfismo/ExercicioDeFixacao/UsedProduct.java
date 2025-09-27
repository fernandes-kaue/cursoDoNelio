package org.example.Modulo13HerancaPolimorfismo.Polimorfismo.ExercicioDeFixacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
    private Date manufactureDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public UsedProduct() {
    }

    public UsedProduct(Date manufactureDate, SimpleDateFormat sdf) {
        this.manufactureDate = manufactureDate;
        this.sdf = sdf;
    }

    @Override
    public String priceTag() {
        return String.format("%.2f", super.getName() + " (used) $ " + super.getPrice() + " (Manufacture date: " + sdf.format(manufactureDate) + ")");
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }
}
