import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    private final String validFirstName = "test";
    private final String validSecondName = "testerson";
    private final int validAge = 43;

    @Test(expected = IllegalArgumentException.class)
    public void whenNameContainDigit_throwException(){
        new Person("abcd123", "dfdf321", validAge);
    }

    @Test
    public void whenNameDontContainDigit_NoException(){
        getValidPerson();
    }

    @Test
    public void whenInitConstructor_thenFieldsAreUpdated(){
        Person person = getValidPerson();
        assertEquals(validFirstName, person.getFirstName());
        assertEquals(validSecondName, person.getSecondName());
        assertEquals(validAge, person.getAge());
    }

    @Test
    public void whenSetValuesWithSetters_thenFieldsAreUpdated(){
        String anotherFirstName = "deve";
        String anotherSecondName = "loper";
        int anotherAge = 20;

        Person person = getValidPerson();
        assertEquals(validFirstName, person.getFirstName());
        assertEquals(validSecondName, person.getSecondName());
        assertEquals(validAge, person.getAge());

        person.setFirstName(anotherFirstName);
        person.setSecondName(anotherSecondName);
        person.setAge(anotherAge);
        assertEquals(anotherFirstName, person.getFirstName());
        assertEquals(anotherSecondName, person.getSecondName());
        assertEquals(anotherAge, person.getAge());
    }

    private Person getValidPerson(){
        return new Person(validFirstName, validSecondName, validAge);
    }

}
