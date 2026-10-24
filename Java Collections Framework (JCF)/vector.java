import java.util.ArrayList;
import java.util.Vector;
import java.util.*;

public class vector {
    public static void main(String [] args){
        Vector<Integer> v = new Vector<>();

        //Adding elements
        v.add(10);
        v.add(20);
        v.add(30);

        System.out.println("Vector Elements");
        System.out.println(v);

        //Add using Index
        v.add(3, 40);

        System.out.println("Vector Elements");
        for(int x : v){
            System.out.println(x);
        }

        //Get first & last element
        System.out.println("First and Last Elements");
        System.out.println(v.firstElement());
        System.out.println(v.lastElement());
        
        //Update
        v.set(0, 100);
        
        //Enhanced for loop
        System.out.println("Updated");
        for(int x : v){
            System.out.println(x);
        }
        
        //Revove using index
        System.out.println("Vector Elements");
        v.remove(3);
        for(int x : v){
            System.out.println(x);
        }
        
        //Revove obj
        v.removeElement(20);

        //get by index
        System.out.println(v.get(0));

        //Size
        System.out.println("Size :" + v.size());

        //Check element
        if(v.contains(100)){
            System.out.println("Vector contains 100");
        }

        v.clear();

        //check empty
        if(v.isEmpty()){
            System.out.println("Vector is Empty");
        }

    }
    
}
