package tempo;

public class Tempo {

    private double segundos;
    private double minutos;
    private double horas;
    private double tempoEmSegundos;

    public double getSegundos () {
        return segundos;
    }

    public double getMinutos () {
        return minutos;
    }

    public double getHoras () {
        return horas;
    }

    public void setSegundos (double segundos){
        if (segundos >= 0 && segundos <= 59){
            this.segundos = segundos;
        }
        else {
            System.out.println("Segundos invalido");
        }
    }

    public void setMinutos (double minutos){
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        }
        else {
            System.out.println("Minutos invalido");
        }
    }

    public void setHoras (double horas){
        if (horas >= 0 && horas <= 23){
            this.horas = horas;
        }
        else {
            System.out.println("Horas invalido");
        }
    }


    // parte de transformar tudo em segundos pós meia noite

    public void tempoSegundos() {
        tempoEmSegundos = horas * 3600 + minutos * 60 + segundos;
    }

    public double getTempoSegundos () {
        return tempoEmSegundos;
    }

    //lembrar que esse double identidade posso declarar aqui ou la em cima

    public void incrementarSegundos(double quantidade) {
        if (quantidade >= 0 && quantidade <= 59 && quantidade + segundos <= 59){
            this.segundos += quantidade;
        }
        else {
            throw new IllegalArgumentException("Quantidade invalido");
        }

    }

    public void incrementarMinutos (double quantidade) {
        if (quantidade >= 0 && quantidade <= 59 && quantidade + minutos <= 59){
            this.minutos += quantidade;
        }
        else {
            throw new IllegalArgumentException("Quantidade invalido");
        }
    }

    public void incrementarHoras (double quantidade) {
        if (quantidade >= 0 && quantidade <= 23 && quantidade + horas <= 23){
            this.horas += quantidade;
        }
        else {
            throw new IllegalArgumentException("Quantidade invalido");
        }
    }

    @Override
    public String toString() {
        return String.format("%02.0f:%02.0f:%02.0f", horas, minutos, segundos);
    }
}
