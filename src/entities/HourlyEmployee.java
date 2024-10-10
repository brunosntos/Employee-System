package entities;

public class HourlyEmployee extends Employee {
    private double hoursWorked;

    public HourlyEmployee(String name, int age, double wage, Sectors sector, double hoursWorked) {
        super(name, age, wage, sector);
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePayment() {
        double totalWage = this.wage * this.hoursWorked;

        return totalWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

}
