public class Main {
    public static void main(String [] argv) {

        MyOuter mo = new MyOuter();
        MyOuter.MyInner mi = mo.new MyInner();
        // MyOuter.MyInner mi = new MyOuter().new MyInner();
        mo.makeInner();
        mi.seeOuter();
        
    }
}