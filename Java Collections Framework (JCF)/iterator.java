import java.util.*;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(10);
        List.add(20);
        List.add(30);

        Iterator<Integer> it = List.iterator();

        while (it.hasNext()) {
            int x = it.next();
            if(x == 30){
                it.remove();
            }
        }

        System.out.print(List);

    }
}
