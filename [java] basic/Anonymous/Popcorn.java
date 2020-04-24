class Popcorn {
    public void pop() {
        System.out.println("popcorn");
    }
}

class Food {
    Popcorn p = new Popcorn() {
        public void pop() {
            System.out.println("anonymous popcorn");
        }
    };
}

class Main {
    public static void main(String [] argv) {

        Popcorn pp = new Popcorn();
        pp.pop();

        Food f = new Food();
        f.p.pop();
        
    }
}