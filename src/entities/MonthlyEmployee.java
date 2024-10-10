package entities;

public class MonthlyEmployee extends Employee {
    public MonthlyEmployee(String name, int age, double wage, Sectors sector) {
        super(name, age, wage, sector);
    }

    @Override
    public double calculatePayment() {
        return this.wage;
    }
}
