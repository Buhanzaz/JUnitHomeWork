public class Practicum {
    public static void main(String[] args) {
        Object anyObject = new Person("Иван", "Иванов", 32);
        System.out.println(anyObject);
    }
}

class Person {
    private String firstName;
    private String secondName;
    private int age;

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
}