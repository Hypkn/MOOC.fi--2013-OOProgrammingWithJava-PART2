package validation;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Age must be between 0-120");

        } else if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException();
        }
            this.age = age;
            this.name = name;
        }

    

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
