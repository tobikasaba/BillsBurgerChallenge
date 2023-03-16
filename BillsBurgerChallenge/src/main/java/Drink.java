public class Drink {
    private String type;
    private double size;

    public Drink(String type, double size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return size * 2;
    }

    public double getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size < 100) throw new IllegalArgumentException("Drinks cant be less that 100 ml");
        this.size = size;
    }

}
