import java.util.*;

public class pair {
    public static void main(String [] args){

        Map.Entry<Integer, Map.Entry<String, Map.Entry<Integer, String>>> name = new AbstractMap.SimpleEntry<>(1, new AbstractMap.SimpleEntry<>("Aristo", new AbstractMap.SimpleEntry<>(2, "Paul")));
        
        System.out.println(name.getKey());
        System.out.println(name.getValue().getKey());
        System.out.println(name.getValue().getValue().getKey());
        System.out.println(name.getValue().getValue().getValue());

        Pair<Integer, Integer> p = new Pair<>(1, 2);

        System.out.print(p.first + " " + p.secound);
    }
    public static class Pair<A, B>{
        A first;
        B secound;

        Pair(A first, B secound){
            this.first = first;
            this.secound = secound;
        }
    }
}
