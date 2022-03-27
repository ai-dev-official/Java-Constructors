package ex2;

import java.util.Scanner;

public class TestEmployeeDetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double sales[];
        double avrSales;
        double min;
        double total;

        EmployeeDetails emp 	= new EmployeeDetails("Ann Bronte","Programmer"
                ,"Information Technology",45000);
        sales = emp.readSales();
        avrSales = emp.calcAvrSales(sales);
        System.out.println(emp.getName() + "'s average sales was " + avrSales);
        emp.print();
        min = emp.findSmallest(sales);
        System.out.println(emp.getName() + "'s minimum sales value was €" + min);

        total = emp.calctotal(sales);
        emp.printArray(sales);
    }
}

