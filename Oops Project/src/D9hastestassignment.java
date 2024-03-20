// class Ahello {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!"); 
//     }
// }

public class D9hastestassignment {

    public static void main(String[] args) {
        Processor proc = new Processor("Snapdragon 865");
        Battery batt = new Battery("4000 mAh");
        Screen scrn = new Screen("AMOLED");

        MobileFactory factory = new MobileFactory();
        MobilePhone phone = factory.manufactureMobile(proc, batt, scrn);

        System.out.println("Manufactured Mobile Phone: " + phone);

        // Using mobile phone methods
        phone.powerOn();
        phone.checkStatus();
        phone.displayInfo();
        phone.powerOff();
    }
}

class MobileFactory {

    MobilePhone manufactureMobile(Processor processor, Battery battery, Screen screen) {
        System.out.println("Mobile manufacturing in progress...");
        MobilePhone phone = new MobilePhone();
        phone.setProcessor(processor);
        phone.setBattery(battery);
        phone.setScreen(screen);
        return phone;
    }

    MobilePhone customizeMobile(Processor processor, Battery battery, Screen screen, String customFeature) {
        System.out.println("Customizing mobile phone...");
        MobilePhone phone = manufactureMobile(processor, battery, screen);
        phone.setCustomFeature(customFeature);
        return phone;
    }
}

class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Processor [model=" + model + "]";
    }
}

class Battery {
    private String capacity;

    public Battery(String capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Battery [capacity=" + capacity + "]";
    }
}

class Screen {
    private String type;

    public Screen(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Screen [type=" + type + "]";
    }
}

class MobilePhone {
    private Processor processor;
    private Battery battery;
    private Screen screen;
    private boolean poweredOn;
    private String customFeature;

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setCustomFeature(String customFeature) {
        this.customFeature = customFeature;
    }

    public void powerOn() {
        System.out.println("Mobile phone is powering on...");
        poweredOn = true;
    }

    public void powerOff() {
        System.out.println("Mobile phone is powering off...");
        poweredOn = false;
    }

    public void checkStatus() {
        System.out.println("Mobile phone is " + (poweredOn ? "powered on" : "powered off"));
    }

    public void displayInfo() {
        System.out.println("Mobile Phone Information:");
        System.out.println(processor);
        System.out.println(battery);
        System.out.println(screen);
        if (customFeature != null && !customFeature.isEmpty()) {
            System.out.println("Custom Feature: " + customFeature);
        }
    }

    @Override
    public String toString() {
        return "MobilePhone [processor=" + processor + ", battery=" + battery + ", screen=" + screen + "]";
    }
}