
public class Employee {

    private Employee boss;
    private String ID;
    private double totalBonus;

    public Employee() {
    }

    public Employee(String ID) {
        this.ID = ID;
    }

    public Employee(String ID, Employee boss) {
        this.ID = ID;
        this.boss = boss;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    public double getBonus() {
        return totalBonus;
    }

    public void addBonus(double value) {

        this.totalBonus +=  value * 0.1;
        
        if( this.getBoss() != null )
            this.boss.addBonus( value * 0.1 );
         
    }


}