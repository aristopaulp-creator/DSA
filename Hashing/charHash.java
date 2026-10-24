import java.util.*;
import java.util.Scanner;

public class charHash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = scan.nextLine();

        //pre proccessing
        int []hashArr = new int[256];
        for(int i = 0; i<s.length(); i++){
            hashArr[s.charAt(i)] += 1;
        }

        System.out.print("Enter No. Of quaries: ");
        int quary = scan.nextInt();
        while(quary!=0){
            //fetch
            System.out.print("Enter the characrtor to be searched: ");
            char c = scan.next().charAt(0);
            System.out.println(hashArr[c]);

            quary--;
        }
    }
    
}