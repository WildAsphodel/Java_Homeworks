/**
 * Java1. Homework #5
 * 
 * @author Margarita Antonova
 * @version 25.02.2022
 */

class HomeWork5 {
    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Petrov Ivan", "QA", "petrov@mail.com", "89991235678", 30000, 25);
        persArray[1] = new Person("Ivanova Maria", "Support manager", "ivanovam@mail.com", "89889812225", 45000, 32);
        persArray[2] = new Person("Pavlova Anna", "Project Manageer", "pavlova@mail.com", "89235555678", 50000, 45);
        persArray[3] = new Person("Zakharov Ivan", "Support specialist", "ivanivan@mail.com", "89251239876", 30000, 22);
        persArray[4] = new Person("Antonov Petr", "Engineer", "antonov_p@mail.com", "89098357979", 60000, 48);
        System.out.println(persArray[1]);
        System.out.println("Persons over 40:");
        for (int i = 0; i < 5; i++) {
            if (persArray[i].getAge() > 40)
                System.out.println(persArray[i]);
        }
    }
}

class Person {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + position + ", " + email + ", " + phone + ", " + salary + ", " + age;
    }

    public int getAge() {
        return age;
    }
}