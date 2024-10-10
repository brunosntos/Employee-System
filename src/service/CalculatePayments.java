package service;

import entities.*;

public class CalculatePayments {
    public static void calculatePayments(Employee employee){
        System.out.println("-------------------------");
        System.out.println("Employee report");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Wage: $" + employee.getWage());
        System.out.println("Sector: " + employee.getSector());

        if (employee instanceof HourlyEmployee) {
            HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;

            System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
        }

        if (employee instanceof ComissionedEmployee){
            ComissionedEmployee comissionedEmployee = (ComissionedEmployee) employee;
            System.out.println("Days Worked: " + comissionedEmployee.getDaysWorked());
        }

        double payment = employee.calculatePayment();
        System.out.println("Payment: $" + payment);

        double bonus = employee.getSector().calculateBonus(payment);
        System.out.println("Bonus: $" + bonus);

        System.out.println("Full payment: $" + (payment + bonus));


    }
}
