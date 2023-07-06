package week4projec3;
public class B2 {
    public static void main(String[] args) {

        //Initialize array
        int[] arr = new int[]{1, 3123, 5, -3, 13, 101, 50, -131, 6, 191, 311, -500, 6, 19, -3, -5, 101};

        System.out.println("Duplicate elements in given array: ");
        //Searches for duplicate element
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}