class Component {

    private String id;
    private double cost;

    public Component(String id, double cost) {
        this.id = id;
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }

}

class Frame extends Component {

    String frameType;

    Frame(String id, String frameType, double cost) {
        super(id, cost);
        this.frameType = frameType;
    }

}

class Wheel extends Component {

    int wheelSize;

    Wheel(String id, int wheelSize, int cost) {
        super(id, cost);
        this.wheelSize = wheelSize;
    }

}