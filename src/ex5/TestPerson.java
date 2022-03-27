package ex5;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Mary", 32);
        Person person2;
        Person person3 = new Person("Joe", 33);

        person2 = person1;
        person2.setName("Jack");
        person2.setAge(22);

        person1.print();
        person2.print();

        compareAge(person1, person3);
    }

    public static void compareAge(Person p1, Person p3) {
        if (p1.getAge() > p3.getAge()) {
            System.out.println(p1.getName() + " is older");
        } else if (p1.getAge() < p3.getAge()) {
            System.out.println(p3.getName() + " is older");
        } else {
            System.out.println("Both persons are of the same age");
        }
    }
}
