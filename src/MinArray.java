import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao do dai cua mang");
        int size = input.nextInt();
        int [] array = new int[size];

        for (int i = 0 ; i < size ; i++){
            System.out.println("array["+i +"]: ");
            array[i] = input.nextInt();
        }

        int min = array[0];
        for (int i =0 ; i < array.length ; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        System.out.println("min array is : " +min);
    }
}
