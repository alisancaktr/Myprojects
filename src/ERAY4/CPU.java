package ERAY4;

public class CPU {
    private String name;
    private double clock;

    public CPU(String name, double clock) {
        this.name = name;
        this.clock = clock;
    }

    int compute(int a, int b) {
        return a + b;
    }

    public String toString(){
       return  "CPU: " + this.name + " " + this.clock + "Ghz";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getClock() {
        return clock;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }
}
