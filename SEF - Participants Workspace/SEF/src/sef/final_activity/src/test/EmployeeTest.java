import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    private final String validFirstName = "test";
    private final String validSecondName = "testerson";
    private final int validAge = 43;
    private final String validJobTitle = "senior assistant";
    private final double validSalary = 432234.43;
    private final String validCompany = "SecretCompany";

    @Test
    public void whenConstruct_thenFieldsUpdate(){
        Employee employee = getValidEmployee();
        assertEquals(validFirstName, employee.getFirstName());
        assertEquals(validSecondName, employee.getSecondName());
        assertEquals(validAge, employee.getAge());
        assertEquals(validJobTitle, employee.getJobTitle());
        assertEquals(validCompany, employee.getCompany());
        assertEquals(validSalary, employee.getSalary());
    }

    @Test
    public void whenUseSetters_FieldsUpdate(){
        String anotherFirstName = "deve";
        String anotherSecondName = "loper";
        int anotherAge = 41;
        String anotherJobTitle = "middle assistant";
        String anotherCompany = "LocalCompany";
        double anotherSalary = 234.3;

        Employee employee = getValidEmployee();
        assertEquals(validFirstName, employee.getFirstName());
        assertEquals(validSecondName, employee.getSecondName());
        assertEquals(validAge, employee.getAge());
        assertEquals(validJobTitle, employee.getJobTitle());
        assertEquals(validCompany, employee.getCompany());
        assertEquals(validSalary, employee.getSalary());

        employee.setFirstName(anotherFirstName);
        employee.setSecondName(anotherSecondName);
        employee.setAge(anotherAge);
        employee.setJobTitle(anotherJobTitle);
        employee.setCompany(anotherCompany);
        employee.setSalary(anotherSalary);

        assertEquals(anotherFirstName, employee.getFirstName());
        assertEquals(anotherSecondName, employee.getSecondName());
        assertEquals(anotherAge, employee.getAge());
        assertEquals(anotherJobTitle, employee.getJobTitle());
        assertEquals(anotherCompany, employee.getCompany());
        assertEquals(anotherSalary, employee.getSalary());
    }

    private Employee getValidEmployee(){
        return new Employee(validFirstName, validSecondName, validAge, validJobTitle, validCompany, validSalary);
    }
}
