public class ExtendsConstructor {
    int x;
    int y;

    public ExtendsConstructor() {
        x=10;
    }

    public ExtendsConstructor(int y) {
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public static void main(String[] args) {
        One one = new One();
        // will return 10 because the default constructor is called.
        System.out.println(one.getX());
        
        Two two = new Two();
        // will return 0 because the constructor call with a input does not change x
        System.out.println(two.getX());
    }
}

class One extends ExtendsConstructor{
    int a;

    public One() {
        a=3;
    }
}


class Two extends ExtendsConstructor{
    int a;

    public Two() {
        super(1);
        a=3;
    }
}
