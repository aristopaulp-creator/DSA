package Recursion;
import java.util.Scanner;
import java.util.*;

public class reverseArr{
    static int[] a;
    static int n;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        n = scan.nextInt();

        a = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        reverse(0);

        System.out.print("Reversed array: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scan.close();
    }

    static void reverse(int x){
        if(x >= n/2){
            return;
        }
       // int temp = a[x];
        //a[x] = a[n-x-1];
        //a[n-x-1] = temp;

        //Collection.swap(a, x, n-x-1);
        reverse(x+1);
    }
}