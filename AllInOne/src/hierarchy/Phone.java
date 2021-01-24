package hierarchy;

public class Phone {

    private String model;
    private String display_Resolution;
    private String display_Size;
    private String battery;
    private String OS;


    public String getModel() { return model; }

    public String getDisplayResolution() { return display_Resolution; }

    public String getDisplaySize() { return display_Size; }

    public String getBattery() { return battery; }

    public String getOS() { return OS; }

    public void setModel(String model) {
        this.model = model;
    }

    public void setDisplayResolution(String display_Resolution) {
        this.display_Resolution = display_Resolution;
    }

    public void setDisplaySize(String display_Size) {
        this.display_Size = display_Size;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setOS(String OS){
        this.OS = OS;
    }
}