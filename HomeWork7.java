/**
 * Java1. Homework #7
 *
 * @author Margarita Antonova
 * @version 05.03.2022
 */

class HomeWork7 {
    public static void main(String[] args) {
        Plate plate = new Plate(27);
        System.out.println(plate);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Barsik", 15);
        cats[1] = new Cat("Murcia", 5);
        cats[2] = new Cat("Pushok", 23);
        cats[3] = new Cat("Busya", 7);
        for (Cat cat : cats) {
            System.out.println(cat);
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }

        plate.addFood(30);
        System.out.println(plate);
        for (Cat cat : cats) {
            System.out.println(cat);
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }
    }
}

class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    void eat(Plate plate) {
        if (fullness == false) {
            this.fullness = plate.decreaseFood(appetite);
        }
    }

    @Override
    public String toString() {
        return "Cat: " + name + ", appetite: " + appetite + ", fullness: " + fullness;
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        if (n <= food) {
            this.food -= n;
            return true;
        }
        return false;
    }

    void addFood(int n) {
        this.food += n;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}