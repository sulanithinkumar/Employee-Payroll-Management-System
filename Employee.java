
abstract class Employee {

    static String companyName = "KodNest";
    static int employeeCount = 0;
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {

        this.id = id;
        this.name = name;
        this.salary = salary;
        employeeCount++;
    }

    abstract double calculateSalary();

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: " + getClass().getSimpleName());
        System.out.println("salary: " + calculateSalary() + "\n");

    }

    static void showRole() {
        System.out.println("Employee Role");
    }

}
