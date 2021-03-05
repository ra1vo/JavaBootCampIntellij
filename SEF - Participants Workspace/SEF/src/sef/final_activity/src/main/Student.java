public class Student extends Person{

    private String universityName;

    public Student(String firstName, String secondName, int age) {
        super(firstName, secondName, age);
    }

    public Student(String firstName, String secondName, int age, String universityName) {
        super(firstName, secondName, age);
        this.universityName = universityName;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I study at " + universityName);
    }
}
