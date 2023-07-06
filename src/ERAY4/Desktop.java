package ERAY4;

import java.util.ArrayList;
import java.util.Arrays;

public class Desktop extends Computer {
    private ArrayList<String> peripherals;

    public Desktop(CPU cpu, RAM ram, String... peripherals) {
        super(cpu, ram);
        this.peripherals = new ArrayList<>( Arrays.asList(peripherals) );
    }
    public void run(){

        int sum = 0;
        for (int i = 0; i < ram.getCapacity(); i++) {
            for (int j = 0; j < ram.getCapacity(); j++) {
                sum = cpu.compute(sum, ram.getValue(i, j));
            }
        }
        ram.setValue(0, 0, sum);
    }

    public void plugIn(String peripheral){
        this.peripherals.add(peripheral);
    }

    public String plugOut(){
        return peripherals.remove(peripherals.size() - 1);
    }

    public String plugOut(int index){
        return peripherals.remove(index);
    }

    public String toString() {
        String txt = "Computer: " + cpu + " " + ram + " peripherals: ";

        for (int i = 0; i < peripherals.size(); i++) {

            if (i == peripherals.size() - 1) {
                txt += peripherals.get(i);
            } else {
                txt += peripherals.get(i) + " ";
            }
        }
        return txt;
    }


    public ArrayList<String> getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(ArrayList<String> peripherals) {
        this.peripherals = peripherals;
    }
}
