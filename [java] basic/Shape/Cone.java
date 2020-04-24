class Cone extends Circle{

    private int x2, y2, x3, y3;
    
    public Cone() {
    }

    public Cone(int x1, int y1, int r, int x2, int y2, int x3, int y3) {
        super(x1, y1, r);
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public int getX2() {
        return this.x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return this.y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX3() {
        return this.x3;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getY3() {
        return this.y3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    @Override
    public void draw(){
        super.draw();
        System.out.println("(x2, y2) = (" + x2 + ", " + y2 + ")");
        System.out.println("(x3, y3) = (" + x3 + ", " + y3 + ")");
    }
    
}