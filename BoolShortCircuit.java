import java.util.ArrayList;

public class BoolShortCircuit {
    static ArrayList<Integer> x;

    public static void main(String[] args) {
        // all commented lines will throw error

        // x.add(3);

        if (x!=null && x.add(3)) System.out.println(x + " before");
        x=new ArrayList<Integer>();
        if (x!=null && x.add(3)) System.out.println(x + " after");


        
    }
}
