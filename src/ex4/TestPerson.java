package ex4;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Mary",32);
        Person person2;
        Person person3 = new Person("Joe",33);

        person2=person1;
        person2.setName("Jack");
        person2.setAge(22);

        person1.print();
        person2.print();

        if(person1.getAge()>person3.getAge()){
            System.out.println(person1.getName() + " is older");
        }
        else if(person1.getAge()<person3.getAge()){
            System.out.println(person3.getName() + " is older");
        }
        else{
            System.out.println("Both persons are of the same age");
        }
    }
}
