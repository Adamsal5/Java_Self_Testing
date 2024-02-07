package day07_practice_tasks;

public class EmployeeClient {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Jeff";
        employee1.age = 65;
        employee1.gender = 'M';
        employee1.jobTitle = "Banker";
        employee1.salary = 85_000;


        System.out.println("Name: " + employee1.name);
        System.out.println("Age: " + employee1.age);
        System.out.println("Gender: " + employee1.gender);
        System.out.println("Job Title: " + employee1.jobTitle);
        System.out.println("Salary: " + employee1.salary);

        employee1.work();

        System.out.println(employee1);

    }

}
