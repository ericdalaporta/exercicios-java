public class Tempo {
    private double horas;
    private double minutos;
    private double segundos;

    // Getters
    public double getHoras() {
        return horas;
    }

    public double getMinutos() {
        return minutos;
    }

    public double getSegundos() {
        return segundos;
    }

    // Setters com validação
    public void setHoras(double horas) {
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
        } else {
            System.out.println("Horas deve ser entre 0 e 23");
        }
    }

    public void setMinutos(double minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            System.out.println("Minutos deve ser entre 0 e 59");
        }
    }

    public void setSegundos(double segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            System.out.println("Segundos deve ser entre 0 e 59");
        }
    }
}
