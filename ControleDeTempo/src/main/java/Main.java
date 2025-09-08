public class Main {
    public static void main(String[] args) {

        Tempo t = new Tempo();

        t.setHoras(14);
        t.setMinutos(30);
        t.setSegundos(45);

        System.out.println("Horas: " + t.getHoras());
        System.out.println("Minutos: " + t.getMinutos());
        System.out.println("Segundos: " + t.getSegundos());

    }
}
