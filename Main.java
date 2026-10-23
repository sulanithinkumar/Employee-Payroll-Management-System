
public class Main {

    public static void main(String[] args) {

        System.out.println("Company name: " + Employee.companyName);
        Developer dev = new Developer(101, "Rahul", 40000.0);
        accessMethod(dev);

        Trainer trainer = new Trainer(102, "Priya", 35000.0);
        accessMethod(trainer);

        System.out.println("Total Employees: " + Employee.employeeCount + "\n");

        Employee.showRole();
        Developer.showRole();
        Trainer.showRole();

    }

    static void accessMethod(Employee emp) {
        emp.displayDetails();

    }

}
