package org.example.Modulo12EnumComposicao.ExercicioDeFixacao;

public class OrderItem {
    private Integer quantity;
    private Double price;

    public Double subTotal() {
        return quantity * price;
    }
}
