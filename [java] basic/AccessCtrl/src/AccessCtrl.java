class AccessCtrl{

    private double height;
    private double weight;
    private double salary;

    public AccessCtrl() {
    }

    public AccessCtrl(double height, double weight, double salary) {
        this.height = height;
        this.weight = weight;
        this.salary = salary;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void print() {
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Salary: " + salary);
    }

}