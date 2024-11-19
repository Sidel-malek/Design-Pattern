package composite_pattern;

import java.util.ArrayList;
import java.util.List;

// Composite class

public class Manager implements Employee {
    private List<Employee> subordinates = new ArrayList<>();

    public void add(Employee e) {
        subordinates.add(e);
    
}
public void remove(Employee e) {
    subordinates.remove(e);
}
public Employee getChild(int index) {
    return subordinates.get(index);
}
@Override
public double getSalary() {
    double totalSalary = 0;
    for (Employee subordinate : subordinates) {
        totalSalary += subordinate.getSalary();
    }
    return totalSalary;
}

}
