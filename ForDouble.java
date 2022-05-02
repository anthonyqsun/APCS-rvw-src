import java.util.ArrayList;

public class ForDouble {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);

        System.out.println("1:");
        for (int x = 0; x < ints.size(); ints.remove(0)) {
            System.out.println(ints.get(0));
        }

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);
        ints.add(10); //will throw error bc of line 32 if not here
        System.out.println("2:");
        for (int x = 0; x < ints.size(); ints.remove(0)) {
            System.out.println(ints.get(0));
            ints.remove(0);
        }
    }
}
