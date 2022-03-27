package ex1;

import java.util.Scanner;

public class TestEmployeeDetails {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salesIn[];
        int days;
        double avrSales;
        double min;

        EmployeeDetails  emp 	= new EmployeeDetails("Ann Bronte","Programmer"
                ,"Information Technology",45000);
        System.out.println("How many days did you work?");
        days = in.nextInt();
        salesIn = new double[days];
        for (int i = 0 ; i < days; i++){
            System.out.println("Please enter sales total for day " + (i +1) );
            salesIn[i] = in.nextDouble();
        }
        avrSales = emp.calcAvrSales(salesIn);
        System.out.println(emp.getName() + "'s average sales was " + avrSales);
        emp.print();
        min = emp.findSmallest(salesIn);
        System.out.println(emp.getName() + "'s minimum sales value was €" + min);
    }
}

