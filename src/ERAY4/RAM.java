package ERAY4;

public class RAM {

    private String type;
    private int capacity;
    private int[][] memory;

    public RAM(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;

    }

    private void initMemory() {
        setCapacity(this.capacity);

        int arr[][] = new int[getCapacity()][getCapacity()];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        setMemory(arr);
    }

    private boolean check(int i, int j) {
        if(i>this.capacity || j>this.capacity || i<0 || j<0){
            return false;
        }
        else{
            return true;
        }
    }

    int getValue(int i, int j) {
        if(check(i, j) == false){
            return -1;
        }

        else{
            return memory[i][j];
        }
    }
    public void setValue(int i , int j , int value){
        if(check(i, j) == true){

            memory[i][j] = value;
        }
    }
    public String toString(){

        return ("Ram: " + type + " " + capacity + "GB");
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int[][] getMemory() {
        return memory;
    }

    public void setMemory(int[][] memory) {
        this.memory = memory;
    }
}
