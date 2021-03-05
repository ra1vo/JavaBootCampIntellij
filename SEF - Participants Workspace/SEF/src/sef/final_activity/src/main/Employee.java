public class Employee extends Person{

    private String jobTitle;
    private String company;
    private double salary;

    public Employee(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public Employee(String firstName, String secondName, int age, String jobTitle, String company, double salary) {
        super(firstName, secondName, age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I work as " + jobTitle + " in " + company);
    }
}
