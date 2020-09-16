package Homework;

public abstract class Animal {
    protected int maxRun;
    protected int maxJump;
    protected int maxSwim;

    public Animal(int maxRun, int maxJump, int maxSwim) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
        this.maxSwim = maxSwim;
    }

    public abstract boolean run(int distance);
    public abstract boolean jump(int height);
    public abstract boolean swim(int distance);


    public void printInfo () {
        System.out.println(this);
    }

    public String toString() {
        return  this.getClass().getSimpleName() +"{"+
                "maxRun=" + maxRun +
                ", maxJump =" + maxJump +
                ", maxSwim=" +maxSwim+ "}";

    }
}
