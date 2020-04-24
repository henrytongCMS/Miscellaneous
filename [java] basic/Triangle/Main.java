
public class Main{
    public static void main(final String[] args) {

        CTriangle triangle = new CTriangle();

        System.out.println("The edges are: " + triangle.getEdges()[0] + " " + triangle.getEdges()[1] + " " + triangle.getEdges()[2]);
        System.out.println("Is a valid triangle? : " + triangle.isTriangle());

    }
}