package test;

import entities.*;
import service.CalculatePayments;

public class EmployeeTest01 {
    public static void main(String[] args) {
        Employee employee1 = new HourlyEmployee("Steve", 32, 5, Sectors.SALES, 100);
        Employee employee2 = new MonthlyEmployee("Sophia", 29, 800, Sectors.PRODUCTION);
        Employee employee3 = new HourlyEmployee("Emma", 25,7, Sectors.ADMINISTRATIVE, 50);
        Employee employee4 = new ComissionedEmployee("Noah", 19, 40, Sectors.PRODUCTION, 15);
        Employee employee5 = new MonthlyEmployee("James", 57, 3000, Sectors.ADMINISTRATIVE);

        CalculatePayments.calculatePayments(employee1);
        CalculatePayments.calculatePayments(employee2);
        CalculatePayments.calculatePayments(employee3);
        CalculatePayments.calculatePayments(employee4);
        CalculatePayments.calculatePayments(employee5);
    }
}
