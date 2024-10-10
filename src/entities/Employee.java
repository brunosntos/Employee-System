package entities;

public abstract class Employee {
    protected String name;
    protected int age;
    protected double wage;
    protected Sectors sector;

    public Employee(String name, int age, double wage, Sectors sector) {
        this.name = name;
        this.age = age;
        this.wage = wage;
        this.sector = sector;
    }

    public abstract double calculatePayment();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWage() {
        return wage;
    }

    public Sectors getSector() {
        return sector;
    }
}
