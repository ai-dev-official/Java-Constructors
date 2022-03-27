package ex3;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Mary",32);
        Person person2;

        person2=person1;
        person2.setName("Jack");
        person2.setAge(22);

        person1.print();
        person2.print();
    }
}
