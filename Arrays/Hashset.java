import java.util.*;
public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> Set = new HashSet();

        //Insert
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(3);

        //Search
        if(Set.contains(1)){
            System.out.println("It contains 1");
        }

        Set.remove(3);

        System.out.println(Set.size());
        System.out.println(Set);

    }
}
