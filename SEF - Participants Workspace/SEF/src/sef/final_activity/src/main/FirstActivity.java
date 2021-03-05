import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FirstActivity {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Test", "Testerson", 43);
        employee1.setSalary(43253.34);
        employee1.setCompany("BigCompany");
        employee1.setJobTitle("Assistant to the regional manager");

        Employee employee2 = new Employee("Aua", "Aesterson",
                54, "Accountant", "SmallCompany", 32343.03);

        Employee employee3 = new Employee("Deve", "Loper",
                54, "Developer", "CoolCompany", 43235.33);

        List<Employee> employees = List.of(employee1, employee2, employee3);
        employees.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
        .forEach(employee -> {
            System.out.println(employee.getSalary());
        });


        // sort by lastname then firstname
        employees.stream().sorted((e1, e2) -> {
            String fullname1 = e1.getSecondName() + e1.getFirstName();
            String fullname2 = e2.getSecondName() + e2.getFirstName();
            return fullname1.compareToIgnoreCase(fullname2);
        }).forEach(employee -> {
            System.out.println(employee.getFirstName() + " " + employee.getSecondName());
        });
    }



}
