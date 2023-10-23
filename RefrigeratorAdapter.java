package adapterPattern;

public class RefrigeratorAdapter implements PowerOutlet {
    private Refrigerator refrigerator;

    public RefrigeratorAdapter(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }

    public void plugIn() {
        refrigerator.startCooling();
    }
}