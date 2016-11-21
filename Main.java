import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of array elements: ");
        int[] arr = new int[sc.nextInt()];
        inputArray(arr);
        outputArray(arr);
    }

    public static void inputArray(int[] arr1){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter " + (i + 1) + " element of array: ");
            arr1[i]=sc.nextInt();
        }
    }

    public static void outputArray(int[] arr1){
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }
    }

}
