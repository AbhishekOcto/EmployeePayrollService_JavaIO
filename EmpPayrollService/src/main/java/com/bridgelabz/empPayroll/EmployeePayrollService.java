package com.bridgelabz.empPayroll;

import java.util.ArrayList;
import java.util.Scanner;

    /* @author - ABHISHEK
     * since - 10.09.2022
     * */

    /*Create an Employee Payroll Service
    to Read and Write Employee Payroll to a Console
     */

    public class EmployeePayrollService {
        static ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>(); // Declaring an ArrayList
        static Scanner sc = new Scanner(System.in);
        public EmployeePayrollService(ArrayList<EmployeePayrollData> employeePayrollList) {} //Constructor

        private void readEmployeePayrollData(Scanner sc){
            System.out.println("Enter Employee Id: ");
            int id = EmployeePayrollService.sc.nextInt();
            System.out.println("Enter Employee Name: ");
            String name = EmployeePayrollService.sc.next();
            System.out.println("Enter Employee Salary: ");
            double salary = EmployeePayrollService.sc.nextDouble();
            employeePayrollList.add(new EmployeePayrollData(id, name, salary));
        }
        private void writeEmployeePayrollData(){
            System.out.println("\n Writing Employee Payroll Roaster To Console\n " +employeePayrollList);
        }

        public static void main(String[] args) {
            EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
            employeePayrollService.readEmployeePayrollData(sc);
            employeePayrollService.writeEmployeePayrollData();
        }
}
