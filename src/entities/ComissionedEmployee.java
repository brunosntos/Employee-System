package entities;

public class ComissionedEmployee extends Employee {
    private double daysWorked;

    public ComissionedEmployee(String name, int age, double wage, Sectors sector, double daysWorked) {
        super(name, age, wage, sector);
        this.daysWorked = daysWorked;
    }


    @Override
    public double calculatePayment() {
        double totalWage = daysWorked * this.wage;

        return totalWage;
    }

    public double getDaysWorked() {
        return daysWorked;
    }

    public void setDaysWorked(double daysWorked) {
        this.daysWorked = daysWorked;
    }
}
