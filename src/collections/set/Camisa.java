package collections.set;

public class Camisa {
    private int size;
    private String color;

    public Camisa(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Camisa camisa = (Camisa) obj;
        return size == camisa.size && color.equals(camisa.color);
    }

    @Override
    public int hashCode() {
        return 31 * color.hashCode() + size;
    }

    @Override
    public String toString() {
        return "Camisa [cor=" + color + ", tamanho=" + size + "]";
    }
}
