package challenges.casa;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa();
        casa.paint("red");

        Porta porta1 = new Porta(true);
        Porta porta2 = new Porta(false);
        Porta porta3 = new Porta();
        porta3.setOpen(false);

        casa.addDoor(porta1);
        casa.addDoor(porta2);
        casa.addDoor(porta3);

        System.out.println("Portas abertas: " + casa.getTotalDoorsOpen());
        System.out.println("Total de Portas: " + casa.getTotalDoors());
    }
}
