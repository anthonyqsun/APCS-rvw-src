public class PrivateInherit {
    private int priv; //inits to 0
    public int pub;
    
    public int returnPriv() {
        return priv;
    }

    public int returnPub() {
        return pub;
    }

    private void changePriv() {
        priv += 100;
    }

    public int returnChangedPriv() {
        changePriv();
        return priv;
    }

    public static void main(String[] args) {
        (new Sub()).main();
    }

}

class Sub extends PrivateInherit{
    public void main() {
        // all commented lines will throw error

        PrivateInherit p = new PrivateInherit();
        
        // p.priv = 3;
        System.out.println(p.returnPriv());
        System.out.println(p.returnPub());
        p.pub = 3;
        System.out.println(p.returnPub());
        System.out.println();
        System.out.println(p.returnChangedPriv());



    }

    // public int returnPriv() {
    //     return priv +3;
    // }
}