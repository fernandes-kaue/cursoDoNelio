package org.example.Modulo13HerancaPolimorfismo.ClassesAbstratas.MetodosAbstratos;

public class Circle extends Shape{
    private Double radius;

    public Circle() {
        super();
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Color getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
