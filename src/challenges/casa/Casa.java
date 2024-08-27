package challenges.casa;

public class Casa {
    private String color;
    private int totalDoors;
    private Porta[] portas;

    public Casa(String color, int totalDoors, Porta[] portas) {
        this.color = color;
        this.totalDoors = totalDoors;
        this.portas = new Porta[0];
    }

    public Casa(String color, int totalDoors) {
        this.color = color;
        this.totalDoors = totalDoors;
    }

    public Casa() {
        this.portas = new Porta[0];
    }

    public void paint(String color) {
        this.color = color;
    }

    public int getTotalDoorsOpen() {
        int totalDoorsOpen = 0;
        for (Porta porta : portas) {
            if (porta.isOpen()) {
                totalDoorsOpen++;
            }
        }
        return totalDoorsOpen;
    }

    public void addDoor(Porta p) {
        Porta[] newPortas = new Porta[portas.length + 1];
        System.arraycopy(portas, 0, newPortas, 0, portas.length);

        newPortas[newPortas.length - 1] = p;

        portas = newPortas;
        totalDoors++;
    }

    public int getTotalDoors() {
       return totalDoors;
    }

}
