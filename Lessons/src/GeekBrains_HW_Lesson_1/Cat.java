package GeekBrains_HW_Lesson_1;

public class Cat implements Player{
    private int distance;
    private int height;

    public Cat(int distance, int height) {
        this.distance = distance;
        this.height = height;
    }

    public int getDistance() {
        return distance;
    }
    public int getHeight() {
        return height;
    }

    @Override
    public void doRun() {
        System.out.println("Cat can run.");
    }

    @Override
    public void doJump() {
        System.out.println("Cat can jump.");
    }

    @Override
    public String toString() {
        return "Cat";
    }

}
