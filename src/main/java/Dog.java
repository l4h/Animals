import ru.xrenovy.Animals.Animal;

public class Dog extends Animal {
    static int countDog;
    @Override
    protected void run(int distance) {
        if(distance<getMaxRunDistance()) {
            System.out.println("Dog runs " + distance + "metters");
        }else{
            System.out.println("it's so far.... i'm lazy");
        }
    }

    public Dog(){
       super(500,10);
       countDog++;
    }

    @Override
    protected void swim(int distance) {
        if(distance>getMaxSwimDistance()) {
            System.out.println("I can't run so far");
        } else{
            System.out.println("Dog can swim " + distance + "metters");
        }

    }

    public  int getCountDog() {
        return countDog;
    }
}
