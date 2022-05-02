public class Static {
    static private int counter = 0;

    public void addCtr() {
        counter ++;
    }

    public static void minusCtr() {
        counter --;
    }

    public void printCtr() {
        System.out.println(counter);
    }

    public static void main(String[] args) {
        //what is the output of this?
        Static a = new Static();
        Static b = new Static();
        a.addCtr();
        a.printCtr();

        a.addCtr();
        a.printCtr();
        
        minusCtr();
        a.printCtr();

        b.addCtr();
        b.printCtr();

        a.addCtr();
        a.printCtr();
        
        Static.minusCtr();
        a.printCtr();

    }
}