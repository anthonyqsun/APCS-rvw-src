public class Override extends PrivateInherit {
    public int returnPub() {
        return pub+10;
    }

    public int returnRealPub() {
        return super.returnPub();
    }

    public static void main(String[] args) {
        Override over = new Override();
        System.out.println(over.returnPub());
        System.out.println(over.returnRealPub());
    }
}
