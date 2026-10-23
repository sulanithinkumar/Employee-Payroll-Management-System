
class Trainer extends Employee {

    double allowance = 3000;

    Trainer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    double calculateSalary() {
        return salary + allowance;

    }

    static void showRole() {
        System.out.println("Trainer Role");

    }
}
