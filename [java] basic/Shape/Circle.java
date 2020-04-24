class Circle extends Shape{

    private int r;

    public Circle() {
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public int getRadius() {
        return this.r;
    }

    public void setRadius(int r) {
        this.r = r;
    }

    @Override
    public void draw(){
        System.out.println("radius = " + r);
        super.draw();
    }

}