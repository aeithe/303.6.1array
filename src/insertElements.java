import java.util.Scanner;

public class insertElements {
    public static void main(String[] args) {
        int i, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter 10 Elements: ");
        for(i = 0; i < 10; i++)
            arr[i] = scan.nextInt();

        System.out.println("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;

        System.out.println("\n Now the new array is: ");
        for(i=0; i<11; i++)
            System.out.println(arr[i]+ " ");
    }
}
