class Shape{

    private int x, y;

    public Shape() {
    }
  
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void draw(){
        System.out.println("(x1, y1) = (" + x + ", " + y + ")");
    }

}