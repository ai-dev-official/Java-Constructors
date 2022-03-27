package ex2;

import java.util.Scanner;

public class EmployeeDetails {
    //define attributes
    private String name;
    private String position;
    private String department;
    private double salary;
    private double sales[];

    //constructor should be first method
    EmployeeDetails(String nameIn, String positionIn, String departmentIn, double salaryIn) {
        name = nameIn;
        position = positionIn;
        department = departmentIn;
        salary = salaryIn;
    }

    //overloaded constructor
    EmployeeDetails(String nameIn, String positionIn, double salaryIn) {
        name = nameIn;
        position = positionIn;
        if (position.equals("Programmer") || position.equals("Analyst")) {
            department = "Information Technology";
        } else {
            department = "Finance";
        }
        salary = salaryIn;
    }

    //getter methods for attributes
    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return this.position;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    //setter method for salary
    public boolean setSalary(double newSalary) {
        //change the exisiting salary to the new value passed in if within limits  of  40000-90000
        //how would we notify the calling program whether the salary was updated or not?
        //try doing editing the method to do this
        boolean result;
        if ((newSalary < 40000) || (newSalary > 90000)) {
            this.salary = 0;
            result = false;
        } else {
            this.salary = newSalary;
            result = true;
        }
        return result;

    }

    //setter method for Name

    public void setName(String newName) {
        //change the exisiting Name to the new value passed in
        this.name = newName;
    }

    //setter method for position

    public void setPosition(String newPosition) {
        //change the exisiting position to the new value passed in
        this.position = newPosition;
    }

    //setter method for department

    public void setDepartment(String newDepartment) {
        //change the exisiting department to the new value passed in
        this.department = newDepartment;
    }

    //define a print method
    public void print() {
        System.out.println("\tEmployee Details");
        System.out.printf("Name is     : %22s%n", name);
        System.out.printf("Position    : %22s%n", position);
        System.out.printf("Department  : %22s%n", department);
        System.out.printf("Salary      : %,21.2f€%n", salary);
    }
    public double calcAvrSales(double []sales){
        double total= 0,average =0;
        for (int i = 0; i < sales.length; i++){
            total += sales[i];
        }
        average = total/sales.length;
        return average;
    }

    public double findSmallest(double []sales){
        double min=Double.MAX_VALUE;
        for (int i = 0; i < sales.length; i++){
            if(sales[i]<min){
                min=sales[i];
            }
        }
        return min;
    }

    public double[] readSales(){
        // square brackets beside return type indicate
        // that an array will be returned, returns a ref to an array of double
        Scanner in = new Scanner(System.in);
        System.out.println("How many days did you work?");
        int days = in.nextInt();
        sales = new double[days];

        for (int i = 0 ; i < days; i++){
            System.out.println("Please enter sales total for day " + (i +1) );
            sales[i] = in.nextDouble();
        }
        return sales;  //return the name of the array
    }
    public double calctotal(double []sales){
        double sum=0.0;
        for (int i = 0; i < sales.length; i++){
            sum+=sales[i];
            }

        return sum;
    }
    public void printArray(double[] sales){
        for (int i = 0; i < sales.length; i++){
            System.out.println("Sales for day " +(i+1) +": "+sales[i]);
        }
    }
}
