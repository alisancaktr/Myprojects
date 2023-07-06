package ERAY4;

public class Computer {
    protected CPU cpu;
    protected RAM ram;

    public Computer(CPU cpu, RAM ram) {
        this.cpu = cpu;
        this.ram = ram;
    }
   void run(){
       int[] temp = new int[ram.getCapacity()];

       for (int i = 0; i < ram.getCapacity(); i++) {
           for (int j = 0; j < ram.getCapacity(); j++) {
               temp[j] = ram.getValue(i, j);
               i++;
           }
       }
       int sum = 0;
       for (int i = 0; i < temp.length; i++) {

           sum = cpu.compute(sum, temp[i]);
       }
       ram.setValue(0, 0, sum);
    }

    public String toString(){

        return " “Computer: ” + cpu + “ “ + ram ";
    }


}
