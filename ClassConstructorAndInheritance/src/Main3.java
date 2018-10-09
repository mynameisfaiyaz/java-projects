public class Main3 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,5);

        Dog dog = new Dog("Yorkie",1,1,5,5,2,4,1,44,"fur");

        dog.eat();
        dog.walk();
        dog.run();


        Fish fish = new Fish("Nemo",1,2,5,5,1,2,3);

        fish.swim(5);

    }
}
