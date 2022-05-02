public class ComplexFor {
    private int x; //inits to 0

    public void initializeX() {
        x=4;
    }

    public boolean checkIfXIsNotZero() {
        return x!=0;
    }

    public void decrementX() {
        x--;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        ComplexFor complex = new ComplexFor();
        for (complex.initializeX(); complex.checkIfXIsNotZero(); complex.decrementX()) {
            System.out.println(complex.getX());
        }
    }
}
