package composite_pattern;

public class Organisation {
    public static void main(String[] args) {
        Manager generalManager = new Manager();
        
        
        Manager manager1 = new Manager();
        Manager manager2 = new Manager();
        
        Developer developer1 = new Developer(50000);
        Developer developer2 = new Developer(60000);
        Developer developer3 = new Developer(70000);

        manager1.add(developer1);
        manager1.add(developer2);
        
        manager2.add(developer3);

        generalManager.add(manager1);
        generalManager.add(manager2);

        System.out.println("Total Salary: " + generalManager.getSalary());
    }
}
