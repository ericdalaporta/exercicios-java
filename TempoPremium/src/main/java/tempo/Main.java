package tempo;

public class Main {

    public static void main(String[] args) {

        Tempo t = new Tempo();

        t.setHoras(1);
        t.setMinutos(23);
        t.setSegundos(40);

        System.out.println("Horas: " + t.getHoras());
        System.out.println("Minutos: " + t.getMinutos());
        System.out.println("Segundos: " + t.getSegundos());

        System.out.println("Total de segundos desde meia noite " + t.getTempoSegundos());
        // quando o metodo eh void tem que chamar com get

        t.incrementarHoras(10);
        t.incrementarMinutos(2);
        t.incrementarSegundos(4);

        System.out.println("Horas: " + t.getHoras());
        System.out.println("Minutos: " + t.getMinutos());
        System.out.println("Segundos: " + t.getSegundos());

        System.out.println(t);
    }

}
