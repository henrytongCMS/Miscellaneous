import java.util.*;

public class CTriangle{

    private int edge1, edge2, edge3;

    public CTriangle(){
        // Random generate edges
        Random r = new Random();

        int min = 1;
        int max = 50;

        this.edge1 = r.nextInt((max-min)+1)+min;
        this.edge2 = r.nextInt((max-min)+1)+min;
        this.edge3 = r.nextInt((max-min)+1)+min;
    }

    public CTriangle(int a, int b, int c){
        this.edge1 = a;
        this.edge2 = b;
        this.edge3 = c;
    }

    public void setEdges(int a, int b, int c){
        this.edge1 = a;
        this.edge2 = b;
        this.edge3 = c;
    }

    public int [] getEdges(){
        return new int[] {edge1, edge2, edge3}; 
    }

    public boolean isTriangle(){
        return edge1 + edge2 > edge3 && edge1 + edge3 > edge2 && edge2 + edge3 > edge1;
    }

}