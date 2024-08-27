package challenges.casa;

public class Porta {
    private boolean isOpen;

    public Porta(boolean isOpen) {
        this.isOpen = isOpen;
    }

    public Porta() {
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }
}
