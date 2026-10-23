
class Developer extends Employee {

    double bonus = 5000;

    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return salary + bonus;

    }

    static void showRole() {
        System.out.println("Developer Role");

    }
}
