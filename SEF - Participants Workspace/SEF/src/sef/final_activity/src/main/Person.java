public class Person implements Humanify {

    private String firstName;
    private String secondName;
    private int age;

    public Person(String firstName, String secondName, int age) {
        checkNoNumbers(firstName);
        checkNoNumbers(secondName);
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        checkNoNumbers(firstName);
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        checkNoNumbers(secondName);
        this.secondName = secondName;
    }

    @Override
    public void introduce(){
        System.out.println("My name is " + firstName + " and i am " + age + " old");
    }

    protected static void checkNoNumbers(String s){
        for(char c : s.toCharArray()){
            if (Character.isDigit(c))
                throw new IllegalArgumentException("Input " + s + " cannot contain digits");
        }

    }
}
