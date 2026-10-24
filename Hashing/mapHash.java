import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class mapHash {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of an Array: ");
        int n = scan.nextInt();
        int []arr = new int[n];

        System.out.println("Enter elements of an Array: ");
        for(int i = 0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        //pre-compute
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        //display
        System.out.println("\n--- Displaying ---");
        Iterator<Map.Entry<Integer, Integer>> mapIterator = map.entrySet().iterator();
        while (mapIterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = mapIterator.next();
            System.out.println("Key-> " + entry.getKey() + " Value-> " + entry.getValue());
        }
        
        System.out.print("Enter No. Of quaries: ");
        int quary = scan.nextInt();
        while(quary!=0){
            //fetch
            System.out.print("Enter the number to be searched: ");
            int number = scan.nextInt();
            System.out.println(map.getOrDefault(number, 0));

            quary--;
        }
    }
}
