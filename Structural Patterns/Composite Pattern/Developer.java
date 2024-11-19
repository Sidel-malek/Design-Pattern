package composite_pattern;
// Leaf class
public class Developer implements Employee {
    private double salary;

    public Developer(double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }  
    
}
