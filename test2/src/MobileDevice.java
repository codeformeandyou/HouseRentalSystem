public class MobileDevice implements RadioTuner {
    private String manufacturer;
    private String model;
    String station;
    double frequency;

    public MobileDevice(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void setStation(String s) {
        station = s;
    }

    @Override
    public void setFrequency(double d) {
        frequency = d;
    }

    public void printDetails() {
        System.out.println("Station:" + station);
        System.out.println("Frqeuency:" + frequency);
    }
}