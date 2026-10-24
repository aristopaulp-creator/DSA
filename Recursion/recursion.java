package Recursion;
import java.util.Scanner;

public class recursion{
    static int[] a;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = scan.nextInt();

        a = new int[n];

        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }

        reverse(0, n-1);

        System.out.print("Reversed array: ");
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();

        scan.close();
    }

    static void reverse(int x, int y){
        if(x >= y){
            return;
        }
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
        reverse(x+1, y-1);
    }

    /* 
    //Back Tracking print from N to 1
    static void BackTrack(int i, int n){

        if(i > n){
            return;
        }

         BackTrack(i+1, n);
         System.out.println(i);
    }
    
    static void name(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("Aristo");

        name(i+1, n);
    }

    //sumation in parameter
    static void sum(int i, int sum){
        if(i < 1){
            System.out.println(sum);
            return;
        }

        sum(i-1, sum+i);
    }
    

    //Sumation in fn. al
    static int sum(int n){
        if(n == 0){
            return 0;
        }
        
        return n + sum(n-1);
    }
    

    //Factorial in fn. al
    static int fact(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        
        return n * fact(n-1);
    }
        */



}
