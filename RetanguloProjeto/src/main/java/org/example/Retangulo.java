package org.example;

public class Retangulo {
        private double largura;
        private double altura;

        public double getLargura () {
            return largura;
        }

        public double getAltura () {
            return altura;
        }

        public void setLargura(double largura) {
            if (largura >= 0 && largura <= 20) {
                this.largura = largura;
            }
            else {
                System.out.println("digite um valor entre 0 e 20");
            }
        }

        public void setAltura (double altura) {
            if (altura >= 0 && altura <= 20) {
                this.altura = altura;
            }
        }

        // agora vou criar um metodo que calculo a area

        public double calcularArea () {
            return altura * largura;
        }

        public double calcularPerimetro () {
            return 2 * (altura + largura);
        }
    }