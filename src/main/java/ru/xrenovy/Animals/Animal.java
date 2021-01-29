package ru.xrenovy.Animals;

public abstract class Animal {
    private int maxSwimDistance;
    private int maxRunDistance;

    protected abstract void run(int distance);
    protected abstract void swim(int distance);

    public Animal(int maxRunDistance, int maxSwimDistance){
        this.maxRunDistance=maxRunDistance;
        this.maxSwimDistance=maxSwimDistance;

    }

    protected int getMaxSwimDistance(){
        return maxSwimDistance;
    }
    protected int getMaxRunDistance(){
        return maxRunDistance;
    }
}
