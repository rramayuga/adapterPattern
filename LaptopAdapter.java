package adapterPattern;

public class LaptopAdapter implements PowerOutlet {
    private Laptop laptop;

    public LaptopAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    public void plugIn() {
        laptop.charge();
    }
}