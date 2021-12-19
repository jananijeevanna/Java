import java.util.Scanner;

public class Question7And8 {

    public static void main(String[] args) {
        int[] unsortedArray = new int []{ 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be searched- ");
        int userInput = input.nextInt();
        boolean isPresent = false;
        for (int i=0; i<unsortedArray.length; i++) {
            if(userInput == unsortedArray[i]) {
                isPresent = true;
                break;
            }
        }
        System.out.println("Is entered value present in the Array: " + isPresent);
        bubbleSort(unsortedArray);
    }

    public static void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
        for( int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

}