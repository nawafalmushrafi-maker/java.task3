package idea.project.java.task3;
import  java.util.*;

public class EmployeeSalaryCalculator {
    public static void main(String args[]){
        //Declare Var
        String name ="";
        double salary=0;
        double bonusAmount=0;
        double deductionAmount=0;
        double netSalary=0;
        String status="";

        Scanner input = new Scanner(System.in);

        IO.println("Enter employee Name:");

        name = input.nextLine();
        IO.println("Enter employee Salary:");

        salary=input.nextDouble();
        IO.println("Enter employee Bonus Amount:");

        bonusAmount=input.nextDouble();
        IO.println("Enter employee Deduction Amount:");
        deductionAmount=input.nextDouble();
        // call the functions
        netSalary=calculateNetSalary(salary,bonusAmount,deductionAmount);
        status=checkSalaryStatus(netSalary);
        displaySalaryDetails(name, salary,bonusAmount,deductionAmount,netSalary,status);

    }
    public static double calculateNetSalary(double salary ,double bonus , double deduction ){
        return salary+bonus+deduction;
    }

    public static String checkSalaryStatus(double netSalary){
        String status ="";
        if(netSalary<500 && netSalary>0){
            status ="low salary";
        }
        else if(netSalary>=500 && netSalary<=1500){
            status ="medium salary";
        }
        else{
            status ="high salary";
        }

        return status;
    }

    public static void  displaySalaryDetails(String name, double salary, double bonus, double deduction, double netSalary,String status){
        IO.println("Name: "+name);
        IO.println("Status: "+status);
        IO.println("Bonus: "+bonus);
        IO.println("NetSalary: "+netSalary);
        IO.println("Salary: "+salary);
        IO.println("Deduction: "+deduction);






    }

}
