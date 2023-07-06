package ERAY4;

public class Laptop extends Computer {

    private int milliAmp;
    private int battery;

    public Laptop(CPU cpu, RAM ram, int milliAmp, int battery) {
        super(cpu, ram);
        setMilliAmp(milliAmp);
        this.battery = milliAmp * 3 / 10;
    }

    int batteryPercentage() {
        return 100 * battery / milliAmp;
    }

    void charge() {
        if (this.battery < 89) {
            this.battery = this.battery + (2*milliAmp/100);
        }
    }

    @Override
    void run() {
        if (this.battery > 5) {
            super.run();
            this.battery = this.battery - 3;
        } else {
            charge();
        }
    }

    public String toString(){
        return super.toString() + " " + this.battery;
    }

    public int getMilliAmp() {
        return milliAmp;
    }

    public void setMilliAmp(int milliAmp) {
        this.milliAmp = milliAmp;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }


}
