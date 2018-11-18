package podypl.Zajecia4;

public class Animals {
    public static void main(String[] args) {

        Animal[] animals = new Animal[6];
        animals [0] = new Dog("Burek");
        animals[1] = new Cat("Filemon");
        animals[2] = new Pig("Prosiaczek");
        animals[3] = new Animal();
        animals[4] = new Parrot("ara");
        animals[5] = new Fish("dorsz");

        for (Animal animal : animals){
            animal.introduce();
        }

    }
}


class Animal {
    String name;

    public Animal() {
        this.name = "bezimienny";
    }

    String showName(){
        return "zwierzę: " + name;
    }

    String makeSound(){
        return "??????";
    }

    void introduce(){
        System.out.println("Jestem  " + showName() + ": " + makeSound());
    }
}

class Dog extends Animal {

    public Dog(String name){
        this.name = name;
    }

    @Override
    String showName() {
        return "pies" + name;
    }

    @Override
    String makeSound() {
        return "hau hau";
    }

}

class Cat extends Animal{
    public Cat (String name){
        this.name = name;
    }
}




class Pig extends Animal{
    public Pig (String name){
        this.name = name;
    }

    @Override
    String showName() {
        return "świnka" + name;
    }

    @Override
    String makeSound() {
        return "chrum chrum";
    }
}

class Fish extends Animal{
    public Fish (String name) {
        this.name = name;
    }
    @Override
    String showName() {
        return "rybka" + name;
    }

    @Override
    String makeSound() {
        return "plum plum";
    }
}

class Parrot extends Animal{

    public Parrot (String name){
        this.name = name;
}
    @Override
    String showName() {
        return "papuga" + name;
    }

    @Override
    String makeSound() {
        return "Kra KRA";
    }
}