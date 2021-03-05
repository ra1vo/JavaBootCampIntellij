import org.junit.Test;
import static org.junit.Assert.*;
public class StudentTest {

    private final String validFirstName = "test";
    private final String validSecondName = "testerson";
    private final int validAge = 43;
    private final String validUniversity = "SmartUniversity";


    @Test
    public void whenConstruct_thenFieldsUpdate(){
        Student student = getValidStudent();
        assertEquals(validFirstName, student.getFirstName());
        assertEquals(validSecondName, student.getSecondName());
        assertEquals(validAge, student.getAge());
        assertEquals(validUniversity, student.getUniversityName());
    }

    @Test
    public void whenUseSetters_FieldsUpdate(){
        String anotherFirstName = "deve";
        String anotherSecondName = "loper";
        int anotherAge = 41;
        String anotherUniversity = "AnotherUniversity";

        Student student = getValidStudent();
        assertEquals(validFirstName, student.getFirstName());
        assertEquals(validSecondName, student.getSecondName());
        assertEquals(validAge, student.getAge());
        assertEquals(validUniversity, student.getUniversityName());

        student.setFirstName(anotherFirstName);
        student.setSecondName(anotherSecondName);
        student.setAge(anotherAge);
        student.setUniversityName(anotherUniversity);

        assertEquals(anotherFirstName, student.getFirstName());
        assertEquals(anotherSecondName, student.getSecondName());
        assertEquals(anotherAge, student.getAge());
        assertEquals(anotherUniversity, student.getUniversityName());
    }

    private Student getValidStudent(){
        return new Student(validFirstName, validSecondName, validAge, validUniversity);
    }
}
