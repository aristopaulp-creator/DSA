import java.util.*;
import java.util.Scanner;

public class numberHash {
    public static int []hashArr = new int[1000000000];
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of an Array: ");
        int n = scan.nextInt();
        int []arr = new int[n];

        System.out.println("Enter elements of an Array: ");
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        //pre proccessing
        for(int i = 0; i<n; i++){
            hashArr[arr[i]] += 1;
        }

        System.out.print("Enter No. Of quaries: ");
        int quary = scan.nextInt();
        while(quary!=0){
            //fetch
            System.out.print("Enter the number to be searched: ");
            int number = scan.nextInt();
            System.out.println(hashArr[number]);

            quary--;
        }
    }
    
}