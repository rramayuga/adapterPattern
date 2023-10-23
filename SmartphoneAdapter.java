package adapterPattern;

public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger charger;

    public SmartphoneAdapter(SmartphoneCharger charger) {
        this.charger = charger;
    }

    public void plugIn() {
        charger.chargePhone();
    }
}