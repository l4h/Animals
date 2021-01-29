import ru.xrenovy.Animals.Animal;

public class Cat extends Animal {
    private static int countCat;
    @Override
    protected void run(int distance) {
        if(distance>getMaxRunDistance()){
            System.out.println("sorry it's to far");
        } else {
            System.out.println("Wow, cat runs "+distance+"metters");
        }

    }

    public Cat(){
        super(200,0);
        countCat++;
    }

    @Override
    protected void swim(int distance) {
        System.out.println("Sorry this cat can't swim");
    }

    public  int getCountCat() {
        return countCat;
    }
}
