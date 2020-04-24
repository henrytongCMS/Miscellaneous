class Bicycle {

    static int bicycleCounter;
    Frame frame;
    Wheel wheel;

    public Bicycle(Frame frame, Wheel wheel) {
        bicycleCounter += 1;
        this.frame = frame;
        this.wheel = wheel;
    }

    public void changeFrame(Frame frame) {
        this.frame = frame;
    }

    public void changeWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public double getCost() {
        return 500 + this.frame.getCost() + this.wheel.getCost();
    }

}