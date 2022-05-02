public class Scope {
    private int x = 0;

    public int mutate(int x) {
        return x * x + x;
    }

    public int add(int x) {
        x=4;
        return x+10;
    }

    public int subtract() {
        x-=4;
        return x;
    }

    public void incrementY() {
        int y = 0;
        y+=10;
    }

    public static void main(String[] args) {
        // all commented lines will throw error

        Scope scope = new Scope();
        System.out.println(scope.mutate(3));
        System.out.println(scope.add(1));
        System.out.println(scope.subtract());
        System.out.println(scope.subtract());

        
        scope.incrementY();
        // System.out.println(y);
    }
}
