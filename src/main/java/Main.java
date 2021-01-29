public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        cat.run(159);
        cat.run(300);
        cat.swim(100);
        dog.run(600);
        dog.run(400);
        dog.swim(50);
        dog.swim(10);
        System.out.println("count cats:" +cat.getCountCat()+"\nDogs:" + dog.getCountDog());

    }
}
