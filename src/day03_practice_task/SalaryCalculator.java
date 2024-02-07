package day03_practice_task;

public class SalaryCalculator {

    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 6;
        double federalTaxRate = 26;
        int workWeek = 52;

        double gross = hourlyRate * weeklyHours * workWeek;
        double federalTax = gross * (federalTaxRate/ 100);
        double stateTax = gross * (stateTaxRate/ 100);
        double totalTax = federalTax + stateTax;
        double salaryAfterTax = gross - totalTax;

        System.out.println("gross = $" + gross);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("totalTax = $" + totalTax);
        System.out.println("salaryAfterTax = $" + salaryAfterTax);


    }
}
