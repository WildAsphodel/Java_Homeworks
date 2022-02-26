/**
 * Java1. Homework #6
 * 
 * @author Margarita Antonova
 * @version 27.02.2022
 */

class HomeWork6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);
        dog.run(1);
        dog.swim(9);
        cat.run(65);
        cat.swim(35);
    }
}

abstract class Animal {
    protected int maxRun;
    protected int maxSwim;

    Animal(int maxRun, int maxSwim) {
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    abstract void run(int length);

    abstract void swim(int length);
}

class Cat extends Animal {

    Cat(int maxRun, int maxSwim) {
        super(maxRun, maxSwim);
    }

    @Override
    public void run(int length) {
        if (length <= maxRun) {
            System.out.println("Cat ran " + length + " m");
        } else if (length > maxRun) {
            System.out.println("Cat cannot run more than " + maxRun + " m");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println("Cat can't swim");
    }
}

class Dog extends Animal {
    Dog(int maxRun, int maxSwim) {
        super(maxRun, maxSwim);
    }

    @Override
    public void run(int length) {
        if (length <= maxRun) {
            System.out.println("Dog ran " + length + " m");
        } else if (length > maxRun) {
            System.out.println("Dog cannot run more than " + maxRun + " m");
        }
    }

    @Override
    public void swim(int length) {
        if (length <= maxSwim) {
            System.out.println("Dog swam " + length + " m");
        } else if (length > maxSwim) {
            System.out.println("Dog cannot swim more than " + maxSwim);
        }
    }
}
