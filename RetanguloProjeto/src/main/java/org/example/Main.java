package org.example;

public class Main {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setAltura(10);
        r.setLargura(5);

        System.out.println("Altura: " + r.getAltura());
        System.out.println("Largura: " + r.getLargura());
        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}
